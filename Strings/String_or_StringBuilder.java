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
        //Удаляем всё лишнее -> сравниваем исходный с перевёрнутым исходным
        return word.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(word.replaceAll("\\W", ""))
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
            if (!builder.toString().contains(String.valueOf(ch))) {
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
        System.out.println(words[indexOfMax]);
    }

    static void taskNine(String str) {
        int lowerCase = 0;
        int upperCase = 0;
        for (char ch : str.toCharArray()) {
            if (ch > 96 && ch < 123) lowerCase++;
            if (ch > 64 && ch < 91) upperCase++;
        }
        System.out.println("Количество строчных (маленьких) : " + lowerCase + "\nКоличество прописных (больших) : " + upperCase);
    }

    static int taskTen(String str) {
        int sentences = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 63 || ch == 46 || ch == 33) {
                sentences++;
            }
        }
        return sentences;
    }
}
