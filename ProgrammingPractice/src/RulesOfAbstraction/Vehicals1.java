//Abstraction Rule no-1 : Its not mandatory to have abstract method in abstract class.
package RulesOfAbstraction;
abstract class Vehicals {                                          // Abstract class
    // abstract void info ();                                          // Abstract method
}
class cars extends Vehicals {
    void info ()
    {
        System.out.println("It's a black & white  coloured Range-Rover ");
    }
}
class test {
    public static void main(String[] args) {
       cars c = new cars();
        c.info();
    }
}

