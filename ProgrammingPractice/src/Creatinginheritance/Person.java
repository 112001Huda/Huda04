package Creatinginheritance;

class Person {
    int age = 21 ;
    double height = 6.0 ;
    String name ="Huda";
    int idno = 001 ;
    double salery = 80000.00 ;
    void showdetails(){
        System.out.println(" Following are the details about person");
        System.out.println("The persons info who is employee is "+"\nThe Age of employee is :- "+age+"\nThe Height of employee is :- "+height+"" +
                "\nThe Name of the employee is "+name+"\nEmployee idno is :- "+idno+"\nThe Salery is "+salery);}
    }
class employee extends Person{
    public static void main(String[] args) {
        employee e1 = new employee();
        e1 . showdetails();
    }
}