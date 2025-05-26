import java.util.Scanner;

class PrimeOrNot
{
    public static void main(String[] args) 
    {
        //Lets c the logic to check wheter the number is prime or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int No=sc.nextInt();
        // int Count=0;
        // if(No>1) //number less from 1 are not prime
        // {
        //     for(int i=1;i<=No;i++) //we r going from 1 to No,so prime also will be divisible by 2 numbers 
        //     {                      // that number and  e.g 7--> 7/7 and 7/1
        //         if(No%i==0)
        //         Count++;
        //     }
        //     if(Count==2)
        //     {
        //         System.out.println("The Number is Prime nUmber");
        //     }
        //     else
        //     {
        //         System.out.println("The Number is not a Prime Number");
        //     }
        // }
        // else
        // {
        //     System.out.println("The NUmber is Not a prime");
        // }
        //In this example we just check prime Number to do that

        //Checking if Number is Prime without Using Count
        for(int i=2;i<No/2;i++) 
        {
            
        }
        sc.close();
    }
}