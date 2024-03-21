package Creatinginheritance;

class languages {
    String java = "programming language " ;
    String webdesigning = "scripting language " ;
    String c = "Also a programming language ";
    void showdetails(){
        System.out.println("The types of language are ");
        System.out.println("The java is "+java+ "\nThe web-designing is "+webdesigning+"\n The c is "+c);

    }
}
class programminglang extends languages{
    public static void main(String[] args) {
        programminglang p1 = new programminglang();
        p1.showdetails();
    }
}
