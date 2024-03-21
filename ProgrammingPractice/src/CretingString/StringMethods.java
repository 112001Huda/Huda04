package CretingString;

public class StringMethods {
    public static void main(String[] args) {
        String s = "javaProgram";                                  // String is nothing but sequence or collection of Character .
        System.out.println("Length of given string is : "+s.length());
        char [] chArray = s.toCharArray();
        for (int i = 0 ; i < chArray.length ; i++ ) {
            //  System.out.println("character at Index is "+chArray[i]);
            System.out.println("Character at Index is " + s.charAt(i));
        }
        String ss = "JavaProgramming";
        ss = ss.concat("Study ");
        String ss2 = "Python";
        System.out.println("\n" +ss);
        boolean t = ss.contains("a");
        ss = s.toLowerCase();
        System.out.println(t);
       // System.out.println("In Capital Letters : " +ss.toUpperCase());
      //  System.out.println("In Small Letters : "+ss.toLowerCase());
        System.out.println("Test meesage  " + +ss.compareTo(ss2));
        System.out.println(ss.hashCode());
        System.out.println(ss.substring(2 ,8));           // return letters bet beginning and End given  numbers of size
        System.out.println(ss.indexOf("Program"));         // Index No of the given word in given String
        System.out.println(ss.indexOf("Pro" , 1));
        System.out.println(ss.lastIndexOf("i"));         // The no of character in that given String
        System.out.println(ss.equalsIgnoreCase("Python"));
        System.out.println(ss.trim());
        System.out.println(ss.replace('a','H'));
        System.out.println(ss.getBytes());
        System.out.println(ss.substring(4));
        System.out.println(ss.toString());
        System.out.println(ss.startsWith("Ja"));
        System.out.println(ss.endsWith("dy"));
        System.out.println(ss.charAt(1));
        System.out.println(ss.length());
        System.out.println(ss2.intern());
        System.out.println(ss.substring(4));
        System.out.println(ss.equals("java"));

    }
}
