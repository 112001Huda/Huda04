package MemoryManagement;

public class StackEg {
    static void test1 (){
        test2 () ;
        System.out.println("it's test 1 ");
    }
    static void  test2 (){
        test3 ();
        System.out.println("it's test 2 ");
    }
    static void test3 () {
        System.out.println("it's test 3 ");
    }

    public static void main(String[] args) {
        test1();
    }
}
