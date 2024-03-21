package HandlingException.FinallyThrowsandResources;

public class TryCatchvsThrow {
    public int divide(int a, int b) throws Exception{
        if (b == 0) {

            throw new ArithmeticException("Int can not be divided by zero int number");
        }
        System.out.println("Test message");
        //  int d = a/b;
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        TryCatchvsThrow obj = new TryCatchvsThrow ();
        // obj.divide(100,0);
        try{
            obj.divide(100,0);
        } catch (Exception Ee){
            System.out.println("Catch block");
            //try catch
            throw new ClassNotFoundException("Large Number divided by zero so we got exception ");
        }

        System.out.println("Execution of program continues");

    }
}
