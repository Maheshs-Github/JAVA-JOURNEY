public class Methods 
{
    public static void main(String[] args) 
    {
        //Checking about the passsing array and primitivw data types
        // int a=10,b;
        // b=Modify(a);
        // System.out.println("The Modified one: "+b);
        // System.out.println("The Calue of a in here: "+a);
        // System.out.println("Guess they should be different..."); //yeah they r anyway 
        // //but aint be for aaray
        // int a[]={1,2,3,4,5},b;
        // b=Modify(a);
        // System.out.println("The Modified one: "+b);
        // System.out.println("The Calue of a in here: "+a[1]);
        // for(int X:a)
        // {
        //    System.out.print(X+" ");
        
        // }
        /* Ans 
The Modified one: 20
The Calue of a in here: 20
1 20 3 4 5 
         */
        //when object is pased an argument, the cahnge made in a formal values 
        //refelct om the actual array or obj data 
        //As in a Primitive data type the Actual Values r Copied into the formal values
        //so it aint affect the actual values
        //where as in a Obj or Array reference(addr) of an original data is passed to the 
        //method so original data  is also get modified 


        //Lets c something about Called and Calling method
        //well Calling method is that method which called the other in here i.e main() method
        //Called method is one that being called Modify() method here


        //Method to find whether the given no is Prime or not 
        // int No=11;
        // boolean Ans;
        // Ans=Prime(No);
        // System.out.println();
        // if(Ans==true)
        // {
        //     System.out.println("The "+No+" is a Prime No");
        // }
        // else
        // {
        //     System.out.println("The "+No+" is NOT a Primwe No");
        // }


        //Finding the GCD of the two numbers
        // int a=50,b=15;
        // GCD(a, b);


        //Finding max element in the array
        // int a[]={15,2,32,74,3,7,52,46,8};
        // int MAx=Max(a);
        // System.out.println("Max: "+MAx);


        //Understanding more about method overloading 
        //Really simple concept
        // int a=1,b=2,c=3;
        // float p=1.0f,q=2.0f,r=3.0f;
        // int IMax=Max(a,b);
        // System.out.println("Max: "+IMax);
        // int IMax2=Max(a,b,c);
        // System.out.println("Max: "+IMax2);
        // float FMax=Max(p, q);
        // System.out.println("Max: "+FMax);
        // float FMax2=Max(p, q,r);
        // System.out.println("Max: "+FMax2);
/* Ans:
Max: 2
Max: 3
Max: 2.0
Max: 3.0
*/        
         

        //lets slove some tasks based on the overloading
        //Overloaded method to find the area of the Rectangle & Circle
        // int Len=10,Brd=20;
        // int Rad=26;
        // int Ans=Area(Len,Brd);
        // System.out.println("Area of the Rectangle is:"+Ans);
        // int Ans1=Area(Rad);
        // System.out.println("Area of the Circle is: "+Ans1);
        // String S1="Java";
        // String S2="Ja"+"va";
        // System.out.println(S2.equals(S1));



        //Task to checking methods to reverse a int or array
       // int a=10212345;
        //int Ans=Rev(a);
        //System.out.println("Rev No:"+Ans);
        // int Array[]={1,2,3,4,5};
        // int Rev[]=Rev(Array);
        // for(int X:Rev)
        // {
        //     System.out.print(X+" ");
        // }


        //Validating the Name and Age
        // System.out.println(Validate("[Mahesh Mane\\s]+"));
        // System.out.println(Validate(21));




        //Variable Parameter in Java
        // Show();
        // Show(10,20,30,40);
        // Show(10);
        // Show(new int[]{10,20,30});

        // //Tasks for Variable Arguments 
        // //1.Calculating the max of no.
        // Max2();
        // Max2(2,3,6,4,7,1,5);
        // Max2(new int[]{21,65,29,45,88,41});

        // //2.Calculate the Discount based on the variable prizes provided
        // //supoose we have 15% discount on each product
        // Customer1(67,9878,95,4,97,30,15,598,987,1076);
        // Customer1(25,15,35,6.5,7.5,11);


        //Learning about the Recursion
        fun(3);
    }


    //Recursion e.g
    static void fun(int No)
    {
        if(No>0)
        {
            System.out.println(No+" ");
            fun(No-1);

        }
    }
    // Im mAhesh Mane , im 21 and im at  Abxc An
/* 
 3 
2 
1  
 */



    //Calculating the Discount 
    static void Customer1(double... Prizes)
    {
        double Sum=0;
        for(double X:Prizes)
        {
            Sum+=X;
        }
        System.out.println("Sum : "+Sum);
        double Disco=(Sum*15)/100;
        System.out.println("your Discount is a : "+Disco);
        System.out.println(" & Totall Amount will be: "+(Sum-Disco));
        
    }




    //Calculating Max no task
    static void Max2(int... No)
    {
        int Max1=Integer.MIN_VALUE;
        for(int i=1;i<No.length;i++)
        {
            //Max1=Math.max(i-1, i);
            if(No[i]>Max1)
            {
                Max1=No[i];
            }
        }
        System.out.println("Max: "+Max1);
    }
    //Valiadating the Variable Arguments 
    static void Show(int... x)
    {
        // for(int X:x)
        // {
        //     System.out.println(X);
        // }

        int Sum=0;
        for(int i=0;i<x.length;i++)
        {
            Sum+=x[i];
        }
        System.out.println("Sum: "+Sum);
        //Here x is a Array element
    }
    //what if wrote multiple method
    



    //Validating
    static boolean Validate(String Ab)
    {
        return Ab.matches("A-Za-z");
    }

    static boolean Validate(int Ab)
    {
        if((Ab>20)&&(Ab<=29))
        {
            return true;
        }
        return false;
    }


    static int Rev(int No)
    {
        int Pow1=0,No1=No;
        while(No1>1)
        {
            // int Rem=No%10;
            No1/=10;
            Pow1++;
            System.out.println("No:"+No1+" Pow: "+Pow1);
        }
        System.out.println("Poe=w: "+Pow1);
        int Ans=0;
        while(No>0)
        {
            int Rem=No%10;
            Ans+=Math.pow(10, Pow1)*Rem;
            No/=10;
            Pow1--;
            //System.out.println("Ans :"+Ans);
            //Pow is a impoertant factor here,assigning in it 1, will give same no
            //but assigning it to the total pow gives rev one
        }
        return Ans;
    }

    static int[] Rev(int A[])
    {
        int[] Array=new int[A.length];
        int j=0;
        for(int i=A.length-1;i>=0;i--)
        {
            Array[j]=A[i];
            j++;
            // System.out.print(A[i]+" ");
            //return Array[i];
        }
        return Array;
        //So to return the Array we should craete another one array
        //give different index variable its imp then just return the array variable

    }

    static int Area(int L,int B)
    {
        return L*B;
    }
    static int Area(int R)
    {
        return (int)Math.PI*R*R;
    }

    //Checking about the Overloading 
    static int Max(int a,int b)
    {
        return Math.max(a, b);
    }
    static int Max(int a,int b,int c)
    {
        int Ans=Math.max(a, b);
        return Math.max(c, Ans);
    }
    static float Max(float a,float b)
    {
        return Math.max(a, b);
    }
    static float Max(float a,float b,float c)
    {
        float Ans=Math.max(a, b);
        return Math.max(c, Ans);
    }

    //Method which finds the greates btw the array
    static int Max(int a[])
    {
        int Max1=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>Max1)
            {
                Max1=a[i];
            }
        }
        return Max1;
    }

    //Method to get the GCD of two numbers 
    static void GCD(int No1,int No2)
    {
        int Min=Math.min(No1, No2);
        for(int i=Min;i>0;i--)
        {
            if((No1%i==0) && (No2%i==0))
            {
                System.out.println("The GCD of "+No1+" & "+No2+" is: "+i);
                break;
            }
        }
    }



    //Method to check wheter the given no is a prime no
    static boolean Prime(int No)
    {
        for(int i=0;i<Math.sqrt(No);i++)
        {
            if(No%2==0)
            {
            return false;
            }
        }
        return true;


    }

    

    // static int Modify(int a)
    // {
    //     // int a=20; //there is an error duplicate local variable bcoz we got 2 declaration 1 in parameter other in here
    //     a=20;
    //     return a;
    // }

    static int Modify(int a[])
    {
        
        a[1]=20;
        return a[1];
    }
    
}
