package CretingString;

public class Que2 {
    public static void main(String[] args) {
        String str = "JavaProgramming";
        int[] charcount = new int[256];                            // 256 : ascii value
         for (int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            charcount[ch]++;
        }
        for (int i = 0; i < charcount.length; i++) {
            if (charcount[i] > 0) {
                System.out.println("The Character " + (char) i + "  occurs  " + charcount[i] + "  of times .");
            }
        }
    }
}