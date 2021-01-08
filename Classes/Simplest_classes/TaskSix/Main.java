package Classes.Simplest_classes.TaskSix;

public class Main {
    public static void main(String[] args) {
        //Сначала сделал нормально, а потом по ТЗ :) теперь при выходе за границы часы, минуты и секунды сбрасываются на 0
        Time time = new Time(10, 15, 72);
        time.setHours(-2);
        time.setSeconds(40);
        time.changeHoursBy(5);
        time.changeMinutesBy(-14);
        time.changeSecondsBy(19);
        System.out.println(time);
    }
}
