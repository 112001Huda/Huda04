package HandlingException.FinallyThrowsandResources;

public class ThrowsandThrow {
    public int divide (int a , int b )  {

        if (b == 0) {
            throw new ArithmeticException("if any number divided by zero cause Exception ");
        }
        System.out.println("test msg ");
        return a / b ;
    }

    public static void main(String[] args) {
        ThrowsandThrow tt = new ThrowsandThrow ();
        tt.divide(10 , 0) ;
    }
}
