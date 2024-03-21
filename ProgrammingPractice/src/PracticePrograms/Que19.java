package PracticePrograms;
                                                   // outer loop = rows       Inner loop = columns
 public class Que19 {
     public static void main(String[] args) {
         int n = 4, s = 1, k = 1;
         s = n + 10 - 1;                            // here the no defines the space
         for (int i = 1; i <= n; i++) {                         // shows rows
             for (k = s; k != i; k--) {                         // shows columns
                   System.out.print(" ");
             }
             for (int j = 1; j <= i; j++) {
                     System.out.print( i+" ");
                 }
             System.out.println("");

             }
         }
     }

