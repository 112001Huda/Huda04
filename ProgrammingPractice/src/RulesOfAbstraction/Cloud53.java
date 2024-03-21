package RulesOfAbstraction;

abstract class Cloud53
{
    abstract void show ();
}
class Paas extends Cloud53
{
    String s1 = "Iaas - Infrastructure as a service ";
    String s2 = "Paas - Platform as a service";
    String s3 = "Saas - Software as a service ";
    void show()
    {
        System.out.println("The types of Services is : \n     " +s1 +" \n     "+ s2 +"\n     "+s3 );
    }
}
class Saas extends Paas
{
    public static void main(String[] args)
    {
        Saas s = new Saas();
        s.show();
    }
}
