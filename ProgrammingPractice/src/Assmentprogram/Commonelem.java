package Assmentprogram;

public class Commonelem {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {10, 9, 8, 6, 5};
        int arr3[] = {1, 3, 5, 7, 9, 11};


        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                for (int k = 0 ;k <arr3.length ; k++)
                {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]){

                        System.out.println(arr3[k]);
                    }
                }
            }

          /*  for (int k = 0; k < arr3.length; k++) {
                if (arr3[k] == currentelement){
                    */
                }
            }

        }
