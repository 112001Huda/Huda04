// Abstraction Rule no 5 :  If concrete/non abstract class extends  abstract class,then its  manadatory for that child class to provide \n" +
                             // method implementations for abstract methods of super class.
package CreatingAbstraction;

abstract class Food {
        abstract void dummy ();
}
 class veg extends Food{
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