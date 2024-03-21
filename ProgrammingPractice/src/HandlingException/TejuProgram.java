package HandlingException;

public class TejuProgram {
        void show () {
            System.out.println("Test");
        }
        public static void main(String[] args) {
            System.out.println("Code will execute");
            try {
                 int a = 100 / 0;
                TejuProgram are = null;
                are.show ();
            } catch (ArithmeticException  | NullPointerException | ArrayIndexOutOfBoundsException are ) {
                System.out.println("We got into catch block as we have written some code in try block which caused exception");
            }/* catch (NullPointerException ne ){
                System.out.println(" this is null Pointer Exception");
            } catch (ArrayIndexOutOfBoundsException abc){
                System.out.println("This is array index out of bound exception");
            }*/
            System.out.println("This code won`t get executed");
        }
    }
