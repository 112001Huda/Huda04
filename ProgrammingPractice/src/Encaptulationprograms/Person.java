package Encaptulationprograms;

import java.util.Arrays;

public class Person {
    private String S ;
    private int I ;
    private Double D ;
    public String getS (){
        return S ;
    }
    public int getI (){
        return I ;
    }
    public Double getD () {
        return D ;
    }
    public void setS (String S) {
        this.S = S ;
    }
    public void setI (int I) {
        this.I = I ;
    }
    public void setD (Double D) {
        this.D = D ;
    }
}
class show {
    public static void main(String[] args) {
        Person p = new Person();
        p.setS(" Huda ");
        p.setI(22);
        p.setD(91.8805112001);
       /* p.setS("sona ");
        System.out.println("The name of person is : " +p.getS());*/
        System.out.println("The Name of person is : " +p.getS());
        System.out.println("The Age of person is  : " +p.getI());
        System.out.println("The Mo. No. of person is : " +p.getD());
    }
}