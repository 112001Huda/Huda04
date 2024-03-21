package Encaptulationprograms;
public class FormFilling {
    private String Name ;                   // not needy to gives values to variable at here can provide value directly in set method .
    private String CollegeName ;
    private int Rollno  ;
    public String getName (){
        return Name ;
    }
    public void setName (String Name) {
        this.Name = Name ;
    }
    public String getCollegeName () {
        return CollegeName ;
    }
    public void setCollegeName (String CollegeName) {
        this.CollegeName = CollegeName ;
    }
    public  int getRollno (){
        return Rollno ;
    }
    public  void setRollno (int Rollno) {
        this.Rollno = Rollno ;
    }
}
class Form {
    public static void main(String[] args) {
        FormFilling F = new FormFilling() ;
        F.setName("Sneha");
        F.setCollegeName("ESM");
        F.setRollno(1101);
        System.out.println("Name =  "+F.getName());
        System.out.println("College Name =  "+F.getCollegeName());
        System.out.println("Roll no =  "+F.getRollno());
    }
}