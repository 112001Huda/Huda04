package ProgramPractice;

public class Que21 {
    public static void swapNumberswithtemp(int a, int b) { //using 3rd variable
        int temp = a;
        a = b;
        b = temp;
    }

    /* public static void swapNumberswithouttemp(int a, int b) {//without using 3rd variable
         b = b + a;
         a = b - a;
         b = b - a;
     }*/
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapNumberswithtemp(a, b);
        System.out.printf("%d %d", a, b);
    }
}
