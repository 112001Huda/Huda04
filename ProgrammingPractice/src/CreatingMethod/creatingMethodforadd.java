package CreatingMethod;

import java.util.Arrays;
public class creatingMethodforadd {
    public int addnumbers (int a ,int b){
        int sum = a + b ;
        return sum ;
    }

    public static void main(String[] args) {
        int num1 = 11 ;
        int num2 = 10 ;
        creatingMethodforadd obj = new creatingMethodforadd();
        int result = obj.addnumbers(num1 ,num2 );
        System.out.println("sum of given num is " +result );
    }
}
