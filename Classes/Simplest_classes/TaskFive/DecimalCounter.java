package Classes.Simplest_classes.TaskFive;

import org.w3c.dom.ls.LSOutput;

public class DecimalCounter {
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 10;
    int value;

    public DecimalCounter(int value) {
        this.value = value;
    }

    static public int initByDefault(){
        return MIN_VALUE;
    }

    static public int initRandom (){
        return (int)(Math.random()*(MAX_VALUE+1));
    }

    public void valueUP (){
        if (value == MAX_VALUE) this.value = MIN_VALUE;
        this.value += 1;
    }

    public void valueDown (){
        if (value == MIN_VALUE) value += 1;
        this.value -= 1;
    }

    public int getValue (){
        return value;
    }

    static public void showOff(DecimalCounter decimalCounter){
        System.out.println("Десятичный счётчик может быть проинициализирован значением по умолчанию : " + MIN_VALUE);
        System.out.println("Или случайным значением, например : " + (int)(Math.random()*(MAX_VALUE+1)));
        System.out.println("Значение переданного счётчика равно " + decimalCounter.value);
        decimalCounter.valueUP();
        System.out.println("Счётчик может увеличивать значение благодяра методу valueUp() " + decimalCounter.value);
        decimalCounter.valueDown();
        System.out.println("И уменьшать благодяра методу valueDown() " + decimalCounter.value);
        System.out.println("Получить значение вызвав метод getValue()");


    }

}
