package CreatingConstructor;

public class Constructor1 {
    // This is Default Constructor .
    public Constructor1 () {                         // The name of class and constructor must be same .
        System.out.println(" This is Default constructor ");
    }
}
class Constructor2 extends Constructor1 {
    public Constructor2 () {
        System.out.println(" This is Child Constructor ");
    }
    //When we don't write any constructor in class , then compiler will provide default constructor .
       // (if we create Parameterized Constructor then developer need to Create  Default Constructor )
    public Constructor2 (int a , String s ) {
        System.out.println("Parametarized Constructor "+"a = " + a + ", s = " + s);
    }
}
class ConstructorChaining1 extends Constructor2 {
    public ConstructorChaining1() {
        System.out.println(" 1 Constructor Extends Another Constructor  : ConstructorChaining ");
    }

    public static void main(String[] args) {
        Constructor2 obj1 = new Constructor2();                 // We don't  need  to  call  Constructor ,
        Constructor2 obj = new Constructor2(22, "Huda");   //  they will get called  as soon as create an object of class .
    }
}
    //The First line in any constructor is call to Super Class Default Constructor
      //  ( even if u don't  add that line , compiler will add the line as SUPER () )