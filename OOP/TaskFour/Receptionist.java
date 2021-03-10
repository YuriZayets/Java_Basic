package OOP.TaskFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static OOP.TaskFour.Treasure.*;

public class Receptionist {
    static private boolean shoppedBefore;
    static private boolean checkedPriciestBefore;

    public static void start() {
        fillTheTreasureMap();
        System.out.println("Вы просыпаетесь в крайнемалозвёздочном придорожном отеле с пафосным названием \"Пещера\" полным решимости найти сокровища");
        System.out.println("Ещё вчера при заселении вы заметили табличку на ресепшене \"Гид по сокровищам Нокар Д.\"");
        System.out.println("Вот и сегодня подле таблички вас встречает улыбчивый Юноша \n - \"Чего желаете?\". Спрашивает он,");
        System.out.println("только одно но, нас тут в волшебном выдуманном мире пандемия тоже не пощадила, так что говори ёмко");
        System.out.println("и желательно немного в сторону. Но из плюсов всё монстры защищают сокровища с удалёнки, но им ещё доступ не настроили");
        System.out.println("Итак, скажи");
        choice();
    }

    private static void choice() {
        String answer;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("all - для доступа к списку сокровищ" +
                "\ntop - для доступа к самому ценному сокровищу" +
                "\nbuy - для ленивых, даже идти никуда не надо, просто накупить сокровищ на нужную сумму" +
                "\nleave - если хотите вернуться в ваш скучный настоящий мир");
        try {
            answer = reader.readLine();
            switch (answer) {
                case "all": {
                    showAllTreasure();
                }
                case "top": {
                    showThePriciest();
                }
                case "buy": {
                    System.out.println("А на сколько золотых брать будем? Сокровища у нас обычно от 5 до 25 золотых стоят");
                    int sum = 0;
                    try {
                        sum = Integer.parseInt(reader.readLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Принимаем тооолько физически и метаматически целые золотые монеты!");
                        choice();
                    }
                    buyTreasure(sum);
                }
                case "leave": {
                    leaving();
                }
                default: {
                    System.out.println("Пандемия. Будь краток. Что не понятно?");
                    choice();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showAllTreasure() {
        emptyStockCheck();
        System.out.println("Добре, но нас тут как сам знаешь где - смотреть можно, трогать нельзя:\n");
        for (Treasure treasure : treasureMap.keySet()) {
            System.out.println(treasure);
        }
        System.out.println("\nИ снова...");
        choice();
    }

    private static void showThePriciest() {
        emptyStockCheck();
        if (!checkedPriciestBefore) {
            System.out.println("Самое ценное ему подавай! Пункт 4 параграфа 8 сокровищеведения гласит:");
            System.out.println("\"Ценность сокровища понятие относительное в отличие от его цены\"");
            System.out.println("Что для тебя ценно? Знания, Предметы, Здоровье? Как вегда кратко");
        }
        checkedPriciestBefore = true;
        String answer;
        Treasure priciestTreasure;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("know - если в первую очередь ценишь знания" +
                "\nitem - если падок на вещички" +
                "\nhealth - если ты уже достаточно мудрый, чтобы понять, что здоровье главное" +
                "\nback - для доступа в Джой... тооо есть чтобы вернуться к предыдущему выбору");
        try {
            answer = reader.readLine();
            switch (answer) {
                case "know": {
                    priciestTreasure = getPriciestTreasure(1);
                    System.out.println("Ну вот, самое ценное сокровище со знаниями что нашлось, забирай - " + priciestTreasure);
                    treasureMap.remove(priciestTreasure);
                    break;
                }
                case "item": {
                    priciestTreasure = getPriciestTreasure(2);
                    System.out.println("Ну вот, самый ценный предмет, держи - " + priciestTreasure);
                    treasureMap.remove(priciestTreasure);
                    break;
                }
                case "health": {
                    priciestTreasure = getPriciestTreasure(3);
                    System.out.println("А говорят здоровье не купишь, держи - " + priciestTreasure);
                    treasureMap.remove(priciestTreasure);
                    break;
                }
                case "back": {
                    choice();
                }
                default: {
                    System.out.println("Ничего не понял и прекрати дышать в мою сторону, дыши внутрь себя");
                    choice();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Ещё что-нибудь?");
        choice();
    }

    private static void buyTreasure(int sum) {
        emptyStockCheck();
        if (shoppedBefore) System.out.println("Ах ты жулик в прошлый раз зажал зотолые");
        if (sum < treasureMap.values().stream().min(Integer::compare).orElse(5)) {
            System.out.println("Маловато, на сокровище не хватит");
            choice();
        }
        shoppedBefore = true;
        Random random = new Random();
        Treasure temp;
        List<Treasure> keys = new ArrayList<>(treasureMap.keySet());
        System.out.println("На " + sum + " золотых говоришь, ну, получите, распишитесь:");
        while (sum >= treasureMap.values().stream().min(Integer::compare).orElse(0)) {
            emptyStockCheck();
            if (sum > 25) {
                temp = keys.get(random.nextInt(keys.size()));
                sum -= temp.price;
                System.out.println(temp + ". Осталось " + sum + " твоих золотых");
                treasureMap.remove(temp);
            } else {
                Iterator<Treasure> iterator = treasureMap.keySet().iterator();
                while (iterator.hasNext()) {
                    temp = iterator.next();
                    if (temp.price <= sum) {
                        sum -= temp.price;
                        System.out.println(temp);
                        iterator.remove();
                    }
                }
            }
        }
        if (sum > 0)
            System.out.println("И вот тебе барбарисок на сдачу в " + sum + ", сокровища на такие деньги не купишь");
        System.out.println("И вернёмся к...");
        choice();
    }

    private static void leaving() {
        System.out.println("Вы делаете буквально 2 шага в сторону выхода выхода, как вас за ногу кусает дракон и ловко поднимает вверх головой");
        System.out.println("Вы видите на драконе остатки одежды гида по сокровищам и пытаетесь кричать что-то про защиту прав потребителей");
        System.out.println("На что дракон отвечает, что в его мире тоже существует закон о защите прав потребителей, только потребителей людишек");
        System.out.println("И он как раз намерен вас потребить");
        System.out.println("Да и вообще гида звали Нокар Д., это же дракон наоборот, чего можно было ожидать?"); // здесь должна была быть картинка "Вот это поворот"
        System.exit(0);
    }

    private static void emptyStockCheck() {
        if (treasureMap.size() == 0) {
            System.out.println("Сокровища кончились, привоз будет во вторник.");
            choice();
        }
    }

    private static Treasure getPriciestTreasure(int classCheck) {
        Treasure priciestTreasure, temp;
        Iterator<Treasure> iterator = treasureMap.keySet().iterator();
        priciestTreasure = iterator.next();//ошибка если первый элемент самый большой и при этом неподходящий тип сокровищ
        //далее Вашему внимание представлено уродское решение, поскольку мой спящий по 5 часов мозг не может придумать как сменять тип сверяемого класса динамически
        //буду рад подсказке
        if (classCheck == 1) {
            while (iterator.hasNext()) {
                temp = iterator.next();
                if (temp instanceof Knowledge) {
                    if (temp.price >= priciestTreasure.price) {
                        priciestTreasure = temp;
                    }
                }
            }
        } else if (classCheck == 2) {
            while (iterator.hasNext()) {
                temp = iterator.next();
                if (temp instanceof Item) {
                    if (temp.price >= priciestTreasure.price) {
                        priciestTreasure = temp;
                    }
                }
            }
        } else if (classCheck == 3) {
            while (iterator.hasNext()) {
                temp = iterator.next();
                if (temp instanceof Health) {
                    if (temp.price >= priciestTreasure.price) {
                        priciestTreasure = temp;
                    }
                }
            }
        }
        return priciestTreasure;
    }
}
