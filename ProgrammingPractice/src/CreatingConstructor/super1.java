// constructor extends those constructor which has availability of default constructor .
package CreatingConstructor;
 class super2 {
     void show(){
         System.out.println("super2 class show method");
     }
     public super2() {
         System.out.printf("this is default constructor ");
     }
 }
     class super3 extends super2 {
        public super3 (String s){

            System.out.printf("This ia 1 parameterized constructor");
        }
    }
     class super4 extends super2 {
     void get(){
         System.out.println("super4 class get method");
     }
     String s;
     super4(){
         super.show();
         System.out.println("--------Huda ");
     }
        public super4 (String s , int i ){

         this();
         this.get();
           // this.s=s;
          //  super();
            System.out.printf("\nThis is 2 parameterized constructor ");
        }

    }
    public class super1 {
        public static void main(String[] args) {
            super4 obj1 = new super4("java",20);

        }
    }

