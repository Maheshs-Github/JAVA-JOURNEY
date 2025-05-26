//4
import java.util.*;
public class StudMobEnum 
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
            String SName=sc.next();
            int Mob=sc.nextInt();
            H1.put(SName,Mob);
        }//Key- SName , Value- Mob No

        System.out.println("Entered records are:");
        System.out.println(H1);

        
        
         System.out.println("Displaying Hashtable data using Enumeration:");
         Enumeration <String> E1=H1.keys();
         while(E1.hasMoreElements())
         {
             String name=E1.nextElement();
             int phone=H1.get(name);
             System.out.println("Student Name:"+name+"\nMob No:"+phone);

         }

        
        sc.close();
    }
}
