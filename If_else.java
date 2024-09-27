import java.util.*;
public class If_else {
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        a=sc.nextInt();
        System.out.print("Enter the second number:");
        b=sc.nextInt();
        if (a>b){
            System.out.print("The greater number is "+a);
                } else if (a==b){
                    System.out.println("Both numbers are equal.");
                }
            else{
                System.out.print("The greater number is "+b);
                }        
                }
    }
