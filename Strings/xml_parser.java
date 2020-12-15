package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xml_parser {
    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "      <note id = \"1\">\n" +
                "       <to>Вася</to>\n" +
                "       <from>Света</from>\n" +
                "       <heading>Напоминание</heading>\n" +
                "       <body>Позвони мне завтра!</body>\n" +
                "     </note>\n" +
                "     <note id = \"2\">\n" +
                "       <to>Петя</to>\n" +
                "       <from>Маша</from>\n" +
                "       <heading>Важное напоминание</heading>\n" +
                "       <body/>\n" +
                "     </note>\n" +
                "  </notes> \n";

        System.out.println(xmlParser(xml));
    }

    static String xmlParser(String xml) {
        StringBuilder builder = new StringBuilder();
        Pattern tagOpen = Pattern.compile("<\\w.+?>");
        Pattern tagClose = Pattern.compile("</\\w+>");
        Pattern tagBody = Pattern.compile(">.+?<");
        Pattern tagEmpty = Pattern.compile("<\\w.+?/>");

        String[] strings = xml.split("\n\\s*");

        Matcher matchOpen, matchClose, matchBody, matchEmpty;
        for (String string : strings) {
            matchOpen = tagOpen.matcher(string);
            matchClose = tagClose.matcher(string);
            matchBody = tagBody.matcher(string);
            matchEmpty = tagEmpty.matcher(string);
            if (matchEmpty.find()) {
                builder.append("Тег без тела - ")
                        .append(matchEmpty.group().replace("<", "").replace("/>", ""))
                        .append("\n");
            }
            else if (matchOpen.find()) {
                builder.append("Открывающий тег - ")
                        .append(matchOpen.group().replace("<", "").replace(">", ""))
                        .append("\n");
            }
            if (matchBody.find()) {
                builder.append("Содержимое тега - ")
                        .append(matchBody.group(0), 1, matchBody.group(0).length()-1)
                        .append("\n");
            }
            if (matchClose.find()) {
                builder.append("Закрывающий тег - ")
                        .append(matchClose.group(0).replace("</", "").replace(">", ""))
                        .append("\n");
            }
        }
        return builder.toString();
    }
}


