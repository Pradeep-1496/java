import java.util.*;
class ins{
void insert()
{
   int n,i ;
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF ARRAY: ");
        n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("ENTER VALUE OF ARRAY: "); 
        for (i=0;i<n;i++)
        { a[i]=sc.nextInt();
        }
        System.out.println("ARRAY IS : "+Arrays.toString(a));
}
}
public class array {
    public static void main(String args[])
    {
	     ins i = new ins();
       i.insert();
        /*for ( i=0;i<n;i++){
      System.out.println(a[i]);
        }*/

}
    }
