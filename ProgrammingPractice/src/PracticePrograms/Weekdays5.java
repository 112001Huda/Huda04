package PracticePrograms;

import java.util.Scanner;

public class Weekdays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input Number : ");
        int a = sc.nextInt();
        switch (a){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }


        //BY using  NESTED IF  .

       /* if (a == 1){
            System.out.println("Monday ");
        } if (a == 2) {
            System.out.println("Tuesday");
        } if (a == 3) {
            System.out.println("Wednesday ");
        } if ( a == 4 ){
            System.out.println("Thirsday");
        } if ( a == 5 ) {
            System.out.println("Friday ");
        } if ( a== 6 ) {
            System.out.println("Saturday ");
        }if (a == 7)  {
            System.out.println("Sunday");
        }*/
    }
}
