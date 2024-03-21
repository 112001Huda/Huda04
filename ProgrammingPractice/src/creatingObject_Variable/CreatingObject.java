package creatingObject_Variable;

public class CreatingObject {
    void show()
    {
        System .out .println(" Steps of program  steps 1: creating class " + '\n'+
                "step 2 : void show statement " + '\n' +
                "step 3 : print line " + '\n' +
                "step 4 : main statement  then creating an object " + '\n' +
                "step 5 : obj show function ");
    }
    public static void main (String [] agrs){
        CreatingObject obj =new CreatingObject() ;
        obj.show() ;
    }
}
