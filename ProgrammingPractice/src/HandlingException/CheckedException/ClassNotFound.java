package HandlingException.CheckedException;

// checked Exception is occured during compile time so they called as Compile time Exception .

public class ClassNotFound {
    void show () {
        System.out.println("Java Exception Test ");
    }
    public static void main(String[] args) {
        try {
            Class.forName("ExceptionTest");                    // using NewInstance () method of object Creating
        } catch (ClassNotFoundException e) {
          //  throw new RuntimeException(e);
       }
        ClassNotFound c = new ClassNotFound ();
        c.show();
    }
}
