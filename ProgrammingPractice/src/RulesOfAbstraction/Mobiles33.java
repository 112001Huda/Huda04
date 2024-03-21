package RulesOfAbstraction;

abstract class Mobiles33 {
    abstract void info ();
}
class Android extends Mobiles33 {
    void info (){
        System.out.println("The Samsung is an Android Mobile ");
    }
}
class Samsung {
    public static void main(String[] args) {
     Android A =new Android();
     A.info();
    }
}