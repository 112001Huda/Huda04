package CreatingConstructor;

public class Parameters {
    public Parameters (int a , String S){
        System.out.println("The type of Constructor is  "+S+" And it's a  "+a+ " program");
    }
    public static void main(String[] args) {
        Parameters P = new Parameters(1 , "Parameterized Constructor ");
    }
}