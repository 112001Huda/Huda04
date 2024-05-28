package Java8.Streams;


import java.util.*;

public class StreamReducingope {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Huda","Sneha","shraddha","Teju","sona","Shreya"));

       Optional<String> showname =  names.stream().reduce((name1 , name2 ) -> name1 +"  ,  "+name2);
       showname.ifPresent(System.out::println);



       List<Integer> add = new ArrayList<>(Arrays.asList(4 , 11 , 10 , 13 , 51 ,42 , 12));
       int sum = add.stream().reduce(0,(a , b) -> a + b);
        System.out.println(sum);


    }
}
