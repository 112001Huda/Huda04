package CreatingHierarchicalinheritance;
 class Testing {
    String s1 = "Functional ";
    String s2 = "Non-Functional";
    void Show (){
        System.out.println("The testing have two types : "+s1+" "+s2);
    }
}
class Functional extends Testing {
     void show1 (){
         System.out.println("Functional Testing are : ");
     }
}
class Regression extends Functional {
    /* void show2 (){
         System.out.println("   Regression Testing is type of testing ");
     }*/

}
class Retesting extends Functional {

}
class Smoke extends Functional {

}
class Sanity extends Functional {
    public static void main(String[] args) {
        Sanity S = new Sanity();
        S.Show();
        S.show1();
    }
}