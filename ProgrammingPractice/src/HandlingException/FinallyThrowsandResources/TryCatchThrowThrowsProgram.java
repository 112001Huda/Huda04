package HandlingException.FinallyThrowsandResources;


public class TryCatchThrowThrowsProgram  {
    /*public int divide (int a , int b ){
        if (b== 0 ) {
            throw new ArithmeticException("if u divide by zero it will occure Exception");
        }
        System.out.println(" Test the Program ");
        return a/b ;
    }*/
    public static void main(String[] args) {
    //TryCatchThrowThrowsProgram tct = new TryCatchThrowThrowsProgram();
    // tct.divide(11 , 0 );
    try {
        //tct.divide(11,0) ;
        System.out.println(11/0);
    }catch (NullPointerException ne){
        System.out.println("This is Arithmetic Exception but we give here Null pointer Exception ");
    }
    }

}
