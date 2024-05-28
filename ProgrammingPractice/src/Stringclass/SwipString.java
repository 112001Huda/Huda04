package Stringclass;

public class SwipString {
    public static void main(String[] args) {
        String a = "Huda";
        String b = "Inamdar";

        System.out.println("");

        a = a + b ;

        b = a.substring(0,a.length()-b.length());

        a = a.substring(b.length());

        System.out.println("after swaping \n a  : "+a+" b : "+b);

    }
}
