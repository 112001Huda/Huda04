package Creatinginheritance;

public class Vehical {
    String model ="suv" ;
    double price = 800000.08 ;
    double speed = 60.20 ;
    String color = "nevi Blue" ;
    void showtest (){
        System.out.println("The New vehical details are ");
        System.out.println("Our Model is "+model+"\nThe price of "+price+"\n The speed of car is "+speed+"\nThe new car is "+color+" in Colour");

    }
}
class cars extends Vehical{

    public static void main(String[] args) {
        cars c1 = new cars();
        c1.showtest();
    }
}
