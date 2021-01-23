package OOP.TaskFive.IO;

import OOP.TaskFive.Entity.Package;
import OOP.TaskFive.Entity.Sweets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnswerListener {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String listen(){
        String answer = "";
        try {
           answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }

    public static Sweets sweetsAnswerChecker(String answer){
        for (Sweets sweet : Sweets.values()){
            if (sweet.getSweetTag().equals(answer)){
                return sweet;
            }
        }
        return null;
    }

    public static Package packageAnswerChecker(String answer, Sweets sweet){
        for (Package pack : Package.values()){
            if (pack.getSize() >= sweet.getSize()) {
                if (pack.getPackageTag().equals(answer)) {
                    return pack;
                }
            }
        }
        return null;
    }


}
