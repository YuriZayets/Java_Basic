package OOP.TaskFour;


import java.util.HashMap;
import java.util.Random;

public class Treasure {
    private static final Random randomizer = new Random();
    private static final String[] adjectives = {"Смертоносный", "Великолепный", "Ослепительный",
            "Такой что выкинуть вроде бы жалко, но и ценности большой не представляет",
            "Радужный", "Мерцающий", "Дедушкин", "Слегка с душком", "Явно не новый", "Заморский",
            "Жуткий", "Непревзойдённый", "Совершенный", "Смехотворный"};
    private static final String[] knowledge = {"букварь", "словарь", "томик",
            "подкаст", "факт того что хлоропласты содержат хлорофил",
            "учебник", "видеоурок", "связанный учитель", "птица говорун"};
    private static final String[] health = {"фиал", "флакон", "склянка","набор первой помощи",
            "молебен. А вдруг?", "детский набор \"Лоботомия спящим родителям\"",
            "подорожник", "крем звёздочка", "пилюль \"Плацебобо\" и его знаменитая реклама \"Если бобо - Плацебобо\""};
    private static final String[] items = {"топор", "меч Арагорна, кажется бутафорский", "лук", "палка стреляющая раз в год",
            "лавровый венок", "ломик", "посох Тора, как молот только посох", "сапог того, кто не смог", "картофель в мундире",};
    int price;
    String name;
    static HashMap<Treasure, Integer> treasureMap = new HashMap<>();

    private Treasure(int price) {
        this.price = price;
        if (this instanceof Knowledge) {
            this.name = adjectives[randomizer.nextInt(adjectives.length)] + " " + knowledge[randomizer.nextInt(knowledge.length)];
        } else if (this instanceof Health){
            this.name = adjectives[randomizer.nextInt(adjectives.length)] + " " + health[randomizer.nextInt(health.length)];
        } else this.name = adjectives[randomizer.nextInt(adjectives.length)] + " " + items[randomizer.nextInt(items.length)];
        treasureMap.put(this, price);
    }

    public static void fillTheTreasureMap (){
        int typePicker;
        for (int i = 0 ; i < 100; i ++){
            typePicker = (int)(Math.random() * 3);
            if (typePicker == 0){
                Treasure treasure = new Knowledge((int)(Math.random() * 20) + 5);
            } else if (typePicker == 1){
                Treasure treasure = new Health((int)(Math.random() * 20) + 5);
            } else {
                Treasure treasure = new Item((int)(Math.random() * 20) + 5);
            }
        }
    }

    @Override
    public String toString() {
        return name + " за " + price  + " золотых";
    }

    static class Knowledge extends Treasure {

        public Knowledge(int price) {
            super(price);
        }
    }

    static class Health extends Treasure {

        public Health(int price) {
            super(price);
        }
    }

    static class Item extends Treasure {

        public Item(int price) {
            super(price);
        }
    }
}
