package CreatingMultilevelInheritance;

class University {
    String s1 = "pune university";
    String s2 = " pune college";
    String s3 = "science , Commers , Arts ";
    int classroom_nos = 4 ;
    int student_no = 60 ;
    void info ()
    {
        System.out.println("The name of University is " +s1);
    }
}
class college extends University {
    void info1 ()
    {
        System.out.println("The colleges comes under University is  :  " +s2);
    }
}
class faculty extends college {
    void info2 ()
    {
        System.out.println("The faciltes comes under colles are :  "+s3);
    }
}
class classroom extends faculty {
    void info3 ()
    {
        System.out.println("In 1 facilty there are numbers of classrooms : "+classroom_nos);
        System.out.println("In 1 class the no of students are :  "+student_no);
    }
}
class student extends classroom
{
    public static void main(String[] args)
    {
        student s = new student();
        s.info();
        s.info1();
        s.info2();
        s.info3();
    }
}
