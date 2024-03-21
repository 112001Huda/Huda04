package CreatingInterface;

public interface Color {
    public abstract void test ();
   // public abstract void test1();
}
interface Black {

}
interface Blue {
}
interface Red {
}
class white implements Black , Blue , Red
{            // 1 class can implement 1 or more interface.
    public void test ()
    {
        System.out.println("There are 12 colors but i like black & nevi blue color");
    }
}
class sky extends white
{                                                     // 1 class can extend only one class.
    public static void main(String[] args)
    {
        sky s = new sky();
        s.test();
    }
}
/*                                                    1 class can extend only one class
class sky  extends pink {

}*/