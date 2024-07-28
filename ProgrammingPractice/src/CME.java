import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CME {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>() ;  //ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        for (String str : list) {
            list.add("G");

            System.out.println(str);
        }
    }
}
