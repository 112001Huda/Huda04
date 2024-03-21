package PracticePrograms;

import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        int i , n ;
        System.out.println("Input number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=1 ;i <=n;i++){
            System.out.println("Number is : "+i+"  and Cube of "+i+" is : "+(i*i*i));
        }
    }
}



// formula : i*i*i