package PracticePrograms;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        int i , sum = 0 , num = 0 ;
        double avg ;
        {
            System.out.println(" Input 5 Number : ");
        }
        for (i = 1 ; i <= 5 ; i++ ){
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            sum += num ;
        }
        avg = sum / 5 ;
        System.out.println("The Sum of 5 no is : "+sum+"\n The Average is : "+avg );
    }
}
