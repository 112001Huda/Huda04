package PracticePrograms;

import java.util.Scanner;

public class Que30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input frist number : ");
        int a = sc.nextInt();
        System.out.println("Input Second number : ");
        int b = sc.nextInt();
        System.out.println("Input Third number : ");
        int c = sc.nextInt();
        if (a == b && a == c ){
            System.out.println("All number are equal ");
        } else if (a != b && a!= c ) {
            System.out.println("All numbers are different ");
        } else {
            System.out.println("Neighter all are Equal or Different");
        }
    }
}
