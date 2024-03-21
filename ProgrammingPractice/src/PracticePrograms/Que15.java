package PracticePrograms;

import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        int n, i, sum = 0 ;
        System.out.println("Input number : ");
        {
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println("The odd number are ");
            for (i=1 ; i<=n ; i++){
                System.out.println(2*i+1);
                sum += 2*i+1 ;
            }
            System.out.println("The sum of Odd Natural number is "+sum);

        }
    }
}
