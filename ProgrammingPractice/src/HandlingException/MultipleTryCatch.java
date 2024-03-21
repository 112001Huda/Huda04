package HandlingException;

import HandlingException.CheckedException.ClassNotFound;

public class MultipleTryCatch {
    void test () {
        System.out.println("This is Null ");
    }
    public static void main(String[] args) {
        System.out.println("This msg is out of any Exception ");
        try {
            try {
                // int a = 100 / 0 ;
               // MultipleTryCatch mtc = null;
               // mtc.test();
                int [] array = new int[5] ;
                array [7] = 10 ;

                Class.forName("Exceptiontest");
            } catch (ArithmeticException a) {
                System.out.println("This is 1st Arithmetic Exception block ");
            }
        }
        /*catch (Exception e ){
            System.out.println("This is Parent Exception ");
        }*/
        catch (ArithmeticException ae ) {
            System.out.println("This is 2nd arithmetic Exceptions block ");
        } catch (NullPointerException ne ) {
            System.out.println("This is null Pointer Exception block ");
        }catch (ClassNotFoundException ce){
            System.out.println(" This is class not Exception");
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("This is array Out of bounds Exception ");
        }
        catch (Exception e ){
            System.out.println("This is Parent Exception ");
        }
    }
}


 /*The Exception is Parent class of any type of Exception in program if we can't understand the exception type and at
the end we gave the Exception in catch it will catch any kind of exception*/







/*
we can write multiple try and catch block  in one program but it will execute until the first condition satisfied remaining condition will not satisfied and
the output will not be show
*/



