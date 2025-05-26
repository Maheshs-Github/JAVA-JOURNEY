import java.util.Scanner;

public class STaskLoops 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //finding the digits from the no
        // int Count=0;
        // while(No>0)
        // {
        //     No/=10;
        //     Count++;
        // }
        // System.out.println(Count);

        //displaying digits of the no
        // while(No>0)
        // {
        //     int Digit=No%10;
        //     No/=10;
        //     System.out.println(Digit);
        // }

        //finding if the no is armstrong or not 
        // int No1=No;
        // int No2=No;
        // int Ans=0;
        // //String No3=(String)No;
        // //int Len=(String)No.lenght();
        // int Count=0;
        // while(No2>0)
        // {
        //     No2/=10;
        //     Count++;
        // }
        // System.out.println(Count);
        // while(No1>0)
        // {
        //     int Remain=No1%10;
        //     Ans=((int)(Math.pow(Remain, Count)))+Ans;
        //     //Ans=Remain*((int)(Math.pow(Remain, Count)))+Ans;
        //     //Finding the pow of remainder and  mutilpying thats where we r getting it wrong
        //     No1/=10;
        //     System.out.println(Ans); 
        // }
        // System.out.println(No==Ans);
        //if input is 153 output =true

        //lets take example to decode if the no is Armstrong 
        //e.g 153 (when we say that no is ArmStrong )
        // If its digits sum of square is equal to that no
        //153 ->> Total no of Digit=3, 1^3=1, 5^3=125, 3^3=27 === 153 (No is Armstrong No)
        //int Remain=No1%10;  - Gives the 153%10=3
        //Ans=0
        // Ans=Remain*((int)(Math.pow(Remain, Count)))+Ans;
        //abou Math.pow(Reamin,count) - with this we just finding 3^3=27
        //27 +ans(0)=0
        //153/10=15
        //15%10=5, 5^3=125, 125+27=152



        //lets c about reversing the no, first dry run in comments 
        //e.g 153, 153%10=3, 3*10^0=3, 153/10=15
        //15%10=5, 5*10^1+3=53
        //getting at?
        //well there wont be error in above logic but it will print the same no as it is
        //c hwere eg --> 153, 153%10=3, 3*10^2+0=300, 153/10=15
        //15%10=5, 5*10^1+300=350 and its goes like 
        //remember 10^0=1
        //O/P-->
        /*

Enter the No:
153
Ans is : 300
Ans is : 350
Ans is : 351
Reverse is :351

         */
        // int Ans=0,pow=2;
        // while(No>0)
        // {
        //     int R1=No%10;
        //     Ans=R1*((int)Math.pow(10, pow))+Ans;
        //     pow--;
        //     System.out.println("Ans is : "+Ans);
        //     No/=10;
        // }
        // System.out.println("Reverse is :"+Ans);



        //for to check wheter the no palindrome no or not 
        int No=121;
        int Ans=0,pow=2;
        int No1=No;
        while(No>0)
        {
            int R1=No%10;
            Ans=R1*((int)Math.pow(10, pow))+Ans;
            pow--;
            System.out.println("Ans is : "+Ans);
            No/=10;
        }
        System.out.println("Reverse is :"+Ans);
        if(No1==Ans)
        {
            System.out.println("The Num "+No1+" & "+Ans+" are the same so it is Palindrome no");
        }
        else
        {
            System.out.println("The NUmber is NOT a Palindrome");
        }



        //Another task is to  display respective digit in word for given no
        // 153- One Five Three
        //so for displaying word we can just use switch cases 
        //we know how to seperate digit out of no, but to get it from 1st we can just reverse the word

        // int Ans=0,pow=2;
        // int No1=No; 
        // while(No>0)
        // {
        //     int R1=No%10;
        //     Ans=R1*((int)Math.pow(10, pow))+Ans;
        //     pow--;
        //     //System.out.println("Ans is : "+Ans);
        //     No/=10;
        // }
        // System.out.println("Reverse is :"+Ans);

        // System.out.print("\n\n The Number Digits of No: "+No1+" Are: ");
        // while(Ans>0)
        // {
        //     int R1=Ans%10;
        //     DigitF(R1);
        //     Ans/=10;
        // }


        //Next Task is a Arithmatic Progression Series
        //its simply is start with some number and add some constant in a that number and so on
        //Starting nUm=10, Constant=5, print N=10 Number in total
        //i.e 10,15,20,25,30,35,40,45,50,55

        // System.out.println("We are Printing Aritmatic Progression Series");
        // System.out.println("ENter the Total no of itertion u like to have in a series: ");
        // int No=sc.nextInt();
        // System.out.println("ENter the Starting Number: ");
        // int SNo=sc.nextInt();
        // System.out.println("ENter the Constant: ");
        // int CNo=sc.nextInt();
        // int Ans=SNo;
        // for(int i=1;i<=No;i++)
        // {
        //     // System.out.print(Ans+", ");
        //     // Ans+=CNo;
        //     //just avoid that last , (10, 20, 30, 40, 50, 60, 70, 80, 90, 100, )

        //     if(i<No)
        //     System.out.print(Ans+", ");
        //     else
        //     System.out.print(Ans);
        //     Ans+=CNo;
        // }


        //In the Geometric Progression Series 
        //we take Starting poimt, No of Iterations and multiple(noot a constant)
        // Satring point= 3, No oF Iteartion=10, multiple=2
        //series we look like
        //3,6,12,24,48,96,...

        // System.out.println("We are Printing Aritmatic Progression Series");
        // System.out.println("ENter the Total no of itertion u like to have in a series: ");
        // int No=sc.nextInt();
        // System.out.println("ENter the Starting Number: ");
        // int SNo=sc.nextInt();
        // System.out.println("ENter the Multiple: ");
        // int Multiple=sc.nextInt();
        // int Ans=SNo;
        // for(int i=1;i<=No;i++)
        // {
           
        //     if(i<No)
        //     System.out.print(Ans+", ");
        //     else
        //     System.out.print(Ans);
        //     Ans*=Multiple;
        // }
        //3, 6, 12, 24, 48, 96, 192, 384, 768, 1536 

        //Lets c for fibonnaci series 
        //fibonnaci series goes like 
        //0,1,1,2,3,5,8,13,21,34,....
        //So simply to tell about it 1st we take predefined values 0,1
        //refre fibonnaci series for below //0,1,1,2,3,5,8,13,21,34,....
        //afṭer that just 0,1 (0+1=1) thats why 3rd index is 1
        //now series is 0,1,1 , now adding last 2 no of series to get next one 
        //i.e 1+1=2 so now series is 0,1,1,2
        //next 1+2=3 series is : 0,1,1,2,3
        //next 2+3=5 now series is : 0,1,1,2,3,5 and so on


        //without using array
        // System.out.println("How many numbers u like to have:");
        // int No=sc.nextInt();
        // int n1=0;
        // int n2=1;
        // int n3=0;

        // System.out.print(n1+", "+n2+", ");
        // for(int i=2;i<No;i++)
        // {
        //     n3=n1+n2;
        //     n1=n2;
        //     n2=n3;
        //     if(i!=No-1)
        //     System.out.print(n3+", ");
        //     else
        //     {
        //     //System.out.print("Hello");
        //     System.out.print(n3);
        //     }
        // }
        

        // //Using Array
        // int[] Fib=new int[No];
        // Fib[0]=0;
        // Fib[1]=1;
        // System.out.println("\nThe Next Fib: ");
        // System.out.print(Fib[0]+", "+Fib[1]+", ");
        // for(int i=2;i<No;i++)
        // {
        //     Fib[i]=Fib[i-2]+Fib[i-1];
        //     System.out.print(Fib[i]+", ");
        // }

        //Some Pattern Pratice
        /*
2, 3, 4, 5, 6, 
3, 4, 5, 6, 7, 
4, 5, 6, 7, 8, 
5, 6, 7, 8, 9, 
6, 7, 8, 9, 10,    
         */
        
        //int Count=1;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print(i+j+", ");

        //     }
        //     System.out.println();
        // }



        //another pattern
        /*
1
12
123
1234
12345         
         */
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);

        //     }
        //     System.out.println();
        // }


        //pattern
        /*
12345
1234
123
12
1         
         */
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=6-i;j++)
        //     {
        //         System.out.print(j);

        //     }
        //     System.out.println();
        // }


        //pattern
        /*
11111
2222
333
44
5         
         */
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=6-i;j++)
        //     {
        //         System.out.print(i);

        //     }
        //     System.out.println();
        // }


        //pattern
        /*
02 03 04 05 06 
07 08 09 10 
11 12 13 
14 15 
16          
         */
        // int Count=1;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=6-i;j++)
        //     {
        //         Count++;
        //         System.out.printf("%02d ",Count);

        //     }
        //     System.out.println();
        // }


        //Adv Pattern
        /*
*****
 ****
  ***
   **
    *         
         */
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=i-1;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=6-i;k++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //Pattern
        /*
    *
   **
  ***
 ****
*****         
         */
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //}



        //Pattern (9 rows)
        /*
    *    
   ***   
  *****  
 ******* 
*********         
         */
        // int Star=1;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=Star;k++)
        //     {
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=5-i;j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     Star+=2;
        //     System.out.println();
        // }



        //Pattern
        /*
    *    
   ***   
  *****  
 ******* 
*********
 ******* 
  *****  
   ***   
    *         
         */

         int Star=1;
         for(int i=1;i<=5;i++)
         {
             for(int j=1;j<=5-i;j++)
             {
                 System.out.print(" ");
             }
             for(int k=1;k<=Star;k++)
             {
                 System.out.print("*");
             }
             for(int j=1;j<=5-i;j++)
             {
                 System.out.print(" ");
             }
             Star+=2;
             System.out.println();
         }
         int Star1=Star-4; //(just that to assign 7)
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=Star1;k>=1;k--)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            Star1-=2;
            System.out.println();
        } 

        sc.close();;
        



    }

    static void DigitF(int No)
    {
        switch(No)
        {
            case 0:
            {
                System.out.print("Zero ");
                break;
            }
            case 1:
            {
                System.out.print("One ");
                break;
            }
            case 2:
            {
                System.out.print("Two ");
                break;
            }
            case 3:
            {
                System.out.print("Three ");
                break;
            }
            case 4:
            {
                System.out.print("Four ");
                break;
            }
            case 5:
            {
                System.out.print("Five ");
                break;
            }
            case 6:
            {
                System.out.print("Six ");
                break;
            }
            case 7:
            {
                System.out.print("Seven ");
                break;
            }
            case 8:
            {
                System.out.print("Eight ");
                break;
            }
            case 9:
            {
                System.out.print("Nine ");
                break;
            }

        }
    }
    
}
