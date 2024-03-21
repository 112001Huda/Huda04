package CreatingInterface;
public interface Animal {                             // in interface we can't write implementation
    public abstract void show ();
    // public abstract void show1 ();
}
interface dog {
    public abstract void show1 ();
}
interface cat {
    public abstract void show2 ();
}
interface lion {
}
class pet implements dog , cat , lion {
    public void show() {
        System.out.println("This is an 1st interface  ");
    }
    public void show1() {
        System.out.println("This is an 2nd interface ");
    }
    public void show2() {
        System.out.println("This is an 3rd interface ");
    }
}
class Wild extends pet{
    public static void main(String[] args) {
        Wild w = new Wild();
        w.show();
        w.show1();
        w.show2();
    }
}