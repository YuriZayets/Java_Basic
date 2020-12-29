package Classes.Aggregation_and_composition.TaskOne;

public class Main {
    public static void main(String[] args) {
        Word word = new Word("First");
        Word word1 = new Word("second");
        Word word2 = new Word("third");
        Word word3 = new Word("fourth");
        Word word4 = new Word(".");
        Word word5 = new Word("New");
        Word word6 = new Word("sentence");
        Word word7 = new Word(".\n");
        Word word8 = new Word("New paragraph.\n");
        Text.printText();
    }
}
