// Rule2 : same method signature as parent class .
// Rule7 : Method can't override if it's not inherited .
package PolymorphismProgram;
class simple1 {
    void test(int a , int b){
        System.out.printf("Addition of two numbers are ");
    }
}
//public class overridingRule2 {
public class overridingRule27 extends simple1 {              // Rule7 : Method can't override if it's not inherited
    @Override
    void test(int a, int b) {                              // Rule2 : same method signature as parent class .
        super.test(a, b);
        System.out.printf("a+b = "+(a+b));
    }

    public static void main(String[] args) {
        overridingRule27 o = new overridingRule27 ();
        o.test(10,11);
    }
}
