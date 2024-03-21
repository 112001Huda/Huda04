package Encaptulationprograms;
public class EncaptulationTest               // To Hiding the Implementation ( Data Member & variable ) from other classes.
{                                            // To hide variable we use private Access modifier.
    private int atmpin = 2001 ;              // To binding & Rapping the data in Single unit
    private int age ;
    public int getAge ()             // Getter used to get the values of properties
    {                               // Return type (Data type) is same to given variable
        return age ;
    }
    public void setAge (int age)          // setter used to set the value of properties
    {                                     // Return type is void at here .
        this.age = age;
    }
    public int getAtmpin ()
    {
        return atmpin ;
    }
    public void setAtmpin (int atmpin)
    {
        this.atmpin = atmpin;
    }
}
class TestEncaptulation
{
    public static void main(String[] args)
    {
        EncaptulationTest obj = new EncaptulationTest();
        obj.setAtmpin(2001);
        System.out.println(obj.getAtmpin());
    }
}