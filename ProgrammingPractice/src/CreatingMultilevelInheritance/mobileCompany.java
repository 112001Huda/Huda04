package CreatingMultilevelInheritance;

class mobileCompany {
    String s1 = "android";
    String s2 = "iphone";
    void mobile(){
        System.out.println("The types of mobile are : "+s1+"  ,  "+s2);
    }
}
class android extends mobileCompany {
    void mobile1 (){
        System.out.println(" In android mobiles there are no of companies such as samsung , realme , huawei ... ");
    }
}
class samsung extends android{
    void mobile2 (){
        System.out.println(" There are different Series in mobile in Samsung as A-Series , S-Series , F-Series .... ");
    }
}
class samsungA53 extends samsung {
    public static void main(String[] args) {
        samsungA53 s = new samsungA53();
        s.mobile();
        s.mobile1();
        s.mobile2();
    }

}
