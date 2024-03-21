package RulesOfAbstraction;

abstract class Subjects52
{
    abstract void show ();
}
class English extends Subjects52
{
    void show ()
    {
        System.out.println("English is nothing but just a Language which is used for Communication ");
    }
}
class Hindi extends English
{
    public static void main(String[] args)
    {
       Hindi H = new Hindi();
       H.show();
    }
}