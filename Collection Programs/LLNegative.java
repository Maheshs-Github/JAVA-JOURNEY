//8
import java.util.*;
public class LLNegative 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> L1=new LinkedList<>();
        System.out.println("How many numbers u like have:");
        int N=sc.nextInt();
        System.out.println("Lets enter the"+N+" Numbers one by one:");
        for(int i=0;i<N;i++)
        {
            int Numbers=sc.nextInt();
            L1.add(Numbers);
        }

        System.out.println("Printing all the records:");
        for(int Num: L1)
        {
            System.out.println(Num);
        }
        System.out.println("Now Printing all the -ve records:");
        for(int Num: L1)
        {
            if(Num<0)
            System.out.println(Num);
        }

        sc.close();
        
    }
    
}
