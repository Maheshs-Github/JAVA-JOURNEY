public class AdvFunction 
{
    public static void main(String[] args) 
    {
        //********Function Overloading**********
         int a=10,p;
         float b=10.0f;
         double c=10.0;
         p=Sum(a);
         System.out.println("Addition"+p);
         Sum(b);
         Sum(c);

         //Lets take a different example
         int L=20,M;
         float F=-21313f,G;
         M=AddF( L);
         System.out.println("Addition"+M);
         G=AddF(F);
         System.out.println("Addition"+G);


        
         //Function with variable no. of arguments
         int a1=10,a2=20,a3=30,a4=40;
         NSum(a1,a2);
         NSum(a1,a2,a3);
         NSum(a1,a3,a4);

         //so in it one function defination can take various no of arguments
    }

    static int Sum(int p)
    {
        int Add=p+p;
        //System.out.println("Addition"+Add);
        return Add;   //with return statement 
    }

    static void Sum(float p)
    {
        float Add=p+p;
        System.out.println("Addition"+Add);
    }

    static void Sum(double p)
    {
        double Add=p+p;
        System.out.println("Addition"+Add);
    }

    //Just Checking for if else using ternary

    static int AddF(int a)
    {
        // int b=(a>0?a:a-1);  //so this is ternary one actually
        // return b;          // we aint return the ternary result rather than we just stored 
                          //another variable

        //another way without storing
        return (a>0?a:a-1);

    }

    static float AddF(float a)
    {
        return (a>0?a:a-1);
    }


    static void NSum(int... a)
    {
        int total=0;
        for(int value:a)
        {
            total+=value;
            System.out.printf("The total till Numbers %d is: %d\n ", value,total);
            //u can also print as C language i.e Using C language printf Statement
        }
        
        System.out.println("The Sum is:"+total);

    }
    
}
