// Static is non-access modifier
package StaticKeyword;
public class Static1 {
    int a = 100 ;                                           // instance variable
    static int b = 200 ;                                    // Static variable
    static int c= 300;
    void show () {
        int c = 300 ;                                       // Local variable
        System.out.println("This is instance method ");
    }
    static void test () {
        System.out.println("this is static method ");
    }

    public static void main(String[] args) {
        Static1 S = new Static1() ;
        S.show();                                     // instance methods
        test();                                       // Static method   ( For static method we don't need to create an object )
    }
}
