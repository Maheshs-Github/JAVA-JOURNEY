
//1
import java.util.*;
public class HSAscending
{
    public static void main(String[] args) 
    {
        HashSet<String> H1=new HashSet<String>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Names of Your Friends u like to have?");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" Records one by one:");
        for (int i=0;i<n;i++)
        {
            String FNames=sc.next();
            H1.add(FNames);
        }
        ArrayList<String> A1=new ArrayList<>(H1);
        Collections.sort(A1);
        System.out.println("The Name of u r friends in ascending order:");
        // for(String SortedNames : A1)
        // {
        //     System.out.println(SortedNames);

        // }
        System.out.println("\n Simple way to Print"+A1);
        // Ouput for this [Ahsan, Kunal, Mahesh]
        sc.close();

        
    }
}
