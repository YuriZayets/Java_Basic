package OOP.TaskFive;

import OOP.TaskFive.Entity.Gift;
import OOP.TaskFive.Entity.Package;
import OOP.TaskFive.Entity.Sweets;

import static OOP.TaskFive.IO.AnswerListener.*;
import static OOP.TaskFive.IO.QuestionAsker.*;

public class Adviser {

    public static void start(){
        String answer;
        welcomeMessage();
        sweetsVarietyMessage();
        Sweets chosenSweet;
        do {
            chosenSweet = sweetsAnswerChecker(listen());
            if (chosenSweet == null) System.out.println("К сожалению не смог Вас понять, попробуйте ещё");
        } while (chosenSweet == null);
        packagesVarietyMessage(chosenSweet);
        Package chosenPack;
        do {
            chosenPack = packageAnswerChecker(listen(), chosenSweet);
            if (chosenPack == null) System.out.println("К сожалению не смог Вас понять, попробуйте ещё");
        } while (chosenPack == null);
        giftMessageAsker();
        String message = listen();
        Gift gift = new Gift.Builder(message).sweets(chosenSweet).inPackage(chosenPack).build();
        byeMessage(gift);
    }
}
