package CretingString;

public class Que3 {
    public static void main(String[] args) {
        String s = "Java";
        int [] count = new int[256];
        int i ;
        for (i = 1 ; i <s.length() ; i++ ){
            char ch = s.charAt(i);
            count [ch]++ ;
            i = i + 1 ;
        }
        System.out.println(+i);
    }
}
