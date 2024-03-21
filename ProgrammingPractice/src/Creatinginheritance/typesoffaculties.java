package Creatinginheritance;

class typesoffaculties {
    String s1 = "science";
    String s2 = "commers";
    String s3 = "arts";
    String s4 = "for science faculties min marks required are above 80 % ";
    String s5 = "for commers faculties min marks required are above 55 % ";
    String s6 = "for arts faculties min marks required are above 32 % ";
    void show (){
        System.out.println("There are some faculties such as ");
        System.out.println("following info are about faculties \n"+s1+" : "+s4+ "\n"+s2+" : "+s5+"\n"+s3+" : "+s6+"");

    }
}
class faculties extends typesoffaculties{
    public static void main(String[] args) {
    faculties f1 = new faculties();
    f1.show();
    }
}
