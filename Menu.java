import java.util.*;

public class Menu {
    public static void main(String args[]){
        int choice;
        String order;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. tea");
        System.out.println("2. cold drink");
        System.out.println("3. samosa");

        System.out.print("ENTER CHOICE : ");
        choice=sc.nextInt();

        switch(choice){
            case 1:
            order="tea";
            break;

            case 2:
            order="cold";
            break;

            case 3:
            order="samosa";
            break;
            default:
            order="not in menu";


        }
        System.out.println("YOUR ORDER IS "+order);


    }
}