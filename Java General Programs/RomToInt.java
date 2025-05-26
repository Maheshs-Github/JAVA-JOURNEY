import java.util.*;
public class RomToInt 
{
    public static void main(String[] args) 
    {
        // Romaon To Int
        // int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rom No:");
        String RomNo=sc.next();

        // System.out.println("The Rom No is:"+RomNo);
        // System.out.println("And It's Length is:"+RomNo.length());

        int IntAns=0;
        for(int i=0;i<RomNo.length();i++)
        {
            char RomChar=RomNo.charAt(i);

            if(RomNo.charAt(i)=='I' && RomNo.charAt(i+1)=='V')
            {
                IntAns-=2;
            }
            if(i+1<RomNo.length()   RomNo.charAt(i)=='I' && RomNo.charAt(i+1)=='X')
            {
                IntAns-=2;
            }

            if(RomChar=='I')
            {
                IntAns+=1;
            }
            else if(RomChar=='V')
            {
                IntAns+=5;
            }
            else if(RomChar=='X')
            {
                IntAns+=10;
            }
            else if(RomChar=='L')
            {
                IntAns+=50;
            }
            else if(RomChar=='C')
            {
                IntAns+=100;
            }
            else if(RomChar=='D')
            {
                IntAns+=500;
            }
            else if(RomChar=='M')
            {
                IntAns+=1000;
            }
        }
        System.out.println("The Ans is: "+IntAns);
        sc.close();
    }
    
}
