package Classes.Aggregation_and_composition.TaskOne;

import java.util.ArrayList;

public class Sentence {
    StringBuilder builder = new StringBuilder();
    String sentence;
    static ArrayList<String> sentences = new ArrayList<>();
    Boolean isEndOfAParagraph;

    public Sentence(ArrayList<String> words) {
        for (String word : words) builder.append(word).append(" ");
        sentence = builder.toString();
        if (sentence.contains("\n")) {
            new Sentence(true, words); //suboptimal but whatever
        } else sentences.add(sentence);
        builder.setLength(0);
    }

    public Sentence(Boolean isEndOfAParagraph, ArrayList<String> words) {
        for (String word : words) builder.append(word).append(" ");
        sentence = builder.toString();
        if (sentence.contains("\n")) {
            isEndOfAParagraph = true;
        }
        if (isEndOfAParagraph) {
            sentences.add(this.sentence);
            Text text = new Text(sentences);
            sentences.clear();
        }
        this.isEndOfAParagraph = false;
        builder.setLength(0);
    }
}
