// it container which contains not null values .
// It is used to avoid Null checks and NULLPOINTEREXCEPTION .

package Java8.OptionalClass;

import java.util.Optional;

public class Optionalclass1 {
    public static void main(String[] args) {
 // EMPTY OPTIONAL :

        Optional<String> emptyoptional = Optional.empty();

// OPTIONAL WITH VALUE :

        Optional<String> optionalwithvalue = Optional.of("Huda");



// CHECK THE VALUE IS PRESENT AND PRINT IT  :

        optionalwithvalue.ifPresent(value -> System.out.println("Value is present : "+value));

// GET THE VALUE IF PRESENT :

        optionalwithvalue.ifPresent(value -> System.out.println("Value : "+optionalwithvalue.get()));


      if (optionalwithvalue.isPresent()){
          System.out.println("The value is present "+optionalwithvalue.get());
      }else {
          System.out.println("Value is not present ");
      }


// IF OPTIONAL class is EMPTY then PROVIDING DEFAULT VALUE :

       String test = emptyoptional.orElse("Inamdar");
        System.out.println("Result is : " +test);




// OPTIONAL THAT MIGHT BE EMPTY OR HAVE VALUE :

       String show = null ;
       Optional<String> optionalNull = Optional.ofNullable(show);
    }
}
