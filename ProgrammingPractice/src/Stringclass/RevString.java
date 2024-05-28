package Stringclass;

public class RevString {
    public static void main(String[] args) {
        String str = "Huda Inamdar";
        String rev = "";
        char ch ;

        for (int i = 0 ; i < str.length();i++){
            ch = str.charAt(i);
            rev = ch + rev ;
        }
        System.out.println("Reverse the string =  "+rev);
    }
 }
