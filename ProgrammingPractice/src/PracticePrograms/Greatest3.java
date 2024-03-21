package PracticePrograms;

import java.util.Scanner;

public class Greatest3 {
    public static void main(String[] args) {

        System.out.println(" Take input from user ");
        Scanner sc = new Scanner(System.in);                             // take permission to accept input from user
        System.out.println("Input the 1st Number : ");
        int a = sc.nextInt();                                            // actually take / store input from used
        System.out.println("Input the 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Input the 3rd Number : ");
        int c = sc.nextInt();
        if (a > b){
            System.out.println("The Greatest Number is : " +a );
        } else if (b > c ) {
            System.out.println("The Greatest Number is : " +b);
        }
        else {
            System.out.println("The Greatest Number is : " +c );
        }
    }
}
