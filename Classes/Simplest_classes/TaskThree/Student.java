package Classes.Simplest_classes.TaskThree;

public class Student {
    String surnameAndInitials;
    int groupNumber;
    int[] academicPerformance;

    public Student(String surnameAndInitials, int groupNumber, int... academicPerformance) {
        this.surnameAndInitials = surnameAndInitials;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    static public void printSwots (Student ... students){
        System.out.println("Список отличников:");
        for (Student student : students){
            if (swotCheck(student)){
                System.out.println("Студент : " + student.surnameAndInitials + " из группы №" + student.groupNumber);
            }
        }
    }

    private static boolean swotCheck (Student student){
        for (int performance : student.academicPerformance){
            if (performance < 9) return false;
        }
        return true;
    }
}
