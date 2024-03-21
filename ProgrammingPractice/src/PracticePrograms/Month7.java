package PracticePrograms;
import java.util.Scanner;
public class Month7 {                                                         // Using If LADDER .
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month Number ");
        int i = sc.nextInt();
        System.out.println(" Enter a year ");
        int year = sc.nextInt();
        if (i == 1) {
            System.out.println("January " + year + " has 31 Days ");
        } else if (i == 2) {
            if ((year % 4 == 0)) {
                System.out.println("February" + year + " has 29 days");
            } else {
                System.out.println("february" + year + " has 28 days");
            }
        } else if (i == 3) {
            System.out.println("March " + year + " has 31 days ");
        } else if (i == 4) {
            System.out.println("April" + year + " has 30 days");
        } else if (i == 5) {
            System.out.println("May " + year + " has 31 days");
        } else if (i == 6) {
            System.out.println(" June " + year + " has 30 days ");
        } else if (i == 7) {
            System.out.println("July " + year + " has 31 days ");
        } else if (i == 8) {
            System.out.println("August " + year + " has 31 days ");
        } else if (i == 9) {
            System.out.println(" September " + year + " has 30 days ");
        } else if (i == 10) {
            System.out.println(" October " + year + " has 31 days ");
        } else if (i == 11) {
            System.out.println(" November " + year + " has 30 days ");
        }else if (i == 12 ) {
            System.out.println(" December " + year + " has 31 days ");
        }
    }
}
