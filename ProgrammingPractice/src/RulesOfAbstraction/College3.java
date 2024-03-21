//Abstraction Rule no-3 :  We can not create an object of abstract class.
package RulesOfAbstraction;
abstract class College3 {
    abstract void info ();
}
class classrooms extends College3 {
    void info () {
        System.out.println(" We can not create an object of abstract class.");
    }
}
class huda {
    public static void main(String[] args) {
        // college c =new college() ;                    // We can not create an object of abstract class.
        classrooms c = new classrooms();
        c.info();
    }
}

