import java.util.*;

public class Mycal{
    public static void main(String args[]){
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println("Sum is : "+(num1+num2));
        System.out.println("Substractio is : "+(num1-num2));
        System.out.println("Multiply is : "+(num1*num2));
        System.out.println("Divide is : "+(num1/num2));
    }
}
