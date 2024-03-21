package HandlingException.uncheckedException;

// Unchecked Exception is occured during Runtime so they called as Runtime Exception

public class ArithmeticExpeptionHandling {
    public static void main(String[] args) {
        System.out.println("This is Arithmetic Exception ");
        try {
            int i = 100 / 0 ;                             // ArithmeticException
        }
        catch ( ArithmeticException e ) {
            // e.getstackTrace ()
            System.out.println("We go into catch block written code in try block Which cause Exception ");

        }
    }
}







// ArithmeticException occurs when an exceptional arithmetic condition has occurs     Eg : any number divided by zero