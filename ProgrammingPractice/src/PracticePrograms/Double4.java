package PracticePrograms;

import java.util.Scanner;

public class Double4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        double a = sc.nextDouble();
       // double a = 25 ;
        if (a > 0) {
            if (a < 1) {
                System.out.println(" Positive small No " );
            } else if (a > 1000000) {
                System.out.println("Large No" );
            } else {
                System.out.println("Positive no " );
            }
        } else if (a < 0) {
            if (Math.abs(a) < 1) {
                System.out.println(" Negative Small " );
            } else if (Math.abs(a) > 1000000) {
                System.out.println(" Negative Large " );
            } else {
                System.out.println(" Negative " );
            }
        } else {
            System.out.println(" Zero " );
        }
    }
}


        /*      System.out.println(" Zero ");
        }
        else if (a > 0 ){
            System.out.println(" Positive ");
        }
        else {
            System.out.println("Negative");
        }*/





