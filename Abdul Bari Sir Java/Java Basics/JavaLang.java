// import java.lang.*; //it's actually the default package, even we dont import it its actomatically gets imported 
// import java.lang.reflect.*;
public class JavaLang 
{
    public static void main(String[] args) 
    {
        // Object O1=new Object(); //the Object class is a parent of all the classes 
        // //Lets c methods avaliable
        // System.out.println(O1);//java.lang.Object@372f7a8d
        // System.out.println(O1.toString()); //java.lang.Object@372f7a8d
        //so we print the obj its automatically calls the toString() method
        //we know all oter methods of it too
        //one more thing to show is that as we said taht Object class is parent calss of all other classes including user defined classes
        // Mahesh M1=new Mahesh();
        // M1.  see get all those methods of Parent class i.e Object class 

        // /Lets come back to its methods again, Lets overide the metods of the Obj
        // Mahesh M1=new Mahesh();
        // // Mahesh M2=new Mahesh();
        // System.out.println("tostring Ans: "+M1);
        // System.out.println("hashcode Ans: "+M1.hashCode());
//Ans
// tostring Ans: This is a to String now
// hashcode Ans: 1000        
        // System.out.println((M1.hashCode()).eqauls(M2.hashCode()));


        //More about the Wrapper Classes
        // Integer I1=10; //we direcly set the value 
        // Integer I2=Integer.valueOf(10); //or using valueOf()
        // System.out.println("Value of I1: "+I1+"\nValue of I2: "+I2);

        // Byte B1=5; //Direcly
        // byte a=5;
        // Byte B2=Byte.valueOf(a); //giving byte value to the valueOf() method
        // // Byte B4=Byte.valueOf(8); //it's gives the error bcoz 8 is consideres as an int here, but we need byte so follow above approch
        // Byte B3=Byte.valueOf("5");
        // System.out.println("Value of B1: "+B1+"\nValue of B2: "+B2+"\nValue of B3: "+B3);

        // Short S1=15;
        // Short S2=Short.valueOf("15");
        // short b=15;
        // Short S3=Short.valueOf(b);
        // System.out.println("Value of S1: "+S1+"\nValue of S2: "+S2+"\nValue of B3: "+S3);

        // Float F1=20.4f;
        // Float F2=Float.valueOf(b) same methods

        // Double L1=25.4;
        // Double D2=Double.valueOf(b) same methods here too

        // Long L1=(long) 12;
        // Long L2=Long.valueOf(b) same

        // Character C1='A';
        // char C3='B';
        // Character C2=Character.valueOf(C3); //same

        // Boolean BO1=true;
        // Boolean BO2=Boolean.valueOf("true"); //same as usual


        //Lets c about the UnBOxing
        // Float F1=Float.valueOf("12.3");
        // float d=F1.floatValue(); //UNBoxing
        // float e=F1; //Auto UnBoxing
        // System.out.println("UnBoxing Value is: "+d+" e: "+e);;
        // //its Unboxing taking the obj data to the primitive ones
        // float f=133.5f;
        // Float F3=Float.valueOf(f); //it is called as Boxing (using method)
        //         Float F4=f;  //It's Auto Boxing (Direcly converting the Primitive into the Obj(or maybe u can say wrapping it))
        // System.out.println("F3: "+F3+" F4: "+F4);


        //Let's the Integer Class
        // int i=1;
        // Integer I1=Integer.valueOf(i); //Boxing
        // Integer I2=i; //Auto Boxing
        // int j=I1.intValue(); //UnBoxing
        // int k=I2; //Auto UnBoxing
        // System.out.println("I1: "+I1+" I2: "+I2+" J"+j+" k: "+k);
        // // I1: 1 I2: 1 J1 k: 1
        // //Lets c the Methods of Integer obj
        // System.out.println(I1.doubleValue()); //Ans 1.0 (not only for double but also for all the number class sub class(in total 6))
        // System.out.println(I1.compareTo(I2)); //Ans 0
        // System.out.println(I1.equals(I2)); //true
        // System.out.println(I1.equals(j)); //true (i.e we xcan comapre primitive with a obj too)
        // // Integer I3=Integer.valueOf("11111", 2); //I3: 31 (we can give Hex,Bin,Oct value and convert them inti the int)
        // // Integer I4=Integer.valueOf("FF", 16); //I3: 255
        // System.out.println(Integer.parseInt("123")); //123
        // // System.out.println("I3: "+I4);
        // //Simply reversing the No
        // int a=123;
        // // Integer I5=a;
        // // int b=Integer.reverse(a);
        // System.out.println("Rev: "+Integer.reverse(a));(Reverse didnt work, will see about it )


        //Lets see the Float class
        // float a=19.4f;
        // Float F1=Float.valueOf(a);//Boxing
        // Float F2=a; //AutoBoxing
        // float b=F1.floatValue(); //UnBoxing
        // float c=F2; //auto UNBoxing
        // System.out.println("b: "+b+" c: "+c);
        // //To Check If the no is InFinte or not
        // float d=c/0;
        // System.out.println("Is INfinite: "+Float.isInfinite(d)); //Is INfinite: true
        // System.out.println(d==Float.POSITIVE_INFINITY); //Another way to check if no is Infinte or not
        //Checking the if the number is ISNAN or not 
        // Float e=(float)Math.sqrt(-1); //Ans false (sqrt of -1 is not a number)
        // Float f=(float)Math.sqrt(9);
        // System.out.println(f==Float.NaN);



        //Learning about String And StringBuffer And StringBuilder
        // String S1=new String("Hello");
        // StringBuffer S2=new StringBuffer("Hello");
        // StringBuilder S3=new StringBuilder("Hello");

        // System.out.println(S1.concat("World"));
        // System.out.println(S2.append("World"));
        // System.out.println(S3.append("World"));
//Ans
// HelloWorld
// HelloWorld
// HelloWorld        

        //But lets see as this 
        // S1.concat("World");
        // S2.append("World");
        // S3.append("World");
        // System.out.println(S1);
        // System.out.println(S2);
        // System.out.println(S3);
//Ans
// Hello (so here S1 and S1.concat are not the Same thats bcoz String are not mutable its creates the new obj for any modification done)
// HelloWorld
// HelloWorld
        


        //Math Class
        // System.out.println(Math.abs(-12.3)); //Ans 12.3(To get the Absolute value (Non-Negative value))
        // System.out.println(StrictMath.abs((-12.3))); //Ans 12.3 (well we might not use it )
        // System.out.println(Math.cbrt(27)); //Ans 3.0 (Just to find the Cube Root)
        // int i=Integer.MIN_VALUE; //-2147483648
        // i--;  //Ans 2147483647 so when we decerement the min int value its gives max int value(its just overflowes)
        // System.out.println(i);
        //for to take care of that
        // System.out.println(Math.decrementExact(10)); //9
        // System.out.println(Math.decrementExact(i)); //yup erroe thats exact for yaa
        // System.out.println(Math.floorDiv(50, 9));//Ans 5(just floor division ) 50/9=5.5(Floor division 5)
        // System.out.println(Math.ceilDiv(50, 9));//Ans 6(just Celilng Division)
        // System.out.println(Math.max(10, 12));
        // System.out.println(Math.toRadians(90)); //Ans 1.5707963267948966
        // System.out.println((int)(Math.random()));//Ans 0 retuens float value btw 0 to 1
        // System.out.println((int)((Math.random())+1)*1000);
        // System.out.println(Math.pow(10, 2));//Ans 100.0
        // System.out.println(Math.multiplyExact(100, 8284567));//Ans 828456700



        //Enum (It's used for Enumerated Data types, it is user defined one)
        // Subjects S1=Subjects.JAVA;
        // System.out.println(S1); //JAVA
        // // Subjects S1=C; //Error we can't assign the new values 
        // System.out.println(S1.ordinal()); //Ans 0(just tells the order/Index)
        // System.out.println(S1.name()); //Ans JAVA
        // System.out.println(Subjects.valueOf("JAVA")); //Ans JAVA
        // Subjects SB1[]=Subjects.values();
        // System.out.println(SB1);//[LSubjects;@3f99bd52
        // for(Subjects Ans:SB1)
        // {
        //     System.out.println(Ans);
        // } //this how we print the array
        //JAVA
    // JAVASCRIPT
    // PYTHON

        //Checking about enum constructor
        // Subjects S2=Subjects.JAVASCRIPT;
        // System.out.println(S2);
// JAVA
// JAVASCRIPT
// PYTHON
// JAVASCRIPT        
//So how all the values of the Subjects have to been printed,it's bcoz of teh constructor, for all the values(identifier has been created ), its calls the 
//constructor for each identifier
        // Subjects S3=Subjects.JAVA;
        // System.out.println(S3); //Ans JAVA 0



        //Reflection Package
        // import java.lang.reflect.*; that how we impoer it
        //as in IDE after any class obj when we . its gives suggestion is it possible for us to do it for userdefined class
        // Mahesh1 M1=new Mahesh1();
        // Class C1=M1.getClass();
        // System.out.println(C1.getName());





        
    }
    
}

