public class Threads extends Thread
{
    //writing it in main class, ratehr than creating another valss
    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println("Hello "+i);
            i++;
        }
    }
    public static void main(String[] args) throws Exception
    {
        //just trying to write the program with Extending Thread (peace of Cake)
        // Threads M1=new Threads();
        // M1.start();

        // int i=0;
        // while(i<50)
        // {
        //     System.out.println("World "+i);
        //     i++;
        // }

        //Lets c withb runnable too
        // MyRun M1=new MyRun();
        // Thread T1=new Thread(M1);
        // T1.start();

        // int i=0;
        // while(i<50)
        // {
        //     System.out.println("World "+i);
        //     i++;
        // }
//Ans        
// World 0
// World 1
// Hello 0
// World 2
// Hello 1
// World 3
// Hello 2
// Hello 3
// World 4
// World 5
// World 6
// World 7
// Hello 4
// World 8
// Hello 5
// Hello 6
// World 9
// World 10
// Hello 7
// Hello 8
// Hello 9
// Hello 10
// Hello 11
// World 11
// Hello 12
// Hello 13
// Hello 14
// Hello 15
// World 12
// World 13
// World 14
// Hello 16
// Hello 17
// World 15
// Hello 18
// Hello 19
// Hello 20
// Hello 21
// Hello 22
// World 16
// Hello 23
// World 17
// World 18
// Hello 24
// World 19
// World 20
// World 21
// World 22
// World 23
// World 24
// World 25
// World 26
// World 27
// Hello 25
// Hello 26
// Hello 27
// Hello 28
// Hello 29
// Hello 30
// Hello 31
// World 28
// Hello 32
// World 29
// Hello 33
// World 30
// Hello 34
// World 31
// Hello 35
// Hello 36
// Hello 37
// World 32
// World 33
// World 34
// World 35
// Hello 38
// Hello 39
// World 36
// Hello 40
// Hello 41
// World 37
// World 38
// Hello 42
// Hello 43
// Hello 44
// Hello 45
// Hello 46
// World 39
// World 40
// Hello 47
// World 41
// Hello 48
// World 42
// Hello 49
// World 43
// World 44
// World 45
// World 46
// World 47
// World 48
// World 49
// PS D:\Programs\Abdul Bari Sir Java\Java Basics> 


        //Constructors of the Thread Class
        // Thread T1=new Thread(); //default constructor
        // RunTClass R1=new RunTClass();
        // Thread T2=new Thread(R1); // by implemanting Runnable
        // Thread T3=new Thread(new RunTClass()); //wiith anaymous obj of a Runnable(just rater creating the sepearate obj
        // // we just created it in the constructor)
        // Thread T4=new Thread("THread 3"); //just giving the name
        // Thread T5=new Thread(new RunTClass(),"Thread 5"); //u can give the name with Runnable too


        //Lets c about the getter and setter methods od the threads
        // TClass T1=new TClass("THread 1"); 
        // System.out.println("Name: "+T1.getName()); //Name: THread 1
        // System.out.println("ID: "+T1.threadId()); //aint works
        // System.out.println("Priority: "+T1.getPriority()); //Priority: 5
        // System.out.println("State: "+T1.getState() ); //State: TERMINATED

        // T1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println("Priority: "+T1.getPriority()); //Priority: 10

        // System.out.println("ISALIVE: "+T1.isAlive()); 
        // T1.interrupt();



        //main method always waits for to the other threads complete their execution
        //Let's See about Daemon Thread
        // T1.setDaemon(true); //the Daemon threds are dependent threads when main method terminates, they also terminates
        //i.e when main method complete execution along with main method, the Daemon thread has to terminarte too
        //but the thread is still executing, bcoz in the run() we called Thread.sleep() which makes main method wait
        //if u remove there wont be any output
        // T1.start();  //yup that's true (one thing to mention is that if wrote T1.start() before T1.setDaemon(), the ans will be diff. as 1st that Thraed will be called, then at time of termination Daemon which wont make any diff. in the output )
        //so now how to print then simply just we need tell main method to wait
        // try
        // {
        //     Thread.sleep(10);
        // }
        // catch(Exception e)
        // {

        // }
//Ans
// THread 1 Running....2.0%
// THread 1 Running....4.0%
// THread 1 Running....6.0%
// THread 1 Running....8.0%
// THread 1 Running....10.0%
// THread 1 Running....12.0%        

        //now we just told main method to wait for specific time (Thread.sleep(10) but we couldnt give the proper time
        //to execute all the output
        //for that we can all the join() method on that Thread to make the main method  to wait till Threads execution is finished  
        //but for that to we need the reference of a main method(main method is a cureent thtead)
        // try{
        // // Thread MThread=Thread.currentThread();
        // // MThread.join();  //yup just works fine 
        // T1.join();  //one isnt TClass Thread(T1) and currentTHread both r same
        // }
        // catch(Exception E)
        // {
            
        // }

        //now lets see about Thread.yield()
        //It can be used to give more time to the low priority, just like 
        // int Count=0;
        // while(Count<1000000)
        // {
        //     // try
        //     // {
        //     System.out.println("Thread Main: "+Count++);
        //     // Thread.sleep(50);
        // Thread.yield();
            // }
            // catch(Exception E){}
            //when we used Thread.sleep() didnt work 
            // Ans without it is 
            // Thread Main: 12794
            // Thread 1: 47823  yup that the desired ans , its works pretty much good
        



            //Let's see about synchronization and non-synchronization
            // DDisplay D1=new DDisplay();
            // CString1 C1=new CString1(D1); //here at the obj creation we r passing the reference of the DDisplay
            // //as we want to access the Display methos of a class DDisplay in each thread to display the String
            // CString2 C2=new CString2(D1);
            // C1.start();
            // C2.start();
            //so let's try to understand it
            // DDisplay is used to display the data as simple 
//ans
// Welcome to WHello Wororldld (non-synchronized output)            
// Hello WorldWelcome to World (synchronized output) , i just wanted to synchronized the String and Display method
//is going to dispaly it, there it might get mixed up so just used the synchronized there
//  synchronized public void Display(String S1) 




        //Student Challenge(ATM for understanding of Synchronization)
        // ATM A1=new ATM();
        // Customer C1=new Customer(A1) ;
        // Customer1 C2=new Customer1(A1);
        // Customer2 C3=new Customer2(A1);
        // C1.start();
        // C2.start();
        // C3.start();




        //Producer and Consumer program
        // MyData M1=new MyData();
        // Producer P1=new Producer(M1);
        // Consumer C1=new Consumer(M1);
        // P1.start();
        // C1.start();



        //Student Challenge
        //Teacher, Student and whiteborad
        //So here when Teacher wrote one Line of the Whiteboard all student will wrote down that line, when all students
        //wrote the line teacher will wrote new, but not unless all student wrote it down, 
        //just simple task as it
        //i want Teacher writteing those line given by user(from console) lsts see abut it too
        Whiteboard W1=new Whiteboard();
        Teacher T1=new Teacher(W1,"JAVA is a Language");
        T1.start();
        Student S1[]=new Student[5]; //this not a reference to an obj but rather reference that point the array of obj
        for(int i=0;i<5;i++)
        {
            S1[i]=new Student(W1);
            S1[i].start();
        }
        T1.start();


    }
    
}


