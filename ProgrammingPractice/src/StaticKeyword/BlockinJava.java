
package StaticKeyword;
public class BlockinJava {
    static {                                                                 // Static block
        System.out.println("This is static block ");
    }
       // for static block no need to create object of it
     {
        System.out.println("This is Non-Static / Instance block ");          // Instance block
    }
    public BlockinJava (){                                                  // Constructor
        System.out.println("This is Constructor");
    }
    void test (){
        System.out.println("This is method in class ");                 // simple method  / Local method
    }
    public static void main(String[] args) {
       // System.out.println("This is Main method ");
        BlockinJava B = new BlockinJava();
        B.test();
        System.out.println("This is Main method ");                      // Main method
    }
}





//static block  -> main method  -> object create -> instance block -> constructor
//want to print message before main method execution starts?
//  --->  if we want to print output before main method Statement then we use STATIC block