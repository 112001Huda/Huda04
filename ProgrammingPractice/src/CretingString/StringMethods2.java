package CretingString;

public class StringMethods2 {
    public static void main(String[] args) {
        String s = "12345";
        String s1 = "6789";
        String s2 = "";
        boolean b = s.contains("java");                                             //To check given data is present or not in string
        System.out.println("The given data is available in string or not :  " +b);
        System.out.println(s.equals("12345"));                                     //To check given data is same to given string
        System.out.println(s.toString());                                         //To print the given string
        System.out.println(s.length());                                           //To print the length of given string
        System.out.println(s.startsWith("1"));                                    //To check the Start point of string
        System.out.println(s1.endsWith("8"));                                     //To check the End point of string
        System.out.println(s.intern());
        System.out.println(s.concat("huda"));                                // Add new data in String
        System.out.println(s2.isEmpty());                                       // To check the String is empty or not
        System.out.println(s.length());
    }
}
