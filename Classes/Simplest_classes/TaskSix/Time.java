package Classes.Simplest_classes.TaskSix;

public class Time {
    int hours;
    int minutes;
    int seconds;

    public void setHours(int hours) {
        if (hours >= 24 || hours < 0) {
            this.hours = 0;
        } else this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 60 || minutes < 0) {
            this.minutes = 0;
        } else this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 60 || seconds < 0) {
            this.seconds = 0;
        } else this.seconds = seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
        System.out.println("Создан объект с параметрами " + this);
    }

    public void changeHoursBy (int hr){
        if ((this.hours + hr) >= 24 || (this.hours + hr) < 0){
            this.hours = 0;
        } else this.hours += hr;
    }
    public void changeMinutesBy (int mins){
        if ((this.minutes + mins) >= 60 || (this.minutes + mins) < 0) {
            this.minutes = 0;
        } else this.minutes += mins;
    }
    public void changeSecondsBy (int sec){
        if (this.seconds + sec >= 60 || this.seconds + sec < 0) {
            this.seconds = 0;
        } else this.seconds += sec;
    }

    @Override
    public String toString() {
        return this.hours + " Часов, " + this.minutes + " Минут, " + this.seconds + " Секунд";
    }
}
