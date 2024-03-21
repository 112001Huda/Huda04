package PracticePrograms;

import java.util.Scanner;

public class Que27 {
    public static void main(String[] args) {
        int i , n ;
        System.out.println("Input the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n < 0){
            System.out.println(" Number is Negative ");
        } else if (n > 0) {
            System.out.println(" Number is Positive ");
        }else
            System.out.println(" Zero ");
    }
}
