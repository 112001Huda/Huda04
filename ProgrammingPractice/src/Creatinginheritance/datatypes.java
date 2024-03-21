package Creatinginheritance;

class datatypes {
    String k1 = "premitive ";
    String k2 = "non-premitives";
    String k3 = "int , double , float , char , boolean , long ";
    String k4 = "class , interface , Array ";
    void show5(){
        System.out.println(" The datatypes are  ");
        System.out.println("In java there are different types in Datatypes :  1: "+k1+" 2: "+k2+"\nIn Premitive datatypes contains "+ k3 +"\nIn Non-Premitive Datatypes are "+ k4 +"");

    }
}
class returntypes extends datatypes{

    public static void main(String[] args) {
        returntypes r1 = new returntypes();
        r1.show5();
    }
}

