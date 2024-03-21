package CreatingClass;

public class nestedclass {
    public String a ="To Print The String  " ;
    class huda {
        void info() {
            System.out.println("The Implementation is " + a);
        }
    }
        public static void main(String[] args) {
            nestedclass obj = new nestedclass ();
            nestedclass. huda in = obj.new huda ();
            in.info();
    }
}
