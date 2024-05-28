package ArrayPracticePro;

public class CountecachElem {
    public static void main(String[] args) {
        int count = 0;
        String str = "Huda Inamdar";
        str=str.toLowerCase();
        for(char i=0;i<=256;i++){
            for(int j=0;j<str.length();j++){
                if (str.charAt(j)==i){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(i+"=="+count);
                count=0;
            }

        }

    }
}
