//9
import java.util.*;
public class LLIter 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> L1=new LinkedList<>();
        System.out.println("How many Subjects u like have:");
        int N=sc.nextInt();
        System.out.println("Lets enter the"+N+" Subjects one by one:");
        for(int i=0;i<N;i++)
        {
            String Subjects=sc.next();
            L1.add(Subjects);
        }

        System.out.println("Printing all the Subjects:");
        for(String Sub: L1)
        {
            System.out.println(Sub);
        }



        System.out.println("Now Printing all the Subjects Using Iterator:");
        Iterator<String> I1=L1.iterator();
        while(I1.hasNext())
        {
            System.out.println(I1.next());
        }
        
       
        sc.close();
        
    }
    
}
