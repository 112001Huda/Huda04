package Creatinginheritance;

public class exams {
    String h1 = "univerity exams ";
    String h2 = "college exams ";
    String h3 = "Theory";
    String h4 = "practical ";
    void showdetails(){
        System.out.println("The Exams condected by ");
        System.out.println("The Exams have 2 types :-     "+h1+" &  "+h2+"\nThe University exams have 2 types :-       "+h3+"  &  "+h4+"");

    }
}
class university extends exams{

    public static void main(String[] args) {
        university u = new university();
        u.showdetails();
    }
}
