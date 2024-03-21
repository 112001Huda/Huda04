package RulesOfAbstraction;

abstract class methods42 {
    abstract void test ();
}
abstract class Locals extends methods42 {
    void test (){
        System.out.println("Types of methods are ");
          // Locals L = new Locals();
    }
}
class Type extends Locals {
    public static void main(String[] args) {
      Type T = new Type();
      T.test();
    }
}