//About reflection package
class Mahesh1
{
    public int NO;
    // private String Name;
    protected String Addr;
    long MobNo;

    Mahesh1()
    {
        System.out.println("THis is non-para constructor");
    }

    Mahesh1(int No,String Name)
    {
        System.out.println("THis is para constructor");
    }
}


//Enum
enum Subjects
{
    // JAVA,JAVASCRIPT,PYTHON;
    //we can also give the values to the identifiers, just make sure to pass them as na parameter to the constructor
    JAVA(1,"Intermediary"),JAVASCRIPT(2,"Beginner"),PYTHON(3,"Dunno");
    //one advatnge of using enum can be that we  can use it as constructor
    //also when enum is loaded its obj r created,also more importanlty its creates the set of constant
    int No;
    String Level;
    private Subjects(int No,String Level) //the constructor should be private or deafault
    {
        // System.out.println(this.name());
        this.No=No;
        this.Level=Level;

    }
    public String toString()
    {
        return this.name()+" "+this.ordinal();
    }
}
//In JAva, enum classes stores the public static final values, u can see above those arent the variable but the values have been directly declared
//those values are the identifier(variable) itself
//we can also create the constructor of enum class




class Mahesh
{
    public String toString()
    {
        return"This is a to String now";
    }
    public int hashCode()
    {
        return 1000;
    }

}
