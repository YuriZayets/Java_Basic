package OOP.TaskOne;

public class Main {
    public static void main(String[] args) {
        TextFile example = TextFile.create("Sad_story",
                "D:\\Story_storage\\Sad_story.txt",
                "Жили да были два очень дружных огурчика, они проводили кучу времени вместе и в один из таких совместных дней," +
                        "один из друзей оступился на тротуаре, упал на проезжую часть и его сбил грузовик, повреждения были ужасающими." +
                        "К счастью скорая приехала быстро и их обоих доставили в больницу, где после томительных часов ожидания к" +
                        "здоровому огурчику вышел врач и сказал : У меня для тебя две новости - хорошая и плохая." +
                        "Хорошая новость в том что твой друг выживет, он будет здесь чтобы увидеть новый день, но" +
                        "плохая новоть в том, что он навсегда останется овощем.");
        example.addContent(":(");
        TextFile.rename(example, "new_name");
        System.out.println();
        example.printContent();
        System.out.println();
        TextFile.delete(example);
    }
}
