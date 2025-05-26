public class Function
{
    public static void main(String[] args) 
    {
        int a=10,b,c=10;
        char d1;
        b=Total(a,c);  //Argumets or Actual Arguments
        System.out.println("Value b:"+b);
        d1=Abc();
        System.out.println("\nValue of Char B:"+d1);

        // Now lets c that,
        // u know about the parameter and arguments right?
        //For understanding c line 7 and line 27(it may change with further conding)
        //But lets understand the difference btn Arguments  and parameter
        //Arguments r the actual values passed to the function when it is called
        //Parameter r the dummy values passed from function call to the fun defination

    
        //Function F1=new Function();
       //d=F1.NoTotal(a, c);
        //System.out.println("\nValue of NoTotal B:"+d);

        //System.out.println("\nValue of NoTotal B Directly:"+F1.NoTotal(a, c));


        //Now lets c about that
        //Argument can have constant/variable/expression
        int Sum1=Sum(a*a+10-10,a+a+20-20);
        System.out.println("Sum: "+Sum1);

       
        
    }
    //Defining method without craeting its instance
    static int  Total(int x,int y)  //Formal Arguments or parameters 
    {
        //int Total1=x+y;
        int T2=x+y;
        //return Total1,T2;  we cant return 2 Data Members at once 

        //return Total1-T2; 
        //return (Total1+Total1-T2); The Expression can be return in the statement
        //return 1; //we can return any nuber as well which have no sense but can make sense
                  //see here  Abc()
        return T2;
        //return statement can return variable/constant/expression
        


    }
    //Parameter can have variable only
    static int Sum(int a,int b)
    {
        int C=a+b;
        return C;

    }
    static char Abc()
    {
        int Per=90;
        //char Grade='A';
        // if(Per>=90)
        // Grade= 'A';
        // else
        // Grade= 'B';
        // System.out.println("Grade"+Grade); //If we dont want to return anything
        if(Per>=90)
        return 'A';
        else
        return 'B'; //Using return statement

        //Alwayts remember if u r going to return anything always mention it in function
        //defination
        

    }
    //Method which will be called by object
    // int  NoTotal(int x,int y)
    // {
    //     int Total1=x+y;
    //     return Total1;


    // }

    //Cannot make a static reference to the non-static method 
    //Total(int, int) from the type Function
    //u often get that above error,its because u r using simple java program
    //that do not have any object, if u havent created any object that mean the 
    //method is belong to the class not an object,thats why u should use static keyword there

    //Remeber
    //Can we define any method inside of an main method, like lets define Total inside of 
   //main, its cant be done no mehod can be defined inside another, but can be called

    //  In Java, the static keyword is used to define methods, variables, or nested 
    // classes that belong to the class itself, rather than to any specific instance of 
    // the class. Here’s why you need to use static for methods in a class:
}