/* Abstraction Rule no 5 :  If concrete/non abstract class extends  abstract class,then its  manadatory for that child class to provide \n" +
                                 method implementations for abstract methods of super class. */
package RulesOfAbstraction;
abstract class Food51 {
    abstract void dummy ();
}
class veg extends Food51 {
    void dummy (){
        System.out.println(" If concrete/non abstract class extends  abstract class,then its  manadatory for that child class to provide \n" +
                "            method implementations for abstract methods of super class.");
    }
}
class veg1 extends veg {
    public static void main(String[] args) {
       veg1 v = new veg1();
        v.dummy();
    }
}
