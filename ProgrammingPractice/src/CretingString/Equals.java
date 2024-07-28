package CretingString;

public class Equals
{
    public static void main(String[] args) {
        String s = new String("Java");
        String s1 = "Java";

        System.out.println(s.equals(s1));          // it checks actual content in string

        System.out.println(s == s1);              // it checks refecrence of string

        /*

        String s2 = new String("Java");

        System.out.println(s == s );
        */

    }
}
