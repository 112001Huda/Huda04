// if went 100% abstraction and don't want to write non-Abstract method in class then we use Interface .
package CreatingInterface;
interface In1
{
    final int a = 10 ;
    void display ();
}
class TestClass implements In1
{
    public void display ()
    {
        System.out.println("Huda");
    }
    public static void main(String[] args)
    {
        TestClass t = new TestClass() ;
        t.display();
    }
}