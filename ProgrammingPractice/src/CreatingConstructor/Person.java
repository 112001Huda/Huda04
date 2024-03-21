package CreatingConstructor;
public class Person {             // The name of class and constructor must be same .
    public  Person (){
        System.out.println("this is Simple default Constructor ");
    }

    public static void main(String[] args) {
        Person p = new Person() ;
    }
}
