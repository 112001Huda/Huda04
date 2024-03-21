package PracticePrograms;

import java.util.Scanner;

public class Leap9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Year ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(+year+"\n Year is Leap Year ");
        }else {
            System.out.println(+year+"\n Year is not leap year ");
        }
    }
}
