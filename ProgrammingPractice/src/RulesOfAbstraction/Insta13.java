package RulesOfAbstraction;

abstract class Insta13 {
    // abstract void id ();
}
class Personal extends Insta13 {
    void id (){
        System.out.println("Enter the ID and Password to Login");
    }
}
class Profectional {
    public static void main(String[] args) {
        Personal P = new Personal();
        P.id();
    }
}