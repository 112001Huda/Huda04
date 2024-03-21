package Creatinginheritance;

class TypesofAnimal
{
    String type = "wild ";
    String color = "orange";
    String voice = "roar";
    String name ="tiger";
    void showdetails()
    {

        System.out.println("find the animal by there color , type & voice ");
        System.out.println("The animal Type is wild or pet ?\n     : "+type+"\nThe color of animal :- "+color+"\n The voice of animal is "+voice+"\n The Name of animal is "+name);

    }

}
class wildanimals extends TypesofAnimal
{
    public static void main(String[] args)
    {
        wildanimals w1 = new wildanimals();
        w1.showdetails();
    }
}
