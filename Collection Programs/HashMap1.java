//3
import java.util.*;
public class HashMap1 
{
    public static void main(String[] args) 
    {
        Hashtable<String,Integer> H1=new Hashtable<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("How Many Records u like to have?");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" Records one by one:");
        for (int i=0;i<n;i++)
        {
            String CName=sc.next();
            int STD=sc.nextInt();
            H1.put(CName,STD);
        }
        System.out.println("Entered records are:");
        System.out.println(H1);



        System.out.println("Entering one more Records:");
        System.out.println("Enter already:");
        String CName=sc.next();
        int STD=sc.nextInt();
        H1.put(CName,STD);
        System.out.println(H1);


        System.out.println("Deleting one more Records:");
        System.out.println("Enter the key no to remove that key:");
        CName=sc.next();
        H1.remove(CName);
        System.out.println(H1);


        System.out.println("Searching for the key:");
        System.out.println("Enter the key to be search:");
        String Key1=sc.next();
        boolean IsIt=H1.containsKey(Key1);
        System.out.println("Is our dataset contain  Key= "+IsIt);
        if(IsIt==true)
        {
            System.out.println("The Element "+Key1+" is present");

        }
        else
        {
            System.out.println("The Element "+Key1+ " is not present ");
        }

        sc.close();

        
    }
    
}
