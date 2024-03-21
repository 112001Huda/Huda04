package Creatinginheritance;

class jobs {
    String jobs1 = "private jobs ";
    String jobs2 = "sarkari jobs ";
    double d = 120000.00;
    double d1 = 15000.00;
    void showdetails(){
        System.out.println("The types of jobs are ");
        System.out.println("The "+jobs1+"has "+d+" Salery"+"\nThe "+jobs2+"has "+d1+" Salery");

    }
}
class salery extends jobs{
    public static void main(String[] args) {
        salery s1 = new salery();
        s1 .showdetails();
    }
}