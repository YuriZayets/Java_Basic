package OOP.TaskOne;

import java.util.Calendar;

public class File {
    String name;
    Calendar date;
    Directory directory;

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
        date = Calendar.getInstance();
    }

    public static File create(String name, String path) {
        return new File(name, new Directory(path));
    }

    public static void rename(TextFile textFile, String newName) {
        System.out.println("Имя файла " + textFile.file.name + " изменено на " + newName);
        textFile.file.name = newName;
    }

    public static void delete(TextFile textFile) {
        textFile.file = null;
    }
}
