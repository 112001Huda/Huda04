package PracticePrograms;

import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        int i , n ;
        System.out.println("Input the Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=0 ; i<=10 ; i++){
            System.out.println( n+" * " + i + " = " +(n*i) );
        }
    }
}
