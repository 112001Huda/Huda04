package CreatingHierarchicalinheritance;

class college {
   String s1 = "B-tech";
   String s2 = "BE-Civil";
   String s3 = "BE-e&tc";
    void stream (){
        System.out.println("There are different faculties such as : "+s1+" , "+s2+" , "+s3+" .... ");
        System.out.println(" In this stream we will study about Technoligies ");
        System.out.println(" In this stream we will study about Constructions of Buildings  ");
        System.out.println(" In this stream we will study about Electronics nd Telecommunications ");


    }
}
class BTech extends college {

}
class BEcivil extends college{

}
class BEEandtc extends college{

}
class huda extends college {
    public static void main(String[] args) {
        huda h = new huda();
        h.stream();
    }
}