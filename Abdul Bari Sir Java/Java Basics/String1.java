public class String1 
{
    public static void main(String[] args) 
    {
        // byte b1[]={65,66,67,68}; //its byte so aint needing the ""
        // String Str=new String(b1); //i thought we need to provide array
        // String str2=new String(b1,2,1);//u have starting point and the length, which will construct new String
        // System.out.println(str2);
        // System.out.println(Str);
        // // Ans
        // C
        // ABCD

        // String Str1=new String("Java Programing");
        // char C1[]={'A','B','C','D'};
        // String Str2=new String(C1);
        // System.out.println("String 1: "+Str1);
        // System.out.println("String 2: "+Str2);

        // char c[]= {'M','D','u','n','n','o'};
        // System.out.println(c);

        // //let c the == operator thing
        // String S1="Java";
        // //String S2="java";
        // String S2=new String("Java"); //now 1 obj will be created i a heap and other in a pool
        // //so they aint r equal
        // if(S1==S2)
        // {
        //     System.out.println("Both Rferences ponts to the same memory add.");
        // }
        // else
        // {
        //     System.out.println("Both References point to the diff. memory add.");
        // }
        //ans Both References point to the diff. memory add. as Java & java is nit same literal they cant be saved as one


        //Methods of String Class
        // String Str1="Java";
        // int Len=Str1.length();
        // System.out.println("Length: "+Len);  

        // //String Objects are Immutable(they cant be modified)
        // System.out.println(Str1.toLowerCase()); //it will craete the diff String than Str1
        // System.out.println("The Original Obj: "+Str1);
        // // //just u saw that then Strings r Immutable, Str1 one will still have the same value as Java, no cahnge in Str1,even with toLowerCase
        //Ans java
        // The Original Obj: Java
        // //Same goes for toUpperCase

        // String Str2="  Java  is   old one "; //We can trim the blank spaces using trim function
        // //and again trim fun do not change the original String rather it creates another String
        // System.out.println(Str2.trim()); //yup all spaces has been removed
        // System.out.println("Original STring: "+Str2);//    Java   (yup its the same one )
        // //what if i do this 
        // Str2=Str2.trim();
        // System.out.println("Last String: "+Str2);//yeah we just override it 
        //Ans Last String: Java

        // //Creating substring
        // String Str1="Java Program";
        // String Str3=Str1.substring(4);
        // String Str4=Str1.substring(1,4);
        // System.out.println(Str3);//_Program (it also considers the Spaces )
        // System.out.println(Str4); //i think result will be --->ava
        // //here imp thing to understand about the printing substring is that
        // //      Java
        // //index-0123
        // //to print ava= Start Index=1 and end Index should go 1 place more further (i.e 4)

        // //replacing the char 
        // String Str5=Str1.replace('v', 'b');
        // System.out.println("Replacing :"+Str5); //Jaba

        // //Also to get all the methods realted to the specific just do give 
        // String Str6="JAVA";
        //just typing Str6. //will give the list of methods avaliable
        // System.out.println( Str6.charAt(2));

        // //Check uSing startWith and endWith
        // String Str7="https://Google.com";
        // System.out.println(Str7.startsWith("https"));//true
        // System.out.println(Str7.endsWith("com")); //true
        // System.out.println(Str7.charAt(10));//to print the charcter at perticular index

        // System.out.println(Str7.indexOf("o"));//based on cahr to tell the index
        // //o for 1st time is at 9th index so ANS IS 9

        // System.out.println(Str7.indexOf("o", 11));//Ans is 16
        // // //this time it aint checked for 9 or 10th as Start Index is given 11

        // System.out.println(Str7.lastIndexOf("o"));//ans Should be 16
        // //just search from right to left

        // String S1="JAVA";
        // String S2="java";
        // String S3="python";
        // String S4="python";

        // String S5=new String("python");

        //equals method
        // System.out.println(S3.equals(S4));//ans true
        // System.out.println(S4.equals(S3));//ans true
        // //doesnt matter which one we r comapring with
        // System.out.println(S1.equals(S2));//they r not equal ans shoul be false as their cases r different 
        // //If i have ignore the Case while Comapring them i can use 
        // System.out.println(S1.equalsIgnoreCase(S2));//answill be true
        //lets see about the S4 and S5 too
        // System.out.println(S5.equals(S4)); //true, compared the actual values, ain't care about the refernces
        // System.out.println(S3==S4); //true, it checks the refernces
        // System.out.println(S3==S5);
        
        // System.out.println(S2.compareTo(S4));//ans is -6 as j from java is comes 1st in dictionary
        // System.out.println(S4.compareTo(S2));//asn is 6 as p python is bigger value than j(Python > Java)
        // System.out.println(S2.compareTo(S2));//ans should be 0   
        // //lets comapre S1,S2
        // System.out.println(S2.compareTo(S1));//ans will be in +ve
        // //its coz of,In unicode A-Z is 65-90 & a-z is 97-122


        // //understanding about difference btw == and equals()
        // //I think basically 1. == operatoe checks the reference(addr. of String) like if 2 variavle points to the same memory addr they will be equal
        // //2. with eqauls() method it checks the actual data in that variable or reference 
        // String S11="java";
        // String S22="java";
        // String S33=new String("java");
        // System.out.println(S11==S22);//ans is true
        // System.out.println(S11==S33);//defenitly false
        // //yup just understood
        // //lets c equals() then 
        // System.out.println(S11.equals(S22));//true
        // System.out.println(S11.equals(S33));//i think true too
        //yup got the concept then............................
        //so Basically with equals() we comapre the actual data 
        //but with == we compare reference of obj(addr of obj)

        //we r checking Regular Expression here
        // String Str1="A";
        // System.out.println(Str1.matches("."));//asn is true
        // //here to matches method we give the . expression it sprint the true if the String consist of single Char such as digit,alphabet or symbol 
        String Str2="abc.com";
        // String Str3="a";
        // String Str4="h4";
        // String Str5="jF7";
        System.out.println(Str2.matches("."));//false 
        // //but 
        // System.out.println(Str2.matches("[abc]"));//actually ans is still false
        // System.out.println(Str2.matches("[abc]"));//this true Part of Case
        // System.out.println(Str3.matches("[^dbc]"));//it will bw true i g
        // //cap means not actually (opposite of what actually it is)
        // //lets check for 
        // System.out.println(Str1.matches("[a-z0-9]"));//false
        // //to make true below should do it
        // System.out.println(Str1.matches("[a-zA-Z0-9]"));//true
        // System.out.println(Str3.matches("[a-z0-9]"));//true
        // System.out.println(Str3.matches("[a-z][0-9]"));//false probaly
        // System.out.println(Str4.matches("[a-z][0-9]"));//true
        // //just we need both of them in it
        // System.out.println(Str5.matches("[a-z][A-Z][0-9]"));//true
        // System.out.println(Str3.matches("[a-z]|[0-9]"));//true 

        // //Lets c about the Meta Char
        // System.out.println(Str3.matches("\\w"));//will be true guess as it have both alphabet and digit
        // System.out.println(Str1.matches("\\S"));//means not a Space ans will be true 



        //Student Challenge 
        //Find if the email id is on gmail
        //Find UserNAme and domain name from email(got this one lets c)

        // String S1="Programmer@gmail.com";

        // String S2=S1.trim(); //we just use trim to remove any spaces, It can be optional
        // System.out.println(S2);
        // int Index=S2.indexOf("@"); //with this method we find the index of any char(digit including)
        // String Domain=S2.substring(Index+1);
        // //After finding Index of @ onlty thing remain to print is that print those part
        // // I mean @ divide Username and domain differenly
        // System.out.println("Domain NAme is: "+Domain);
        // String UserName=S2.substring(0, Index);
        // System.out.println("UserNAme is a: "+UserName);
        // //ans Domain NAme is: gmail.com
        // //UserNAme is a: Programmer

        // //Lets c if the email and gmail matches or not 
        // if(Domain.startsWith("g"))
        // {
        //     System.out.println("Email ID is on Gmail");
        // }
        // else 
        // {
        //     System.out.println("Email ID is not a gmail");
        // }

        // //Lets use another way using compareTo
        // int Dind=Domain.indexOf(".");
        // System.out.println(S2.charAt(Index));
        // System.out.println(S2.charAt(Index+Dind+1)); //here w need to consider full lenght so to get right index to
        // //put as endIndex we checked it

        // System.out.println(Index);
        // System.out.println(Index+Dind);


        // String ComS1=S2.substring(Index+1,Index+Dind+1);
        // System.out.println(ComS1);
        // int ReallyEqual=ComS1.compareTo("gmail");//if both equal the ans comes 0
        // //if here ComS1 was greater(value from dict) it would be +ve else -Ve 
        // if(ReallyEqual==0)
        // {
        //     System.out.println("Email ID is on Gmail");
        // }
        // else 
        // {
        //     System.out.println("Email ID is not a gmail");
        // }


    }
    
}
