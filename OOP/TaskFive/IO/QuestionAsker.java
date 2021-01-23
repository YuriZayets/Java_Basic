package OOP.TaskFive.IO;

import OOP.TaskFive.Entity.Gift;
import OOP.TaskFive.Entity.Sweets;
import OOP.TaskFive.Entity.Package;

public class QuestionAsker {

    public static void welcomeMessage(){
        System.out.println("Магазин Неслипнется приветствует Вас!\nЯ консультант РобОлег буду рад помочь с выбором!");
    }

    public static void sweetsVarietyMessage(){
        System.out.println("Сегодня в продаже:");
        for (Sweets sweet : Sweets.values()){
            System.out.println(sweet.getSweetTag());
        }
        System.out.println("Что-нибудь понравилось?");
    }

    public static void packagesVarietyMessage(Sweets sweet){
        System.out.println("Из тех упаковок что у нас есть по размеру вашего подарка могу предложить:");
        for (Package packs : Package.values()){
            if (packs.getSize() >= sweet.getSize()) System.out.println(packs.getPackageTag());
        }
        System.out.println("Что-нибудь понравилось?");
    }
    public static void giftMessageAsker(){
        System.out.println("Хотите отправить сообщение вместе в подарком?\nЕсли нет, то просто нажмите Enter");
    }

    public static void byeMessage(Gift gift){
        System.out.println("Спасибо что выбрали нас, сформирован следующий подарок:");
        System.out.println(gift.toString());
    }
}
