package Classes.Aggregation_and_composition.TaskOne;

import java.util.ArrayList;

public class Word {
    String word;
    static ArrayList<String> words = new ArrayList<>();
    Boolean isEndOfASentence;

    public Word(String word) {

        if (word.contains(".")) {
            Word word1 = new Word(word, true);
        } else {
            this.word = word;
            words.add(this.word);
        }
    }

    public Word(String word, Boolean isEndOfASentence) {
        this.word = word;
        if (word.contains(".")) {
            isEndOfASentence = true;
        }
        if (isEndOfASentence) {
            words.add(this.word);
            Sentence sentence = new Sentence(words);
            words.clear();
        }
        this.isEndOfASentence = false;
    }

}
