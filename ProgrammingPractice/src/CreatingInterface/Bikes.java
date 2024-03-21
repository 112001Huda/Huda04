package CreatingInterface;

public interface Bikes
{
    final String s = "Hornet";
    void show ();
}
class Hornet implements Bikes
{
    public void show ()
    {
        System.out.println(s);
        System.out.println(" is a good sport Bike ");
    }

    public static void main(String[] args)
    {
        Hornet H = new Hornet();
        H.show();
    }
}