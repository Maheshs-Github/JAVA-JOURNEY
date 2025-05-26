// import java.io.*;

// import java.io.FileInputStream;
// import java.io.FileReader;

public class Exceptions 
{

    public static void main(String[] args) //throws Exception //throws ArithmeticException
    {
        // try
        // {
        // int a,b,c;
        // a=10;
        // b=0;
        // c=a/b;
        // System.out.println("The ans: "+c);
        // System.out.println("this 2 sentensec willstill execute ");
        // System.out.println("End of the program ");
        // int d=5;
        // System.out.println("D: "+d);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("Error... The Division by o "+e);

        // }
        //Ans
        //Error... The Division by o java.lang.ArithmeticException: / by zero
        //If thr Exception occurs the code inside of the try block aint get execued so we can jyst wrirte it as below


        
    //     int a,b,c;
    //     a=10;
    //     b=0;
    //     try
    //     { //we also write it here,as exception occur might only here
    //     c=a/b;
    //     System.out.println("The ans: "+c);
    // }
    // catch(ArithmeticException e)
    // {
    //     System.out.println("Error... The Division by o "+e);

    //   }
    //     System.out.println("this 2 sentensec willstill execute ");
    //     System.out.println("End of the program ");
    //     int d=5;
    //     System.out.println("D: "+d);
//Ans
// Error... The Division by o java.lang.ArithmeticException: / by zero
// this 2 sentensec willstill execute 
// End of the program 
// D: 5        



        //Lets c about the multiple catch blocks
        // try
        // {
        //     int A[]={10,0,4,6,3,5};
        //     int c=A[0]/A[1]; //Division by 0(ArithmeticException)
        //     System.out.println("The Division is: "+c);
        //     for(int i=0;i<=A.length;i++)
        //     {
        //         System.out.println(A[i]); //Array will go until i<A.length
        //     }
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e); //no need to print the msg as the obj will print it
        // }
        // catch(IndexOutOfBoundsException I)
        // {
        //     System.out.println(I);
        // }
        //We can also donested try catch as per need



        //Lets c about the Checked(Compulsary to write) And Unchecked Exception(Optional to write)
        // Lets try wriring the Exception which calls one fun then another there we can use printStackTrace()
        // Fun1();



        // //Lets c about throw and throws 
        // Meth1();
        // System.out.println("The Ans is.. ther is no Ans IN Meth1");
//Area: -60  (As u can See area cant be -ve , so for that lets write the User Defined Exception)
// Area: -60
// The Ans is.. ther is no Ans
// The Ans is.. ther is no Ans IN Meth1   

//After the Exception
// The Number can't be Negative 
// The Ans is.. ther is no Ans
// The Ans is.. ther is no Ans IN Meth1



        //Finally block

        // try
        // {
        // System.out.println(10/0);
        // }
        // finally
        // {
        //     System.out.println("This is the End...");
        // }
//Ans  This is the End...
// Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at Exceptions.main(Exceptions.java:102)        
        //So about the Finally block, its get executed irrrespective to the Exception occur or not,even without 
        //catching the Exception(try and finally)
        //actually if we have try and catch we dont need to write the catch block
        // try
        // {
        // System.out.println(10/0);
        // }
        // catch(ArithmeticException A1)
        // {
        //     System.out.println(A1);
        // }
        //     System.out.println("This is the End...");
// java.lang.ArithmeticException: / by zero
// This is the End...   
//yup Handled Exception and other Ans too

        //but there is also one thing is that, Aren't we suppose to supposed to write try and xatch block in teh 
        //calling method or its okay if we just wriring it in main method, lets aboit it then

        try
        {
        int Ans1=Ans(10,0);
        System.out.println("Ans: "+Ans1);
        }
        catch(ArithmeticException A1)
        {
            System.out.println(A1);
        }
        System.out.println("It will still execute");
        


        //Checking about try with resources
        // try
        // {
        // int a=Meth11();
        // System.out.println("A: "+a);
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }





        //student Challenge
        // try{
        // Stack S1=new Stack();
        // S1.Push(10);
        // S1.Push(20);
        // S1.Push(30);
        // S1.Pop();
        // S1.Display();
        // S1.Pop();
        // S1.Display();
        // S1.Push(40);
        // S1.Push(50);
        // S1.Push(60);
        // S1.Display();
        // S1.Pop();
        // S1.Pop();
        // S1.Display();
        // S1.Push(70);
        // S1.Push(80);
        // S1.Push(90);
        // S1.Display();
// //Ans
// Stack Elements:
    //    10
    //    40
    //    70
    //    80
    //    90   


    // (now lets overflow the satck)  
    // S1.Push(100);
    //     S1.Display();   
//Ans
// Stack Elements:
    //    10
    //    40
    //    70
    //    80
    //    90
// The Stack is Overflowed,Can't add any more elements no space to 


            //(now lets try to underflow it)
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Display();
// Ans        
// The Stack is underflowed,Can't retreive any more elements As their NONE
        //It should need 6 to undeflow it lets c with 5
        
        // }
        // catch(StackOverFlowException SO)
        // {
        //     System.out.println(SO);
        // }
        // catch(StackUnderFlowException SU)
        // {
        //     System.out.println(SU);
        // }



        //Using Sirs Logic
        // try
        // {
        //     Stack1 S1=new Stack1(5);
        //     S1.Push(10);
        //     S1.Push(20);
        //     S1.Push(10);
        //     S1.Push(20);
        //     S1.Push(10);
        // S1.Display();
