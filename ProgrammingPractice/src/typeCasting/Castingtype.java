package typeCasting;
class Parentcast{
    void show (){
        System.out.println("Parent class method ");
    }
}
public class Castingtype extends Parentcast {
    @Override
    void show() {
        System.out.println("child class method");
    }
    void test () {
        System.out.println("method present in only child class");
    }

    public static void main(String[] args) {
        Parentcast p = new Castingtype();                   // Upcasting  : Parentclass ref = new Childclass ();  [ parents reference and childs object ]
        p.show();

        Castingtype c = (Castingtype) new Parentcast();      // Downcasting : Childclass ref = (Childclass) new Parentclass ();
        c.show();
        c.test();             // this method will not show the o/p bec we create a object of parent class but this method is
    }                              // present in only child class not in parent class .
}


// it is runtime exception

/*
 java doesn't allow Downcasting Bec In downcasting we create referance of child class but create object of parent class
 some methods are written in only in child class which are not present in parent class  so at compile time we found the
 method at child class but at runtime we can't find the method at parent class it don't show o/p it make confusing  .
 */