//Teacher, Student and whiteborad challenge
class Whiteboard
{
    boolean Flag=true;
    String MSG;
    synchronized public void Write(String MSG)
    {
        try
        {
        while(Flag!=true)
        {
        wait();
        }
    }
    catch(Exception E)
    {
        
    }
        this.MSG=MSG;
        System.out.println("Writed: "+MSG);
        Flag=false;
        notify();
    }

    synchronized public void Read(int SNUm)
    {
        try
        {
        while(Flag!=false)
        {
        wait();
        }
    }
    catch(Exception E)
    {
        
    }
        System.out.println("Done Reading By Student: "+SNUm);
        Flag=true;
        notify();
    }
}

class Teacher extends Thread
{
    Whiteboard W1;
    String MSG;
    Teacher(Whiteboard W1,String MSG)
    {
        this.W1=W1;
        this.MSG=MSG;
    }
    public void run()
    {
        W1.Write(MSG);
    }
}

class Student extends Thread
{
    Whiteboard W1;
    String MSG;
    int SNo=5,i=1;
    Student(Whiteboard W1)
    {
        this.W1=W1;
    }
    public void run()
    {
        while(SNo>0)
        {
        W1.Read(i);
        i++;
        SNo--;
        }
    }
}



//Producer and Consumer Program
class MyData
{
    int Value;
    boolean Flag=true;

    synchronized public void Set(int Value)
    {
        try
        {
        while(Flag!=true)
        {
            wait();
        }
    } catch(InterruptedException E){}
        this.Value=Value;
        Flag=false;
        notify();
    }

    synchronized public int Get()
    {
        try
        {
        while(Flag!=false)
        {
            wait();
        }
        } 
         catch(InterruptedException E){}

        int X=0;
        X=Value;
        Flag=true;
        notify();
        return X;
    }
}

class Producer extends Thread
{
    MyData M1;
    Producer(MyData M1)
    {
        this.M1=M1;
    }

