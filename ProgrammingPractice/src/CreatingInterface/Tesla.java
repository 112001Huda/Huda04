package CreatingInterface;

public interface Tesla {
   public abstract void info ();
}
interface Honda {
}
interface BMW {
}
interface Cars extends  Tesla , Honda ,BMW {           // 1 interface can extends 1 or more interface
}
class Drive implements Cars
{
    public void info ()
    {
        System.out.println("1 interface can extends one or interfaces ");
    }

    public static void main(String[] args)
    {
        Drive D = new Drive();
        D.info();
    }
}