//Ans
// Stack Elements: 
    //    10
    //    20
    //    10
    //    20
    //    10        
            // S1.Push(20);
//Ans
// The Stack is Overflowed,Can't add any more elements no space to 
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Pop();
        // S1.Display();
//Ans        
// The Stack is underflowed,Can't retreive any more elements As their NONE

        // }
        // catch(StackOverFlowException SO)
        // {
        //     System.out.println(SO);
        // }
        // catch(StackUnderFlowException SU)
        // {
        //     System.out.println(SU);
        // }


                

        
        
    }


        
    // try with resources
    // static int Meth11() throws Exception
    // {
    //     FileInputStream F1;
    //     try
    //     {
    //         F1=new FileInputStream("Abc.txt");
            

    //     }
    //     finally
    //     {
    //         F1.close();
    //     }

    // }

    //check about where to write the try and catch 
    static int Ans(int l,int b) throws ArithmeticException
    {
        if(b==0)
        throw new ArithmeticException();
        int AArea=l/b;
        System.out.println("Area: "+AArea);
        return AArea;

    }


    //About throw and throws
    static void Meth1()
    {
        try
        {
        int Area1=Area(-10,6);
        System.out.println("Area: "+Area1);
        }
        catch(NegativeException N1)
        {
            System.out.println(N1);
        }
        System.out.println("The Ans is.. ther is no Ans");
    }
    static int Area(int l,int b) throws NegativeException
    {
        if(l<0 || b<0)
        throw new NegativeException();
        int AArea=l*b;
        System.out.println("Area: "+AArea);
        return AArea;

    }

        


    //Checked And UnChcked Exeption
    static void Fun1()
    {
        Fun2();
        //Now lets also try to see about checked Exception(Compulsary to write)
        // FileInputStream F1=new FileInputStream("abc.txt"); //so here u will see the FileNotFoundException and without handling taht Exception u cant run the program(Checked Exception) without it
        //bcoz if that file isnt avalibale or curupted, then program will crash
        try
        {
            // int Balan=4688;
            // The Min Balance Should be 5k
            int Balan=5090; //No Exception
            if(Balan<5000)
            throw new MinBBalException();
        }
        catch(MinBBalException M1)
        {
            System.out.println(M1);

        }
    }
    static void Fun2()
    {
        Fun3();
    }
    static void Fun3()
    {
        // try
        // {
        // System.out.println("The Ans: "+(10/0)); //the division by 0 error
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        //Ans with ArithmaticException while printing e or e.toString
// java.lang.ArithmeticException: / by zero
//Ans with getMessage method
// / by zero

//Ans Without handling the Exception
// Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at Exceptions.Fun3(Exceptions.java:93)
        // at Exceptions.Fun2(Exceptions.java:89)
        // at Exceptions.Fun1(Exceptions.java:85)
        // at Exceptions.main(Exceptions.java:78)
    

        try
        {
        System.out.println("The Ans: "+(10/0)); //the division by 0 error
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //Ans 
        // java.lang.ArithmeticException: / by zero
        // at Exceptions.Fun3(Exceptions.java:103)
        // at Exceptions.Fun2(Exceptions.java:89)
        // at Exceptions.Fun1(Exceptions.java:85)
        // at Exceptions.main(Exceptions.java:78)
        //prints the calls of Exception too

    }

}

//About Craeting the User Defined Exception
class MinBBalException extends Exception
{
    public String toString()
    {
        return "The Min Balance Should be 5k";
    }
}

//User Defined Exception for non Negative Number
class NegativeException extends Exception
{
    public String toString()
    {
        return "The Number can't be Negative";
    }
}

//student Challenge
class Stack
{
    int StackEle[]=new int[5];
    int Top=-1,Top1=0;
    int Push(int Ele) throws StackOverFlowException
    {
        if(Top==(StackEle.length-1))
        throw new StackOverFlowException();
        System.out.println("Top: "+Top1++);
        Top++;
        return StackEle[Top]=Ele;
    }
    int Pop() throws StackUnderFlowException
    {
        // if(StackEle[0]==0)
        if(Top==-1)
        throw new StackUnderFlowException();
        // int X=StackEle[Top];
        // System.out.println("Top: "+Top);
        Top--;
        // return X;
        return StackEle[Top+1]=0;
    }
    void Display()
    {
        System.out.println("Stack Elements: ");
        for(int i=0;i<StackEle.length;i++)
        {
            
            System.out.println("       "+StackEle[i]);
        }
        
    }
}



//Writing class overflow Exception
class StackOverFlowException extends Exception
{
    public String toString()
    {
        return "The Stack is Overflowed,Can't add any more elements no space to ";
    }
}
class StackUnderFlowException extends Exception
{
    public String toString()
    {
        return "The Stack is underflowed,Can't retreive any more elements As their NONE";
    }
}

//Using Bari Sir's Logic
class Stack1
{
    private int Size;
    private int Top=-1;
    int S[];

    public Stack1(int Size)
    {
        this.Size=Size;
        S=new int[Size];
    }

    int Push(int Ele) throws StackOverFlowException
    {
        if(Top==(Size-1))
        throw new StackOverFlowException();
        Top++;
        return S[Top]=Ele;
    }
    int Pop() throws StackUnderFlowException
    {
        int X=-1;
        if(Top==-1)
        throw new StackUnderFlowException();
        X=S[Top];
        Top--;
        // return X;
        return X;
    }
    void Display()
    {
        System.out.println("Stack Elements: ");
        for(int i=0;i<S.length;i++)
        {
            
            System.out.println("       "+S[i]);
        }
        
    }


}