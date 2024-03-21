package HandlingException.uncheckedException;
class ClassCastException {
    void show (){
        System.out.println("Parent class method ");
    }
}
class Castingtype extends ClassCastException {
    @Override
    void show() {
        System.out.println("child class method");
    }
    void test () {
        System.out.println("method present in only child class");
    }

    public static void main(String[] args) {
        ClassCastException p = new Castingtype();                  // Upcasting  : Parentclass ref = new Childclass ();
        p.show();                                                    //             parent class reference = childclass object .



try {
    Castingtype c = (Castingtype) new ClassCastException();
    c.show();
    c.test();
}
catch (java.lang.ClassCastException e) {
    System.out.println("This statement is in the Exception ");
}

     /*   Castingtype c = (Castingtype) new ClassCastException();
        c.show();                                                        This is Class cast Exception ;lp
        c.test();*/

    }
}




// classcast Exception is occurs at downcasting  bec in downcasting we gives reference of child class and create object of parent class
// but we can't extend parent with child we can't occure properties of child class in parent class