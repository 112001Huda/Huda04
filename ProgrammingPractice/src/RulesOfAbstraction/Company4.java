/*Abstraction Rule no-4 : If one abstract class extends another abstact class, then its not manadatory for that child class to provide
                                 method implementations for abstract methods of super class.*/
package RulesOfAbstraction;
abstract class Company4 {
    abstract void info();
}
abstract class employee extends Company4 {
    void info ()
    {
        System.out.println(" If one abstract class extends another abstact class, then its not manadatory for that child class to provide\n" +
                " method implementations for abstract methods of super class.");
        // employee e =new employee();

    }
}
class teju extends employee {
    public static void main(String[] args) {
        teju t = new teju();
        t.info();
    }
}

