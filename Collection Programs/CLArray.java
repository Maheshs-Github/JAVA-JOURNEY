//10
import java.util.*;
public class CLArray 
{
    public static void main(String[] ab) 
    {
        //Scanner sc=new Scanner(System.in);
        ArrayList<String> A1=new ArrayList<>();
        System.out.println("How many Student NAme u like have:");
        int N=Integer.parseInt(ab[0]);
        System.out.println("Lets enter the"+N+" Student NAmes one by one:");
        for(int i=0;i<N;i++)
        {
            String SName=ab[i+1];
            A1.add(SName);
        }

        System.out.println("Printing all the Student NAmes:");
        for(String SName: A1)
        {
            System.out.println(SName);
        }



        System.out.println("Now Printing all the Student NAmes Using Iterator:");
        Iterator<String> I1=A1.iterator();
        while(I1.hasNext())
        {
            System.out.println(I1.next());
        }
        
        System.out.println("Now Printing all the Student NAmes Using List Iterator:");
        ListIterator<String> LI1=A1.listIterator();
        while(LI1.hasNext())
        {
            System.out.println(LI1.next());
        }
       
       // sc.close();
        
    }
    
}
