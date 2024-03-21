package CreatingHybridInheritance;
class UniversityHybrid {
    String s1 = "pune university";
    String s2 = " pune college";
    String c1 = "B-tech";
    String c2 = "BE-Civil";
    String c3 = "BE-e&tc";
    int classroom_nos = 4 ;
    int student_no = 60 ;
    void info (){
        System.out.println("The name of University is " +s1);
    }
}
class college extends UniversityHybrid {
    void info1 (){
        System.out.println("The colleges comes under University is  :  " +s2);
        System.out.println("There are different faculties such as : "+c1+" , "+c2+" , "+c3+" .... ");
    }
}
class BTech extends college {
    void info3 () {
        System.out.println("In this faculty we will learn about Technology ");
    }
}
class BEcivil extends college {

}
class BEEandtc extends college {

}
class huda extends college {
    public static void main(String[] args) {
        huda h = new huda();
        h.info();
        h.info1();
//        h.info3();
    }
}
