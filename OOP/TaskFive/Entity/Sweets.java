package OOP.TaskFive.Entity;

public enum Sweets {
    CAKE("Пирог с черникой", 3), COOKIE("Печенье с шоколадом", 1), BISCUIT("Бисквит с яблоками", 3), CANDIES("Конфеты шоколадные", 1),
    ICE_CREAM("Мороженное с мятой", 1), PUDDINGS("Ягодный пудинг", 1), FRUITS("Фруктовый букет", 2),
    CHOCOLATE("Шоколада \"Алёшка\"", 1), DOUGHNUTS("Набор пончиков", 2), PASTRIES("Выпечка с начинками", 2);
    private String tag;
    private int size;


    Sweets(String tag, int size) {
        this.tag = tag;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getSweetTag() {
        return tag;
    }
}
