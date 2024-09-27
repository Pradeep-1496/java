import java.util.*;
public class Exception {
    public static void main(String args[]){
        int a, b, c;
        
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a=sc.nextInt();
        System.out.print("Enter the second number : ");
        b=sc.nextInt(); 
        try{
           c = a/b;
           
            }catch (ArithmeticException e){
                System.out.println(e.getMessage()+" Sorry bro can't divide ");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(" Array ki size dekh ");
                } 
                finally {
                    System.out.println("This is Finally block & it always execute ");
                }
            fun();
            fun1();
    }
    static void fun(){
        System.out.println("Function called");
    }
    static void fun1(){
    System.out.println("After this function called");
}
}
