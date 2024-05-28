package Java8.FunctionalInterfaces;
@FunctionalInterface
interface MyFunctionalinterface {
    void show ();
}
public class FunctionalInterface1 {
    public static void main(String[] args) {
        MyFunctionalinterface mfi = new MyFunctionalinterface() {
            @Override
            public void show() {
                System.out.println("This is my Functional Interface ");
            }
        };
        mfi.show();
    }
}
