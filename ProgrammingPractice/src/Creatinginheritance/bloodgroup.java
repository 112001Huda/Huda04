package Creatinginheritance;

class bloodgroup {
    String s1 = "a+";
    String s2 = "b+";
    String s3 = "ab+";
    String s4 = "o+";
            void showdetails(){
                System.out.println("The Blood groups has types");
                System.out.println("There are some types of blood groups such as :- " +s1 + "    "  +s2+ "    " +s3+ "    " +s4+"   ");

            }
}
class types extends bloodgroup{
    public static void main(String[] args) {
        types t1 = new types();
        t1.showdetails();
    }
}
