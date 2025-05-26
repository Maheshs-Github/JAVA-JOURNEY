//8,9,12
import java.lang.Thread;
public  class ThreadPror extends Thread
{
    public static void main(String[] args) 
    {
        ThreadPror TP1=new ThreadPror();
        TP1.start();

        System.out.println(TP1);
        System.out.println("Thread NAme:"+TP1.getName());
        System.out.println("Thread Priority:"+TP1.getPriority());
        System.out.println("Checking if Thread is Alive..... \n" );
        
        TP1.setName("No Idea");
        TP1.setPriority(Thread.MAX_PRIORITY);
        if(TP1.isAlive())    
        {
            System.out.println("Yesh,Thread is Alive");
        }
        else
        {
            System.out.println("Thread is Dead");
        }
        System.out.println("Thread NAme:"+TP1.getName());
        System.out.println("Thread Priority:"+TP1.getPriority());



        ThreadPror TP2=new ThreadPror();
        TP2.start();
        TP2.setName("No Idea either");
        TP2.setPriority(7);
        System.out.println("Thread NAme:"+TP2.getName());
        System.out.println("Thread Priority:"+TP2.getPriority());

    }
    
}
