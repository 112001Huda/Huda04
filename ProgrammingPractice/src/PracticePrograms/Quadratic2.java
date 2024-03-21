package PracticePrograms;

public class Quadratic2 {
    public static void main(String[] args) {
        double a = 1 ;
        double b = 5 ;
        double c = 1 ;
        double d =  b * b - 4 * a * c ;
        if (d > 0) {
            double d1 = (-b + Math.sqrt(d))/(2 * a);
            double d2 = (-b - Math.sqrt(d))/(2 * a);
            System.out.println("The root are "+d1+ "and " +d2);
        } /*else if (d == 0) {
            double d1 = b/(2 * a);                         // from denomenator we take 2 as numerator so we devide it by 10 so the value at here is 0.2
            System.out.println("Root is" +d1);
        }*/
        /*else {
            System.out.println(".");
        }*/
    }
}
