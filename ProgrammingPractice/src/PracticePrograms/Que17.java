package PracticePrograms;

import java.util.Scanner;

public class Que17 {
    public static void main(String[] args) {
        int i , j , k ;
        System.out.println("Input number : ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        for (i = 1 ; i <= k ; i++ ){
            for (j = 1 ; j<= i ; j++)
                System.out.print(+i);
            System.out.println(" ");
        }
    }
}
