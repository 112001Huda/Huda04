// A Variable can holds multiple values of same data types .
package CreatingArray;
public class SimpleArray {
    public static void main(String[] args) {
        // There are 2 types to create array
        int Aa [] = {10 , 20 , 30 , 40 , 50, 60};            // Array
        int maxIndex = Aa.length - 1 ;
        System.out.println("Size of Array is " +maxIndex);    // o/p :- 6 Bec Array is Index based data structor & is start from 0
        System.out.println("Testtt  " + Aa[3]);


        double[] ddd = new double[10];                         //datatype[] variablename = new datatype[size];
        ddd[0] = 10;
        ddd[1] = 20;
        ddd[2] = 30;
        ddd[3] = 40;
        ddd[4] = 50;
        System.out.println("Showww  "+ddd[2]);


        String []  cars = {"Range Rover ","Land Cruser ","Land Rover","Hummer"};
        System.out.println("there are " +cars.length+" cars");
    }
}
