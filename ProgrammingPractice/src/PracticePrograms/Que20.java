package PracticePrograms;

import java.util.Scanner;
public class Que20 {
    public static void main(String[] args) {
        int n = 5, i , j , k = 1 ;
        System.out.println("Input numbers of rows ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=1 ; i<=n ; i++ ) {
            for (j = 1; j <= i; j++)
                System.out.print(k++ +" ");                     // here the increment sign increase value by 1
            System.out.println(" ");
        }
    }
}
