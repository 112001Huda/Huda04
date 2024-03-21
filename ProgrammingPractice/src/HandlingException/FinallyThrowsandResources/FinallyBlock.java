package HandlingException.FinallyThrowsandResources;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 100 / 0 ;
        }catch (Exception e){
            System.out.println("Catch block Executed");
        }finally {
            System.out.println("Finally block Executed ");
        }/*finally{
            Why we can't use multiple finally in one try block : yes in one try we can use only one finally block .
        }*/



        try {
            Class cls = Class.forName("Exception");
        }  catch (ClassNotFoundException e) {
            // throw new RuntimeException(e);
        }finally {
            System.out.println("Class not found Exception");
        }



        try {                                    // If we write try block and directly finally block the block will be executed but it
            int h = 10/0 ;                       // shows and exception while run the program .
        }finally {
            System.out.println(" arithmetic Finally block executed ");
        }
    }
}





/*
  try  :   1
  catch :   (0 or more )
  finally :  (0 or 1)*/

