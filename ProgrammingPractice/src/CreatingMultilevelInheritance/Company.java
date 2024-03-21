package CreatingMultilevelInheritance;

class Company {
    String s1 = "Infosys";
    double d = 4000000.00 ;
    double d1 = 980000.00 ;
    double d2 = 30000.00 ;
    void show (){
        System.out.println("The name of company is " +s1 );
    }
}
class Ceo extends Company {
    void show1() {
        System.out.println("    The salery of CEO in "+s1+" is : "+d);
    }
}
class manager extends Ceo {
    void show2 (){
        System.out.println("    The salery of Manager in "+s1+" is : "+d1);
        System.out.println("    The salery of Employee in "+s1+" is : "+d2) ;
    }
}
class employee extends manager {
    public static void main(String[] args) {
        employee e = new employee();
        e.show();
        e.show1();
        e.show2();
    }
}

