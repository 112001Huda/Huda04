package CreatingHybridInheritance;

public class MobileCompanies {
    String s1 = "android";
    String s2 = "samsung";
    String s3 = "a53 , a73 , m32 , m51 , f12 , f13 ";
    void show (){
        System.out.println("The types of mobiles are : ");
    }
}
class Android extends MobileCompanies {
    void teju (){
        System.out.println("There are some types of Mobiles "+s1);
    }
}
class Samsung extends Android {                                           // Multilevel  Inheritance
    void teju1 (){
        System.out.println("The Samsung is a Android Mobile ");
    }
}
class SamsungA53 extends Samsung {

}
class SamsungA73 extends Samsung {

}
class SamsungM32 extends Samsung {                                 // hierarchical Inheritance

}
class SamsungM51 extends Samsung {

}
class types extends SamsungM51                                     // single inheritance
{
    public static void main(String[] args) {
        types t = new types();
        t.show();
        t.teju();
        t.teju1();
    }
}