package CreatingMethod;

public class VariableTest {
    int age = 20 ;
    int aaa ;
    String name = "Test";
    String s ;
    void test (){
        int a = 100;
        String name = "java";
        s = "program";
        aaa = 11;
        System.out.println("The value is visible only inside the method 1 "+s);
    }
    void show (){
        System.out.println("value of this variable is visible only inside this method 2 "+name);
    }

    public static void main(String[] args) {
        VariableTest obj1 = new VariableTest();
        VariableTest obj2 = new VariableTest();
        obj1.test();
    }
}
