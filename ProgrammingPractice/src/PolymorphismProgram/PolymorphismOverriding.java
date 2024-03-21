//Overriding use :- if i already have a same method in parent class then why we write same method in
                      //child class: if we want to change implementation in the parent class and child class
//Rule 1 : we can only override in only subclass (childclass) , not in same class .

package PolymorphismProgram;
class Simple {
      void test() {
        System.out.printf(" \n This is Parent class");
    }
}

public class PolymorphismOverriding  extends Simple {
    //@Override                                       //Rule 1 : we can only override in only subclass (childclass) , not in same class .
    void test() {
        System.out.printf(" This is child class");
    }
    public static void main(String[] args) {
        PolymorphismOverriding P1 = new PolymorphismOverriding ();
       //  Simple s = new Simple();
        P1.test();
      //   s.test();
    }
}