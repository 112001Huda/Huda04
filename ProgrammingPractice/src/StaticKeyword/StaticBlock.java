// for static method we don't need MAIN method and No need to create object of block to call
package StaticKeyword;
public class StaticBlock {
    static {
        System.out.println("This is Static block And for static block we don't need to create an object and No need of MAIN method to run");
    }

    public static void main (String[] args) {

    }
}
/* class Blocks extends StaticBlock {
    public static void main(String[] args) {

    }
}
*/