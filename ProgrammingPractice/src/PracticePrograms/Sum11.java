package PracticePrograms;

import java.util.Enumeration;
import java.util.Scanner;

public class Sum11 {
    public static void main(String[] args) {
        int i , sum = 0  ;
            Scanner sc = new Scanner(System.in);
            System.out.println("Input Number  : ");
            int num = sc.nextInt();
            System.out.println(" The first n numbers are " + num);
            for (i =1 ; i <= num ; i++ ) {
                System.out.println( i );
                sum += i ;
            }
        System.out.println("The Sum of first "+ num + " Natural numbers are : "+ sum );
    }
}