    public void run()
    {
        int i=0;
        while(i<10)
        {
            M1.Set(i);
            System.out.println("Producer: "+i);
            i++;
        }
    }
}

class Consumer extends Thread
{
    MyData M1;
    Consumer(MyData M1)
    {
        this.M1=M1;
    }

    public void run()
    {
        while(true)
        {
            System.out.println("Consumer: "+M1.Get());
        }
    }
}

//ATM Challenge
class ATM
{
   synchronized void Display(String Name,long Amount,long WAmount)
    {
        try{
        System.out.println("Checking Balance.");
        Thread.sleep(30);
        System.out.println("Checking Balance...");
        Thread.sleep(30);
        System.out.println("Checking Balance.");
        Thread.sleep(30);
        System.out.println("Checking Balance...");
        Thread.sleep(30);
        System.out.println("Checking Balance.");
        Thread.sleep(30);
        System.out.println("Checking Balance...");
        Thread.sleep(30);
        System.out.println("Checking Balance.");
        Thread.sleep(30);
        System.out.println("Checking Balance...");
        Thread.sleep(30);
        System.out.println("\nDear "+Name+","+"\nBalance In Your ACC: "+Amount);

        Thread.sleep(70);
        System.out.println("Now Withdrawing Amount.");
        Thread.sleep(30);
        System.out.println("Now Withdrawing Amount...");
        Thread.sleep(30);
        System.out.println("Now Withdrawing Amount.");
        Thread.sleep(30);
        System.out.println("Now Withdrawing Amount...");
        Thread.sleep(30);
        System.out.println("\nDear "+Name+","+"\nWithdraw Amount is: "+WAmount);
        Thread.sleep(30);
        System.out.println("\nRemain Balance In Your ACC: "+(Amount-WAmount));
        Thread.sleep(20);
        System.out.println("....Thank You....");


        }
        catch(InterruptedException I)
        {

        }

    }

}

class Customer extends Thread
{
    ATM A1;
   public Customer(ATM A1)
    {
        this.A1=A1;
    }
    public void run()
    {
        A1.Display("Ram", 1000000, 50414);
    }

}
class Customer1 extends Thread
{
    ATM A1;
    Customer1(ATM A1)
    {
        this.A1=A1;
    }
    public void run()
    {
        A1.Display("Mahesh", 1000000, 40414);
    }

}
class Customer2 extends Thread
{
    ATM A1;
    Customer2(ATM A1)
    {
        this.A1=A1;
    }
    public void run()
    {
        A1.Display("Aata", 1000000, 30414);
    }

}

//About non-synchronization
class DDisplay 
{
    public void Display(String S1) //just taking the String as an parameter and synchronizing teh method
    {
        synchronized(this) //using synchronized block, this is used to tell synchronized current instance
        {
            for(int i=0;i<S1.length();i++)
        {
            System.out.print(S1.charAt(i)); //just printing per char at specific index
        }
        }
    }
}

class CString1 extends Thread
{
    DDisplay D1;
    // String Data;
    CString1(DDisplay D1) //and that we using it here to access the Disaplay mehod
    {
        this.D1=D1;
    }
    public void run()
    {
        D1.Display("Hello World");
    }

}

class CString2 extends Thread
{
    DDisplay D1;
    // String Data;
    CString2(DDisplay D1)
    {
        this.D1=D1;
    }
    public void run()
    {
        D1.Display("Welcome to World");
    }

}


class TClass extends Thread //The Thread Class 
{
    String Name;
    TClass(String Name)
    {
        this.Name=Name;
    }

    //About yield() 
    public void run()
    {
        int Count=0;
        while(Count<1000000)
        {
            // try
            // {
            System.out.println("Thread 1: "+Count++);
            // Thread.sleep(50);
            // }
            // catch(Exception E){}
        }

    }

    // public void run()
    // {
    //     int No=1;
    //     while(No!=50)
    //     {
    //         try
    //         {
    //     System.out.println("THread 1 Running...."+2*No+".0%");
    //     Thread.sleep(50);
        // throw new InterruptedException();

        // if(No>10 && No<42)
        // {
        // System.out.println("THread 1 Running...."+2*No+".0%");
        // Thread.sleep(20);
        // } it didnt worked(will see about it)
        //     }
        //     catch(InterruptedException Ie)
        //     {
        //         System.out.println(Ie);
        //     }
        // No++;
        // }
    // }

}
class RunTClass implements Runnable
{
    public void run()
    {

    }
}

class MyRun implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println("Hello "+i);
            i++;
        }
    }
}
class MyThread extends Thread
{
    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println("Hello "+i);
            i++;
        }
    }
}
