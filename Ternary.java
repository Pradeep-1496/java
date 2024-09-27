import java.util.*;
public class Ternary {
    public static void main(String[] args) {   
      int a, b;
      Scanner sc = new Scanner (System.in);
      System.out.print("Enter two numbers:");
      a=sc.nextInt();
      b=sc.nextInt();

      String result;
      result = (a < b) ? "The greater number is "+b : "The greater number is "+a;  
      System.out.println(result);
    }
  }