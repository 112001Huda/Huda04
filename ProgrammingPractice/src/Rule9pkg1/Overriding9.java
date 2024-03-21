package Rule9pkg1;
public class Overriding9 {
     protected void show (){
         System.out.printf("this is rule no  9");
     }

    public static void main(String[] args) {
        Overriding9 O9 = new Overriding9() ;
        O9.show();
    }
}
