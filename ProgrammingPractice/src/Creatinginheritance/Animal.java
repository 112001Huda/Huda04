package Creatinginheritance;

public class Animal
{
    double height = 3.1;
    String color = "black" ;
    String eats = "milk" ;
    void showdetails()
    {

      System.out.println("The animals is a wild or pet ? ");
        System.out.println("Details about dog is :- \n Height of dog is " +height+ " ft"+" \n Color of dog is : "+color+ "\nThe food of dog is :- "+eats );

    }
}
class Dog extends Animal
{                              // child class extends parent class

    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1 . showdetails();
    }
}
