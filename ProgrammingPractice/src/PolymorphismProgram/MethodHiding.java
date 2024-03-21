package PolymorphismProgram;

public class MethodHiding {
}
class Superclass {
    static void staticMethod() {
        System.out.println("Static method in Superclass");
    }
}

class Subclass extends Superclass {
    static void staticMethod() {
        System.out.println("Static method in Subclass");
    }
}

 class Main {
    public static void main(String[] args) {
        Superclass obj1 = new Subclass();
        obj1.staticMethod(); //subclass
        Subclass obj2 = new Subclass();
        obj2.staticMethod();//subclass
    }
}
