package PolymorphismProgram;
public class PolymorphismOverloading {
    void test () {
        System.out.printf("no parameterized / Default ");
    }
    void test (int a ) {
        System.out.printf(" 1 parameterized ");
    }
    void test(int a , String b) {
        System.out.printf("2 parameterized");
    }

    public static void main(String[] args) {
        PolymorphismOverloading P = new PolymorphismOverloading();
       // P.test();       // based on the no of parameter we r passing we can tell at compile time only when method is going to call
        P.test(11 , " HUDA ");
    }

   /* static public void main(int[] args) {

    }

   *//* public void static main( double[] args) {

    }*//*

    public  void get(String[] args) {

    }*/
}
