//Rule4 : Access level in child class should be less restrictive then parent class .
package PolymorphismProgram;
class sample6 {
    public   void show (){
        System.out.printf("This is 4th rule of overriding ");
    }
}
public class OverrideRule4 extends sample6 {
    // private void show () {
    // void show () {
    @Override
     public void show () {
        System.out.printf(" This is child class ");
    }

    public static void main(String[] args) {
        OverrideRule4 OR =  new OverrideRule4 ();
        OR.show();
    }
}















/*if we create child class as a private then while we create reference of parent class and object of child class then we can't find reference
in parent class so */
