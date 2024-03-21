package RulesOfAbstraction;

abstract class Onlinepay43 {
    abstract void info ();
}
abstract class Gpay extends Onlinepay43 {
    void info (){
        System.out.println("There are Some types to do Online Transfer ");
    }
}
class Phonepay extends Gpay {
    public static void main(String[] args) {
        Phonepay P = new Phonepay();
        P.info();
    }
}