//Rule8 : Within same pkg we can't override subclass of which superclass method are declared as Private or Final .
package PolymorphismProgram;
class sample5 {
    // private void show () {
    final void show (){
        System.out.printf("This is Final Method ");
    }
}
public class Override58 extends sample5 {
   /* @Override                                                  Rule5 : can't override Final method .
    void show (){
        System.out.printf(" this is child class ");
    }*/

    public static void main(String[] args) {
        Override58 o5 = new Override58();
        o5.show();
    }
}
