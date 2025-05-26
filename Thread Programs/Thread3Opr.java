import java.lang.Thread;
import java.util.*;

class TO1 extends Thread {
    
    public void run() 
    {
        try
        {
        Random R1 = new Random();
        int Number = R1.nextInt(100);
        System.out.println("The Random Number is" + Number);
        if (Number % 2 == 0) {
            class TO2 extends Thread {
                public void run() 
                {
                // try
                // {
                    //int Num = getNumber(Number);
                    int SQr = Number * Number;
                    System.out.println("The Squre of " + Number + " is:" + SQr);
                
                // }catch(InterruptedException ie)
                // {
                //     System.out.println(ie);
                // }
            }
            }
        } else {
            class TO3 extends Thread {
                public void run() 
                {
                // try
                // {
                    //int Num = getNumber(Number);
                    int Cub = Number * Number * Number;
                    System.out.println("The Cube of " + Number + " is:" + Cub);
                
                // }catch(InterruptedException ie)
                // {
                //     System.out.println(ie);
                // }
            }
            }
        }
        Thread.sleep(2000);
    }catch(InterruptedException ie)
    {
        System.out.println(ie);
    }
    }
}

// class TO2 extends Thread {
//     public void run() 
//     {
//     try
//     {
//         int Num = getNumber(Number);
//         int Sqr = Num * Num;
//         System.out.println("The Squre of " + Number + " is:" + SQr);
    
//     }catch(InterruptedException ie)
//     {
//         System.out.println(ie);
//     }
// }
// }


// class TO3 extends Thread {
//     public void run() 
//     {
//     try
//     {
//         int Num = getNumber(Number);
//         int Sqr = Num * Num * Num;
//         System.out.println("The Cube of " + Number + " is:" + SQr);
    
//     }catch(InterruptedException ie)
//     {
//         System.out.println(ie);
//     }
// }
// }



public class Thread3Opr extends Thread {

    public static void main(String[] args) {
        Thread3Opr TO1 = new Thread3Opr();
        Thread3Opr TO2 = new Thread3Opr();
        Thread3Opr TO3 = new Thread3Opr();
        TO1.start();
        TO2.start();
        TO3.start();

    }

}
