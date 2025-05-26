import java.util.*;

public class HelloJava {
  public static void main(String[] ab) 
  {


    Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < 5; i++) {
    //   System.out.println("Hello Java");
    // }
    // // System.out.println("Enter the any Byte from -127 to 127");
    // // byte a=sc.nextByte();

    // // System.out.println("The byte is: "+a);

    // int c = 25;
    // System.out.println("SIze: " + Integer.toBinaryString(c));
    // // o/p--> 11001

    // int b = -25;
    // System.out.println("SIze: " + Integer.toBinaryString(b));
    // // 11001
    // // 1's Complement ...00110
    // // ...00110
    // // +1
    // // 2's Complement ...00111(hence the ans for -25(just showing last 5 digit in it
    // // though))
    // // one thing to note Thought && Though just difference is last t
    // // o/p--> 11111111111111111111111111100111

    // // once u have compiled and if u havent made any changes then aint neeed to
    // // compile it,just tell interpreter do its thing
    // // i.e java HelloJava only

    // // Lets check which float and double we can store
    // float f1 = 123456.123456f;
    // System.out.println("Float value is : " + f1);
    // // Ans is 123456.125 bcoz it will take 7 didgit of either left or right
    // // Lets take 7 on right side then
    // float f2 = 12.123456f;
    // System.out.println("Float 1 value is : " + f2);
    // // Yup, Thats Correct Ans--> 12.123456

    // // I think Same will go for double too
    // double d1 = 12345678908765.1234567890987;
    // System.out.println("Double value is : " + d1);
    // // Ans 1.2345678908765123E13
    // double d2 = 12345678908765.1234;
    // System.out.println("Double value is : " + d2);

    // // Lets to understand more about the Char print arigato
    // char aa = 0x3042; // why its printing ?
    // char ri = '\u308A'; // its giving error its cant resolve the variable
    // System.out.println(aa + " " + ri); // Lets look for it in NeatBeans i forgot we cant run them in terminal
    // String arigato = "\u3042\u308A\u304C\u3068\u3046";
    // System.out.println(arigato);
    sc.close();



    // Lets c about println() statement
    // int x1 = 10, y1 = 20;
    // System.out.println(x1 + y1 + " This is an ans");//30 This is an ans

    // System.out.println("This is an ans "+x1 + y1 ); //This is an ans 1020
    //ans come 1020 bcoz unlike above one this one did concatenation BTW String And NO result into String


    //C lang Statement use that printing one
    int M1=11;
    System.out.printf("%d is deciaml int, %o is octal, %x is a hex",M1,M1,M1); //11 is deciaml int, 13 is octal, b is a hex
    //just format specifier thing

    float D1=10.1214f;
    System.out.printf("\nPrinting Using float one --> %f Printing Using scintific one --> %e || %g",D1,D1,D1);
    //Printing Using float one --> 10.121400 Printing Using scintific one --> 1.012140e+01 || 10.1214
    // 1.012140e+01 is a 1.0*10^1

    String S1="I'm Mahesh";
    System.out.printf("\nString ONe: %3$s Int No: %1$d Float One: %2$f Again Int No: %1$d ",M1,D1,S1);
    //Here in above example %1$d 1$ specifies the number of argument (i.e here 1$ is M1)

    int a1=10;
    int b1=-20;
    System.out.printf("\nAns is a :%05d and The +ve one:%1$(5d The -ve one:%2$(5d",a1,b1);  //Ans is a :00010 and The +ve one:   10 The -ve one: (20)
    //00010 here 5 tells the width of the output 
    //and 0 id for padding the remaining places

    float F1=123.1234f;
    System.out.printf("\nUnderstanding about Precision:%6.2f and 2nd one:%1$2.2f",F1);//Understanding about Precision:123.12 and 2nd one:123.12
    //here %6.2f indicate that there should be only only 2 digits after decimal point and before 6 
    //but if there more than 6 digits it dont loss them still printh them

    //Format to print the output using printf
    // %[Argument Index$][Flags][Width][.Precision]Conversion
    //Argument Index --> 1$,2$(u know about it)
    //Flags --> +,-,)
    //Conversion
    //char - C
    //int  - d(decimal),o(octal),x(hex)
    //float - f , e or g(for scintific one)
    //String  - s
  }

}





/*
 * C:\Users\INFINITY>cd /d D:\Programs\Abdul Bari Sir Java\Java
 * Basics\HelloJava.java
 * The directory name is invalid.
 * 
 * C:\Users\INFINITY>cd D:\Programs\Abdul Bari Sir Java\Java
 * Basics\HelloJava.java
 * The directory name is invalid.
 * 
 * C:\Users\INFINITY>cd /d "D:\Programs\Abdul Bari Sir Java\Java Basics"
 * 
 * D:\Programs\Abdul Bari Sir Java\Java Basics>javac HelloJava.java
 * HelloJava.java:1: error: ';' expected
 * import java.util.*
 * ^
 * 1 error
 * 
 * D:\Programs\Abdul Bari Sir Java\Java Basics>javac HelloJava.java
 * 
 * D:\Programs\Abdul Bari Sir Java\Java Basics>java HelloJava
 * Hello Java
 * 
 * this is how we run the program throught the cmd directly
 */

// with javap java.lang.Integer u get the related all the methods
/*
 * public static java.lang.String toHexString(int);
 * public static java.lang.String toOctalString(int);
 * public static java.lang.String toBinaryString(int);
 */
