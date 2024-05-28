// w a p by using array and string to print the output as follows 1 = 12345    2 = 1234   3 = 123   4 = 12   5 = 1 .

package Assmentprogram;

public class ArrayStud {
    public static void main(String[] args) {
        int n = 5 ;
        String[] huda = new String[n];
        for (int i=0 ; i <n ; i++ ) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1 ; j <= n - i ;j++) {
                sb.append(j) ;
            }
            huda[i] = sb.toString();
        }
        for (int i = 0 ; i < n ; i++ ){
            System.out.println((i+1) +" : "+huda[i]);
        }
    }

}
