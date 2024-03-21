package ArrayPracticePro;

public class Que4 {
    public static void main(String[] args) {
        int[] arr = new int[]{11 , 4 , 54 ,10 ,32 ,56 , 21 ,35};
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++ ) {
            sum = sum + arr[i] ;
        }
        double avg = sum / arr.length ;
        System.out.println(" average value of array is "+ avg );
    }
}
