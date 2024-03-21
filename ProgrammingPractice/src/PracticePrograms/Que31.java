package PracticePrograms;

import java.util.Scanner;

public class Que31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input frist number : ");
        int a = sc.nextInt();
        System.out.println("Input Second number : ");
        int b = sc.nextInt();
        System.out.println("Input Third number : ");
        int c = sc.nextInt();
        if (a < b && b < c) {
            System.out.println(" Increasing Number ");
        } else if (a > b && b > c ) {
            System.out.println(" Decreasing Number ");
        }else  {
            System.out.println(" Number is Neither increasing or Decreasing order");
        }
    }
}
