package RulesOfAbstraction;
abstract class Rule12 {
    // abstract void show ();
}
class Testing extends Rule12{
      void show (){
          System.out.println("Every item comes in market after a Testing the quality of it ");
      }
}
class Test {
    public static void main(String[] args) {
        Testing T = new Testing ();
        T.show();
    }
}