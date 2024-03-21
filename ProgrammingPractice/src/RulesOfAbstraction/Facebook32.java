package RulesOfAbstraction;

abstract class Facebook32 {
    abstract void show ();
}
class Id extends Facebook32 {
    void show () {
        System.out.println("Enter the Correct ID and Password to Login ");
    }
}
class Password {
    public static void main(String[] args) {
        // Facebook32 f = new Facebook32();
        Id I = new Id();
        I.show();
        }
    }
