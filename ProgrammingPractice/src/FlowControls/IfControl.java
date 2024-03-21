package FlowControls;

public class IfControl {
    public static void main(String[] args) {
        /*int a =10 ;
        if( a > 11){
            System.out.println("a is greater then 9 ");
        }
        else {
            System.out.println("a is less then 9");
        }*/
        for (int a = 1; a <= 20; a++) {
            if (a * 2 == 0) {
                System.out.println("print the statement " + a);
            }
            else {
                System.out.println("print a = " +a);
            }
        }
    }
}

