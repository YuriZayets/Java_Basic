package Classes.Simplest_classes.TaskOne;

public class Test1 {
    int a;
    int b;

    public Test1 (int a, int b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    void VariablesToString (){
        System.out.println("Переменная a равна : " + a +"\nПеременная b равна : " + b);
    }

    static public int getVariablesSum (Test1 test){
        return test.a + test.b;
    }

    static public int getMaxVariable (Test1 test){
        return Math.max(test.a, test.b);
    }

}
