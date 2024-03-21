package HandlingException.uncheckedException;

public class ArrayIndexOutofBounds {
    public static void main(String[] args) {
        System.out.println("Statement out of Exception ");
       try {
           int [ ] arr = new int[5] ;
           arr [7] = 10 ;
       }catch (ArrayIndexOutOfBoundsException aib) {
           System.out.println("This is Array Index out of Bounds code ");
       }

    }
}


// it is used when programmer gives values greaterthen the size of array index given in program .