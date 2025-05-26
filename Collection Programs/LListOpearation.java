//2
import java.util.*;
public class LListOpearation
{
    public static void main(String[] args) 
    {
        LinkedList<String> L1=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Names of Your Friends u like to have?");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" Records one by one:");
        for (int i=0;i<n;i++)
        {
            String FNames=sc.next();
            L1.add(FNames);
        }
        System.out.println("\nEntered Elements are:");
        for(String Names : L1)
        {
            System.out.println(Names);

        }


        System.out.println("\nAdding element at last");
        System.out.println("Enter the element at last");
            String Add1=sc.next();        
        L1.addLast(Add1);
        for(String Names : L1)
        {
            System.out.println(Names);

        }



        System.out.println("\nDeleting 1st element:");
        L1.remove(1);
        for(String Names : L1)
        {
            System.out.println(Names);

        }
 

        System.out.println("\nSorting element by the reverse order:");
        Collections.sort(L1,Collections.reverseOrder());
        for(String SortedNames : L1)
        {
            System.out.println(SortedNames);

        }
        sc.close();

        
    }
}
