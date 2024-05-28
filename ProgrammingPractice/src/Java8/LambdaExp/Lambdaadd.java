package Java8.LambdaExp;
interface addition {
    void show (int a , int b );
}
public class Lambdaadd {
    public static void main(String[] args) {
        addition add = (a ,b) -> System.out.println(a + b);
        add.show(10 ,11);
    }
}
