package Java8.MethodReferences;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
    public void printstudentInstance (String student ) {            //Instance method to print student name
        System.out.println(student);
    }
    public static void main(String[] args) {

        List<String> student = new ArrayList<String>();
        student.add("Huda");
        student.add("Teju");
        student.add("sonali");
        student.add("Shraddha");
        student.add("Vaishali");
        student.add("Nisha");
        student.add("Gauri");

        MethodReferences Reference = new MethodReferences();      // Instance method reference of an arbitrary object of a particular type
        student.forEach(Reference::printstudentInstance);

    }
  /*  public void printstudentInstance (String student ) {
        System.out.println(student);*/
}
