package StaticKeyword;

public class Static2 {
    int a = 10 ;
    static int b = 11 ;

    public static void main(String[] args) {
        Static2 s2 = new Static2() ;
        s2.a = 100 ;
        s2.b = 200 ;

        Static2 s3 = new Static2();
        s3.a = 300 ;
        s3.b = 400 ;

        Static2 S4 = new Static2() ;
        S4.a = 500 ;
        S4.b = 600 ;

        Static2 S5 = new Static2() ;
        S5.a = 700 ;
        S5.b = 110 ;

        System.out.println(s2.a);
        System.out.println(s2.b);

        System.out.println(s3.a);
        System.out.println(s3.b);

        System.out.println(S4.a);
        System.out.println(S4.b);

        System.out.println(S5.a);
        System.out.println(S5.b);
    }
}



 /*O/p :- The o/p of program will be different for all instance object but Same for all static object .
 for static object  1 copy for all class but in instance copy for all objects are different
 static object call the last provided value   */