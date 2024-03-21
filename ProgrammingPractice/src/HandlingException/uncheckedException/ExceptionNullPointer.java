package HandlingException.uncheckedException;

  // This exception is occurs when u attempt to access null Value .


public class ExceptionNullPointer {
    public static void main(String[] args) {
        System.out.println("This is unchecked Exception ");


        // This is null pointer Exception .

       /*  String s = null ;
        int len1 = s.length();*/


        try {
            String s1 = null ;
            int len = s1.length();
        }
        catch (NullPointerException e ) {
            System.out.println("This is null Pointer Exception ");
        }


       /* String s = null ;
        System.out.println(s.length());*/
    }
}
