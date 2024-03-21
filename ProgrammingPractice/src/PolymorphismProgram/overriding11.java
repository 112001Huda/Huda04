/*Rule no 11 :  an overriding method can throw any unchecked exceptions , regardless of whether the overriden method throws exceptions or not.
       */

package PolymorphismProgram;
class ThrowException {
    void ThrowException () {
        System.out.println(" Can create method name same as class ");
    }
    void Test ()throws ArithmeticException {
        System.out.println("This is parent Method ");
    }
}
public class overriding11 extends ThrowException {
    void Test () throws NullPointerException {
        System.out.println("This is child Method ");
    }
    public static void main(String[] args) {
        ThrowException obj = new overriding11() ;
        obj.Test();
        ThrowException obj1 = new ThrowException () ;
        obj1.Test();


        /*try {
            overriding11 obj1 = (overriding11) new ThrowException();
            obj1.Test();
        }catch (ClassCastException cce) {
            System.out.println("This is parent class Exception ");
        }*/
    }
}
