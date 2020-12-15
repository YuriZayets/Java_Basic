package Strings;

import java.util.*;

public class StringSorter {
    public static void main(String[] args) {
        String example = "Этот роман написан в стихотворной форме и является центральным в творчестве Пушкина. Поэт писал его на протяжении восьми лет и отразил в произведении быт и нравы русского общества накануне декабристского восстания. \n" +
                "Главный герой, чье имя получил и сам роман – Евгений Онегин. Это молодой столичный франт, привыкший получать от жизни все, не прикладывая при этом никаких усилий. Он попадает в деревню и пытается себя развлечь. Принимая участие в приемах, он говорит умные речи, но на самом деле знания Евгения поверхностны. \n" +
                "Онегин совсем не глуп, он наделен интеллектом, способностью критически мыслить, ему также не чужда определенная доля романтизма. Но главная его черта, на мой взгляд – это эгоизм. Он озабочен лишь собственными переживаниями и ничьи беды его больше не волнуют. Об этом ярко свидетельствует дуэль Онегина с Ленским. Ведь они общались и были если не друзьями, то приятелями. Евгению ничего не стоило свести ссору с молодым поэтом на «нет», ведь он сам был в ней виноват, заигрывая с возлюбленной Ленского. Но он не стал этого делать и убил поэта на дуэли. \n" +
                "Так же он поступает и с влюбленной в него Татьяной. Провинциальная девушка по наивности открыла ему свое сердце, а Евгений пренебрег ее чувствами. Позже он путешествует в поисках смысла жизни, старается найти себя. Когда же герой возвращается в столицу, он встречает Татьяну замужней женщиной. Она сильно изменилась, стала неприступной и гордой. Тогда он сам признается ей в любви, но Татьяна не принимает его признаний. \n" +
                "Пушкин переплел в своем романе множество линий. Это и неразделенная любовь, и моральная увечность аристократии, и несостоятельность давно укоренившегося крепостнического строя. Автор очень точно описал окружающую его действительность. Читая строки романа, проникаешься сочувствием к героям, переживаешь вместе с ними. А благодаря красивому слогу его хочется перечитывать снова и снова. ";
//        System.out.println(sortParagraphsBySentences(example));
//        System.out.println(sortSentencesByWordLength(example));
//        System.out.println(sortWordsBySymbol(example, 'а'));

    }

    //Явный недостаток этих методов - потеря знаков препинания т.к. мы делим предложения и слова регуляркой, но не запоминаем что-где было

    static String sortParagraphsBySentences(String text) {
        String[] paragraphs = text.split("\n");
        for (String s : paragraphs) System.out.println("Paragraph : " + s);
        int count = 0;
        int[] numberOfSentences = new int[paragraphs.length];
        for (String paragraph : paragraphs) {
            int sentenceCounter = 0;
            String[] sentences = sentenceSplitter(paragraph);
            for (String sentence : sentences) sentenceCounter++;
            numberOfSentences[count] = sentenceCounter;
            count++;
        }
        System.out.println(Arrays.toString(numberOfSentences));
        int max;
        int indexOfMax;
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < numberOfSentences.length; j++) {
            max = 0;
            indexOfMax = 0;
            for (int i = 0; i < numberOfSentences.length; i++) {
                if (numberOfSentences[i] > max) {
                    max = numberOfSentences[i];
                    indexOfMax = i;
                }
            }
            builder.append(paragraphs[indexOfMax]).append("\n");
            numberOfSentences[indexOfMax] = 0;
        }
        return builder.toString();
    }

    static String sortSentencesByWordLength(String text) {
        String[] sentences = sentenceSplitter(text);
        String[] words;
        StringBuilder textBuilder = new StringBuilder();
        StringBuilder sentenceBuilder = new StringBuilder();
        for (String sentence : sentences) {
            words = sentence.split("(\\s|,|–|:)\\s*");
            sentenceBuilder.setLength(0);
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length - i - 1; j++) {
                    if (words[j].length() > words[j + 1].length()) {
                        String tmp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = tmp;
                    }
                }
            }
            for (String word : words) {
                sentenceBuilder.append(word).append(" ");
            }
            textBuilder.append(sentenceBuilder).append("\b").append(". ");
        }
        return textBuilder.toString();
    }

    static String sortWordsBySymbol(String text, char symbol) {//если раскомментировать soutы будет немного понятнее, кажется я слегка замудрил, но работает :)
        String[] sentences = sentenceSplitter(text);
        String[] words;
        List<String> alphabetSorter = new ArrayList<>();
        int[] numberOfSymbols;
        int count, max;
        StringBuilder textBuilder = new StringBuilder(),
                sentenceBuilder = new StringBuilder(),
                wordsBuilder = new StringBuilder();
        for (String sentence : sentences) {
            words = sentence.split("(\\s|,|–|:)\\s*");
            numberOfSymbols = new int[words.length];
            count = 0;
//            System.out.println(Arrays.toString(words));
            for (String word : words) {
                numberOfSymbols[count] = (int) word.chars().filter(ch -> ch == symbol).count();
                count++;
            }
//            System.out.println(Arrays.toString(numberOfSymbols));
            max = 0;
            for (int symbolsInWord : numberOfSymbols) {
                if (symbolsInWord > max) max = symbolsInWord;
            }
            sentenceBuilder.setLength(0);
//            System.out.println("Максимальное количество совпадений в слове : " + max);
            for (int i = max; i >= 0; i--) {
                alphabetSorter.clear();
                for (int j = 0; j < numberOfSymbols.length; j++) {
                    if (i == numberOfSymbols[j]) {
                        alphabetSorter.add(words[j]);
                    }
                }
                alphabetSorter.sort(String::compareToIgnoreCase);
//                System.out.println("Сортированный массив слов : " + alphabetSorter + " Вхождений : " + i);
                wordsBuilder.setLength(0);
                for (String s : alphabetSorter) {
                    wordsBuilder.append(s).append(" ");
                }
                sentenceBuilder.append(wordsBuilder);
            }
//            System.out.println("Конец предложения");
            textBuilder.append(sentenceBuilder).append("\b").append(". ");
        }
        return textBuilder.toString();
    }

    static String[] sentenceSplitter(String input) {
        return input.split("\\s*(\\. |\\? |!|\n)\\s*");
    }
}
