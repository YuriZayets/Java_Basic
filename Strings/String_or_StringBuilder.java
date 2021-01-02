package Strings;


public class String_or_StringBuilder {

    public static void main(String[] args) {
    }

    static int taskOne(String str) {
        int max = 0;
        int current = 0;
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                current = 0;
            }
        }
        //проверка на случай если max пробелы стоят в конце
        if (current > max)
            max = current;
        return max;
    }

    static String taskTwo(String str) {
        StringBuilder builder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            builder.append(ch);
            if (ch == 'a') builder.append('b');
        }
        return builder.toString();
    }

    static boolean taskThree(String word) {
        String regex = "\\W";
        return word.replaceAll(regex, "")
                .equalsIgnoreCase(new StringBuilder(word.replaceAll(regex, ""))
                        .reverse().toString());
    }

    static void taskFour() {
        String str = "Информатика";
        String cake = str.charAt(7) + str.substring(3, 5) + str.charAt(7);
        System.out.println(cake);
    }

    static int taskFive(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a') count++;
        }
        return count;
    }

    static String taskSix(String str) {
        StringBuilder builder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            builder.append(ch).append(ch);
        }
        return builder.toString();
    }

    static String taskSeven(String str) {
        str = str.replaceAll("\\s", "");
        StringBuilder builder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (builder.indexOf(String.valueOf(ch)) == -1) {
                builder.append(ch);
            }
        }
        return builder.toString();
    }

    static void taskEight(String str) {
        String[] words = str.split(" ");
        int maxSize = 0;
        int indexOfMax = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxSize) {
                maxSize = words[i].length();
                indexOfMax = i;
            }
        }
        if (words.length > 0) {
            System.out.println(words[indexOfMax]);
        } else System.out.println("В строке нет слов");
    }

    static void taskNine(String str) {
        int lowerCase = 0;
        int upperCase = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') lowerCase++;
            if (ch >= 'A' && ch <= 'Z') upperCase++;
        }
        System.out.println("Количество строчных (маленьких) : " + lowerCase + "\nКоличество прописных (больших) : " + upperCase);
    }

    static int taskTen(String str) {
        int sentences = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '?' || ch == '.' || ch == '!') {
                sentences++;
            }
        }
        return sentences;
    }
}
