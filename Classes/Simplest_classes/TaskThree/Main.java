package Classes.Simplest_classes.TaskThree;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("IvanovII", 1, 8,8,9,10,3);
        students[1] = new Student("PetrovPP", 2, 9,9,8,9,8);
        students[2] = new Student("GaussCF", 1, 10,10,10,10,10);
        students[3] = new Student("ArmweakLS", 2, 6,4,5,6,7);
        students[4] = new Student("MothersfriendsonAP", 2, 10,9,10,9,10);
        students[5] = new Student("SvensenSS", 1, 8,7,8,9,10);
        students[6] = new Student("AzinovPE", 2, 7,7,7,7,7);
        students[7] = new Student("WhizzkidsonSW", 1, 9,10,10,9,9);
        students[8] = new Student("ASimetricsonA", 2, 1,2,3,2,1);
        students[9] = new Student("SleepingfivehoursadaysonME", 1, 2,2,2,2,2);
        Student.printSwots(students);
    }


}
