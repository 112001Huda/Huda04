package HandlingException.FinallyThrowsandResources;



public class Test {
    static void demo() throws Exception{
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        try {
            demo();
        }
        catch (Exception e){
            System.out.println("done");
        }
        //System.out.println(10.0/0);
    }
}
