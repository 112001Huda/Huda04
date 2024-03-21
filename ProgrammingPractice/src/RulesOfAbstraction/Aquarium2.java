//Abstraction rule no-2 : If we define any abstract method in a class, then that class must be abstract class.
package RulesOfAbstraction;
abstract class Aquarium1 {                     // abstract class
    abstract void survivels ();                // Abstract method
}
class fish extends Aquarium1 {
    void survivels() {
        System.out.println("Aquarium fishes survives max 3 - 5 years ");
    }
}
class Amphibians {
    public static void main(String[] args) {
       fish f = new fish();
        f.survivels();
    }
}


