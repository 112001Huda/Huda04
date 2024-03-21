package ArrayPracticePro;

class Test {
    void show() {
        System.out.println(" hello overriding ");
    }
}
class Program extends Test {
    @Override
    void show() {
        System.out.println("show the output");
    }
    public static void main(String[] args) {

        Test t1 =  new Program();
        t1.show();
    }
}
