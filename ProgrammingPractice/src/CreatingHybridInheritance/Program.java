package CreatingHybridInheritance;
class Program {
    String s1 = "class";
    String s2 = "veriable : - instance , local , static  ";
    String s3 = "Method  :- instance , local , static ";
    void info (){
        System.out.println(" In programs we Write the code  ");
    }
}
class classes extends Program {                         // single Inheritance
    void info1 () {
        System.out.println(" The class is collection of veriables , Methods & return type");
    }
}
class veriables extends classes {                       // MultiLevel Inheritance
    void info2 () {
        System.out.println(" In java they provides different types of veriables to make understanding Easy");
    }
}
class Instances extends veriables {

}
class Statics extends veriables {                                  // Hierarchical Inheritance

}
class locals extends veriables {

}
class methods extends classes {
    void info3 () {
        System.out.println(" To make understanding and coding easy java provides types of methods ");
    }
}
class Teju extends veriables {
    public static void main(String[] args) {
        Teju t = new Teju();
        t .info();
        t.info1();
        t.info2();
    }
}