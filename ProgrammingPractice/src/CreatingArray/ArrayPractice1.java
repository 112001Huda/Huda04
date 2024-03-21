package CreatingArray;

public class ArrayPractice1 {
    public static void main(String[] args) {
        int[] input = {10,9,8,7,6,5,4};
        //length = 7    0 to 6
        int[] Arraya = new int[input.length];     // 4,5,6,7,8,9,10
        int index = 0;
        for(int i = input.length - 1; i >=0; i--){
            //i = 6
            Arraya[index] = input[i];
            index++;
        }

        for(int i = 0; i < Arraya.length -1; i++){
            System.out.println(Arraya[i]);
        }
        // if we want to print the last digit of array
        // 1 :

        for ( int i = 0 ; i < Arraya.length ; i++ ){
            System.out.println(Arraya[i]);
        }
        // 2 :

        for (int i = 0 ; i<= Arraya.length ; i++ ){
            System.out.println(Arraya[i]);
        }
    }
}
