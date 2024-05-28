package Java8.LambdaExp;

import java.util.List;
interface lambdafun{
    void test ();
}
public class Lambdaexpression {
    public static void main(String[] args) {
      lambdafun  l = () -> System.out.println(" This is Lambda Expression" );
      l.test();
    }
}
