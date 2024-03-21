// Rule 3 : Return type must be same for both parent & child class .
package PolymorphismProgram;
class simple2{
    int test (int a){
        return a ;
    }
}
public class Overriding3 extends simple2{
    @Override
    int test(int b) {                         // Rule 3 : Return type must be same for both parent & child class .
        return b;
    }
    public static void main(String[] args) {
        System.out.printf("division of 2 no ");
        Overriding3 o4 = new Overriding3() ;
       // o4.test(10);
    }
}
