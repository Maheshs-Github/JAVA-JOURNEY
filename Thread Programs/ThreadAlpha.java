//1
import java.lang.Thread;
public class ThreadAlpha extends Thread 
{
    public void run()
    {
        try
        {
        for(int i='A';i<='Z';i++)
        {
            System.out.println("Alphabet: "+(char)i);
            Thread.sleep(500);
        }
    }catch(InterruptedException ie)
    {
        System.out.println(ie);
    }
    }
    public static void main(String[] args) 
    {
        ThreadAlpha TA1=new ThreadAlpha();
        TA1.start();

        
    }
    
}
