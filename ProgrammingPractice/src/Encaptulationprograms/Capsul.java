package Encaptulationprograms;
public class Capsul {
    private String St ;
    private String Ss ;
    public String getSt () {
        return St ;
    }
    public String getSs () {
        return Ss ;
    }
    public  void setSt (String St) {
        this.St = St ;
    }
    public void setSs (String Ss){
        this.Ss = Ss ;
    }
}
class test {
    public static void main(String[] args) {
        Capsul C = new Capsul() ;
        C.setSt("liquid chemical ");
        C.setSs(" Solid chemical ");
        System.out.println("The soft Capsul contains : "+C.getSt());
        System.out.println("The Hard capsul contains : "+C.getSs());
    }
}