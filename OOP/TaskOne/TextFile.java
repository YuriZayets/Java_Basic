package OOP.TaskOne;

public class TextFile {
    String text;
    File file;

    public TextFile(String text, File file) {
        this.text = text;
        this.file = file;
    }

    public static TextFile create(String name, String path, String text) {
        return new TextFile(text, File.create(name, path));
    }

    public static void rename(TextFile textFile, String newName) {
        File.rename(textFile, newName);
    }

    public static void delete(TextFile textFile) {
        System.out.println("Файл с именем " + textFile.file.name + " удаляется");
        File.delete(textFile);
    }

    public void printContent() {
        System.out.println(this.text);
    }

    public void addContent(String addition) {
        this.text += " " + addition;
    }

}
