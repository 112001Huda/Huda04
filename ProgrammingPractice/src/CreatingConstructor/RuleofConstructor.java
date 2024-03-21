// SUPER KEYWORD  :  super keyword is used to display the first line of super class default Constructor.
package CreatingConstructor;
public class RuleofConstructor {
    public RuleofConstructor (){
        System.out.println("This is Default Constructor ");
    }

    public class Rules1 extends RuleofConstructor {
        public Rules1 (int i ){
            System.out.println("Parameterized Constructor "+"i = " + i );
        }
    }
    public static void main(String[] args) {
        RuleofConstructor R = new RuleofConstructor() ;
    }
}
