package CreatingClass;

public class classwithinclass
{
    private int data =30;
    class inner{
        void msg ()
        {
            System.out.println("data is " + data);
            System.out.println("For nested class steps are create class create method then create another class" +
                    "\n then actual implementation , main method , create obj , call the obj, call the method " );
        }
    }

    public static void main(String[] args)
    {
        classwithinclass obj = new classwithinclass();
        classwithinclass.inner in =obj . new inner();
        in.msg();
    }
}
