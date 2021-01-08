package Classes.Simplest_classes.TaskOne;

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1(1,2);
        Test1 test2 = new Test1(2,3);
        Test1 test3 = new Test1(3,4);
        Test1 test4 = new Test1(5,6);

        System.out.println(Test1.getMaxVariable(test1));
    }
}
