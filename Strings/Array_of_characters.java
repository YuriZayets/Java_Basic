package Strings;

public class Array_of_characters {

    public static void main(String[] args) {
    }

    static String[] taskOne(String[] camelCased) {
        String[] snake_cased = new String[camelCased.length];
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < camelCased.length; j++) {
            builder.setLength(0);
            char[] charTemp = camelCased[j].toCharArray();
            for (char c : charTemp) {
                if (Character.isLowerCase(c)) {
                    builder.append(c);
                } else {
                    builder.append("_");
                    builder.append(Character.toLowerCase(c));
                }
                snake_cased[j] = builder.toString();
            }
        }
        return snake_cased;
    }

    static String taskTwo(String str) {
        return str.replace("word", "letter");
    }

    static int taskThree(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    static int taskFour(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                count++;
                for (int j = i; j < chars.length; j++) {
                    if (Character.isDigit(chars[i])) {
                        i++;
                    } else break;
                }
            }
        }
        return count;
    }

    static String taskFive(String str) {
        return str.replaceAll("[\\s]{2,}", " ").trim();
    }
}
