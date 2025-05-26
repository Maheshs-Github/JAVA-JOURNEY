import java.util.Scanner;

public class Recursion 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the NUmber:");
        int Num=sc.nextInt();
        int Fact=Factor(Num);
        System.out.println("Factorial is:"+Fact);
        sc.close();

        
    }
    static int Factor(int Num)
    {
        if(Num==0 || Num==1)
        return 1;
        else
        {
            int f;
            f=Factor(Num-1);
            System.out.println(f);
            return f;
        }
    }
    
    
}
