package CreatingHybridInheritance;

class Bhosle {
    String a = "shahaji" ;
    String a1 = "sambhaji";
    String a2 = "shivaji";
    String a3 = "dharmvirsambhaji";
    String a4 = " Shahu ";
    void test (){
        System.out.println("The Tree diagram of Bhosle Family is as follows  ");
    }
}
class shahaji extends Bhosle {
    void test1 (){
        System.out.println("Shahaji maharaj has two childs "+ a1 +"  &  "+a2 );
    }
}
class sambhaji extends shahaji {

}
class shivaji extends shahaji {
    void test2 (){
        System.out.println(" CHATRAPATI SHIVAJI maharaj has a child name as  :   "+a3);
    }
}
class dharmavirsambhaji extends shivaji {
    void test3 (){
        System.out.println("Dharmvirsambhaji maharaj has a chils named as  : "+a4);
    }
}
class shahu extends dharmavirsambhaji {
    public static void main(String[] args) {
        shahu s = new shahu();
        s.test();
        s.test1();
        s.test2();
        s.test3();
    }
}
