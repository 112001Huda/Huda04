package CreatingMultilevelInheritance;

 class Animal1 {                                        // this is grandparent class
    String specility = " Bark " ;
    Boolean canwekeepaspet ;
    void show (){
        System.out.println(" The animal is wild or pet ?");
    }
}
class dog extends Animal1{                                      // this is parent claa
    void show1 (){
        String d = "dog";
        System.out.println(" if it's safe to keep the animal then it's pet animal for example :   " + d);
        System.out.println(" Dog is a pet Animal ");
    }
}
class puppy extends dog {                                         // this is child class
    public static void main(String[] args) {
        puppy p1 = new puppy();
        p1.show();
        p1.show1();
    }
}
