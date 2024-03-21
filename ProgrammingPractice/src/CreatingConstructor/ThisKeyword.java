package CreatingConstructor;
class c1{
    public c1(){
        System.out.printf(" this is default constructor ");
    }
    public c1 (String a ){
        this("java",19);
        System.out.printf("\n This is 1 parameterized constructor");
    }
    public c1(String a , int b){
       // this();
        System.out.printf("\n This is 2 parameterized Constructor");
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        c1 c = new c1( "java");
    }
}