package Classes.Aggregation_and_composition.TaskOne;

import java.util.ArrayList;

public class Text {
    StringBuilder builder = new StringBuilder();
    String heading;
    private static String text = "";

    public Text(ArrayList<String> sentences) {
        for (String word : sentences) {
            builder.append(word).append("\n");
        }
        text += builder.toString();
        builder.setLength(0);
    }

    static public String getText() {
        return text;
    }

    static public void printText() {
        System.out.println(text);
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getHeading() {
        return heading;
    }
}
