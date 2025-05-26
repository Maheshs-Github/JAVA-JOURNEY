//5,6,7
import java.util.*;
public class SInTreeset 
{

    public static void main(String[] args) 
    {
        TreeSet<Integer> T1=new TreeSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Records u like to have?");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" Records one by one:");
        for (int i=0;i<n;i++)
        {
            int INt1=sc.nextInt();
            T1.add(INt1);
        }
        System.out.println("\nEntered Elements are:");
        for(int INt1 : T1)
        {
            System.out.println(INt1);
        }
        
        System.out.println("Enter the Element to search");
        int No=sc.nextInt();
        boolean ans=T1.contains(No);
        if(ans==true)
        {
            System.out.println("The Element "+No+" is present");

        }
        else
        {
            System.out.println("The Element "+No+ " is not present ");
        }
        
        sc.close();
}
}

