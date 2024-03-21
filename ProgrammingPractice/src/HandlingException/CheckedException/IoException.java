package HandlingException.CheckedException;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class IoException {
    public static void main(String[] args) throws Exception {
      try {
          String s = " Huda " ;
        byte [] bytes ;
        bytes = s.getBytes(s);
        System.out.println("huda");}
      catch (Exception e){
          System.out.println(e);
      }
    }
}
