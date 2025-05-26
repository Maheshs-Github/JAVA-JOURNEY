// class OOPs1
// {
//     //but this is a diffrent class so we can't assign the values 
//     //of variable outside ogf this class or in a main method
//     private int Len;
//     private int Brd;

//     int GetLen() //To read the data (Getter)
//     {
//          return Len;
//     }
//     //Say if we want the len to be alwatys +ve using setter method
//     //we can validate it too
//     void SetLen(int i) //To Set/Write the Data (Setter)
//     {
//         if(i>0)
//         Len=i;
//         else
//         Len=0;
//     }

//     int GetBrd()
//     {
//          return Brd;
//     }
//     void SetBrd(int i)
//     {
//         Brd=i;
//     }


//     public float Area()
//     {
//         return Len*Brd;
//     }
//     public float Peri()
//     {
//         return 2*3.14f*Len;
//     }
// }

import java.util.Random;
import java.util.Scanner;

public class OOPs 
{
    private int Len;
    private int Brd;

    OOPs()//defalut constructor
    {

    }
    OOPs(int i,int b) //parameterized Constructor
    {
        Len=i;
        Brd=b;
    }
    public float Area()
    {
        return Len*Brd;
    }
    public float Peri()
    {
        return 2*3.14f*Len;
    }
    //but here it is accesiable as the class contain the main 
    //method 
    
    public static void main(String[] args) throws InterruptedException 
    {
        //Learning about the Data Hiding
        //OOPs1 O1=new OOPs1();
        // O1.Len=10; //we can set values like this but if Len and Brd 
        // //is Private we cant set the values outside of the class
        // O1.Brd=20;

        // OOPs1 OS1=new OOPs1();
        // //OS1.Len=10;
        // //for private Variable of another calss we cant set the data like this 
        // //for that pupose we use the getter and setter to get and set the values
        // //getter can be omiited if u dont eant to return that value 
        // OS1.SetLen(-10);
        // System.out.println("Get Len :"+OS1.GetLen());
        // System.out.println("The Area: "+OS1.Area());
        // System.out.println("The Peri : "+OS1.Peri());


        //Checkig about the Constrctor 
        // OOPs O1=new OOPs();
        // System.out.println("The area: "+O1.Area());
        // //ans The area: 0.0
        // OOPs O2=new OOPs(1,1);
        // System.out.println("The area: "+O2.Area());
        // //ans The area: 1.0        



        //Task 1
        //Creating the Product Class and Performing all tings on it 
        // Product P1=new Product(1, "Banana", 30.5f, 2);
        // System.out.println("The Product No: "+P1.GetINO());
        // System.out.println("The Product Name: "+P1.GetName());
        // System.out.println("The Product Prize: "+P1.GetPrize());
        // System.out.println("The Product Quantity: "+P1.GetQTY());
        // System.out.println("Setting the Product Quantit to the 5");
        // P1.SetQTY(5);
        // System.out.println("Lets genetare the bill then...\n");
        // P1.Bill();


        //Task 2
        //Now lets create the Customer class (lets try some diff things here)
        //So here what we want to do is that based om the cvalues perticular constructor will be called

        // String CID;
        // String Name;
        // String Addr;
        // long Pho;
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the ID: ");
        // CID=sc.nextLine();
        // System.out.println("Enter the Name: ");
        // Name=sc.nextLine();
        // System.out.println("Enter the Addr: ");
        // Addr=sc.nextLine();
        // System.out.println("Enter the Phone: ");
        // Pho=sc.nextLong();
        // Customer C1=new Customer(CID, Name, Addr, Pho);
        // C1.Display();
        // Customer C2=new Customer(CID, Name);
        // C2.Display();

        // Subject S1[]=new Subject[3]; //it is just an refrence to an obj not the obj itself 
        // S1[0]=new Subject("A1", "DS", 100, 89);
        // S1[1]=new Subject("A2", "Java", 100, 99);
        // S1[2]=new Subject("A3", "Kotlin", 100, 97);
        // //this 3 actuallly calls the obj

        // for(Subject X:S1)
        // {
        //     System.out.println(X);
        // }
        // System.out.println();
        // for(int i=0;i<3;i++)
        // {
        // System.out.println(S1[i]);
        // }
//ans
/*
Subject ID: A1 Subject Name: DS Subject Max Marks: 100 Subject Marks Obtained: 89
Subject ID: A2 Subject Name: Java Subject Max Marks: 100 Subject Marks Obtained: 99
Subject ID: A3 Subject Name: Kotlin Subject Max Marks: 100 Subject Marks Obtained: 97

Subject ID: A1 Subject Name: DS Subject Max Marks: 100 Subject Marks Obtained: 89
Subject ID: A2 Subject Name: Java Subject Max Marks: 100 Subject Marks Obtained: 99
Subject ID: A3 Subject Name: Kotlin Subject Max Marks: 100 Subject Marks Obtained: 97
*/        
        //here toString method is used to display the data without 
        //explicitly calling the method, it is done implicilty
        //ans without toString
        /*
         Subject@6f496d9f
Subject@723279cf
Subject@10f87f48

Subject@6f496d9f
Subject@723279cf
Subject@10f87f48
         */



         //just like the method overloading it is a constructor ovrloading
        //  Student S1=new Student("Mahesh");
        //  Student S2=new Student("Mahesh", 71);
        //  Student S3=new Student("M", 71);
        //  Student S4=new Student(71,"Mahesh");


        // //Learning about the Copy Constructor
        // Student S1=new Student();
        // S1.Name="M<ahesh";
        // S1.Addr="ksdd";
        // S1.Roll=1;
        // S1.Marks[0]=87;
        // S1.Marks[1]=96;
        // S1.Marks[2]=92;
        // //System.out.println(S1.toString()); //so that's how we print using it, mannn...
        // System.out.println(S1); //this one and above is same basically
/*
Implicit toString Calls: When you pass S1 or S2 to System.out.println(), 
Java will automatically call the toString method of the Student class. 
Therefore, System.out.println(S1); is equivalent to System.out.println(S1.toString());.
*/        


        // Student S2=new Student(S1);
        // S1.Roll=2; //but after copying values into the S2 we cahnge the values of S1 but it wont going to effect the 
        // //the already copied values (values of S2)
        // S1.Marks[2]=100; //now trying to change the array element after they have been copied they r likey  going to be 
        // //change with it,as array reference is passed rather than passing the values
        // for(int X:S1.Marks)
        // {
        //     System.out.println(X);
            
        // }
        // // System.out.println("Name: "+S1.Name+" Addr: "+S1.Addr+" Roll: "+S1.Roll);
        // System.out.println(S2.toString());
        // // System.out.println("Name: "+S2.Name+" Addr: "+S2.Addr+" Roll: "+S2.Roll);
        // for(int X:S2.Marks)
        // {
        //     System.out.println(X);
            
        // }
        
//Ans--->        
// 87
// 96
// 100
// Name: M<ahesh Addr: ksdd Roll: 2
// Name: M<ahesh Addr: ksdd Roll: 1
// 87
// 96
// 100      







        //lets c about the multilevel inheritance
        // Dog Doggy=new Dog();
        // System.out.println("The Dog is an animal with Legs "+Doggy.Legs+" , Dog "+Doggy.Activity+" & He Eat "+Doggy.Eat);
        // Mammls Mama=new Mammls();
        // Doggy.Eats();
        
//Ans
// The Dog is an animal with Legs 4 , Dog Bark & He Eat Food
//Eats Food... //its the ans of overriding the 2nd one is got exacuted which was from the Doggy class, not from parent one(Mammal)
//The info took from all other classes and without any need to redefine it 
    // Mama.Eats();
    //ans Eats Anything...



    //Lets c about abstract classes and stuff 
    // Dog1 D1=new Dog1();
    // D1.Eats();
    // D1.Walk();
    // System.out.println(D1.Color); //ans Brown


    // Chicken C1=new Chicken();
    // C1.Eats();
    // C1.Walk();
    // C1.CahngeColor();
    // System.out.println(C1.Color);

    // Animal1 A1=new Animal1();  we cant create the instance of abstract class
/*
Eats Food...
Doggy walk slowly slowly.... but when saw the bike
Eats who konw what...
Chicken alwys slow slow till the kadhai
*/    

        //just checking about teh constrctor hierarchy,lets judt call Chicken() Constrcutor 
        //c the result
        // Chicken C1=new Chicken();
/*
This is a Animal Constructor
This is a Class2 Constructor
This is a Chicken Constructor
*/        




        //Lets chevk about the Interfaces
        // Rook R1=new Rook();
        // R1.Moves(); //ans Whatever of the moves of Rook


        //Multiple Inheritance 
        // MaHobb Ma1=new MaHobb();
        // Ma1.MaHL(); //so with multiple inheritance we can take data from two or more different into the single class
        //i.e two parent class and one child class
/*
My Hobbies are :
 1.Enjoys Watching Anime 
 2.Listening Songs
*/        


        //Learning about static keyword
        //Static Properties(Variable)
        // Student1 S1=new Student1();
        // S1.Name="Mahesh";
        // S1.Roll=1;
        // Student1 S2=new Student1();
        // S2.Name="HA";
        // S2.Roll=2;
        // // S2.CLG="DEF";
        // System.out.println(S1);
        // System.out.println(S2);//the college name should be here null but now it is the same as 1st 
        // Student1 S3=new Student1();
        // S3.Name="Ani";
        // S3.Roll=3;
        // S3.CLG="No ay";
        // System.out.println(S3);
        // System.out.println(S1);
        // System.out.println(S2);
//ans 
// Name: Mahesh Roll No: 1 College Name: ABC
// Name: HA Roll No: 2 College Name: ABC
// Name: Ani Roll No: 3 College Name: No ay
// Name: Mahesh Roll No: 1 College Name: No ay
// Name: HA Roll No: 2 College Name: No ay (got confused with printing thing)
//First of all when we first printed S1 and S2, that time we didnt set the static later on we set it, so had print to refelct teh changes 

//so static keyword make the same value of the property avaliablle to the other obj, even we change the value of that property
//changed value will be assigned to all the instances(Obj) 

        //Static Methods
        // StaM.megh();
        //ans
        // This is a static method (Static methods r called without creating the obj of a class its bcoz static methods r belong to the class not an obj)

        //Static blocks
        // System.out.println("Control Outside of Class "+StaM.a);
        //ans
// The Value has been intiailalized
// The value of a Variavle is : 10
// Control Outside of Class 10
//Static blocks r used to initialize the static fileds, they r excuted  when class is loaded into the memory
        //IMP
        //so basically the static stuff is aint belong to the obj, rather to the class like c lang(procedural lang.)




        //Learning about the super keyword
        // super is a special keyword used to refer to the immediate parent class.
        // Buka Fuka=new Buka();
/*
This is a Cat COnstructor
This is a Buka Constructor (here we didnt even call the Cat constructor but still its called bcoz it is extended)
                            //when we call child contructor its parent cnstructor is 1st executed then child, its like a hierrachy
                            //well actually that thing should have to be done by super keyword too
                            //it access parenrt class properties, functions and constructor
*/        




        //Task Based on OOPs concept
        //Creating loan or saving acc
        //1.Saving Acc
    //    SAcc S1=new SAcc(1,"Mahesh","Sybvc",12345664,"17 jun",1000);
    //    S1.SetBal(50);
    //    System.out.println(S1.GetBal());
    //    S1.FxDeposit(500);
    //    S1.Withdraw(50);
    //    System.out.println(S1.GetBal());

//ans
/*
1050
The amount 500 is Been Fixly Deposited...
NOTE: The FIXed Amount will aint be shown in Total Balance
Total Balance is :550
Withdraw Successful!!!
Total Balance is :500
500
 */

//  Constructors are Not Inherited: Constructors are special methods that are used
//   to initialize objects. While fields and methods are inherited, constructors are not. Each class must define its own constructors.

//  Implicit Call to Parent Constructor: If you don't explicitly call a parent constructor using super,
//   the Java compiler will automatically insert a call to the no-argument constructor of the parent class at the beginning of the child class constructor.

//  Explicit Call to Parent Constructor: If you want to call a specific constructor of the parent class, you must do so explicitly
//   using the super keyword with the appropriate arguments.        

    // LAcc L1=new LAcc(1,"Mahesh","Sybvc",12345664,"17 jun",10000);
    // L1.LoanApp();
    // L1.TotLoanAmount();
    // L1.ReamAmount(3);





    //Learning about the constructor
    // Child C1=new Child();
//ans
// This is a No-Para Parent Constructor
// This is a No-Para Child Constructor (so when we call non parameteric constructor of child, also parent non para is executed)

    // Child C1=new Child("Mahesh");
//ans
// This is a No-Para Parent Constructor
// This is a Para Child Constructor: Mahesh    

    // Child C2=new Child("Mahesh",1);
//ans
// This is a No-Para Parent Constructor
// This is a 2 Para Child Constructor: Mahesh No: 1  (so even we call 1 para or 2 para child constructor only,no para parent constructor is executed)

        // Child C3=new Child(1, 2, 3);
//asn  while having super(a,b,c);
// This is a 3Para Parent Constructor with values1 2 3
// This is a 3Para Child Constructor with values1 2 3        
//ans without
// This is a No-Para Parent Constructor
// This is a 3Para Child Constructor with values1 2 3

//So the Satement about construcror with super statement was right
// SAcc(int AccNo, String Name, String Addr, long Phone, String DOB, int Balance) //this field calls the child class constructor
// (SAcc), which in turn calls the parent class constructor.
// {
    // super(AccNo, Name, Addr, Phone, DOB, Balance); //calls the parent class (Account) constructor with the specified parameters.
// }
/*
 * Calls the parent class constructor.
Initializes the parent class through its constructor.
 */

//  Child(int a, int b, int c) (this statement calls the child constructor)
//     {
//         super(a,b,c); (this starement calls parent constructor with same arguments else the no para constructor would been called)
//         System.out.println("This is a 3Para Child Constructor with values"+a+" "+b+" "+c);
//     }

        //Also this is not only that from child constructor of 2 para, we can only call the 2 para parent constructor
    // Child C3=new Child("Mahesh","Mane");
//ans
// This is a Para Parent Constructor: Mane
// This is a 2 Para Child Constructor: Mahesh No: Mane    




        //Checking about teh this
        // Rectagle R1=new Rectagle(5, 2);
        // R1.Display();
        // Rectagle R2=new Rectagle(5, 5);
        // R2.Display();
        // Rectagle R3=new Rectagle();
        // R3.Display();
//ans
// Area of the Reactangle is: 10
// Area of the Reactangle is: 25
// Area of the Reactangle is: 4
        //so here this keyword is to solve  Ambiguty btw Property and parameter, also to represnt instance of obj in class




        //Checking about the super keyword
        // Cuboid C1=new Cuboid(5, 5, 5);
        //ans Ans: 30




        
        //Checking about Method Overriding
        // First C1=new First();
        // C1.Display();
        // Second C2=new Second();
        // C2.Display();
        // First C3=new Second();
        // C3.Display();
        

//Ans
// Hello there, In Class1
// Hello there, In Class2
// Hello there, In Class2
//Here we had two same method,but pericular method is specific to that perticular class, even that is parent class or a child calss
//Here Class1 had only 1 Dispaly method, but child had consist of two same methods from those we printed that class specific method and (shadowed)omitted the parent class method 





        //Learning about Dynamic method Dispatch
        // Super S1=new Sub(); 
        // S1.Meth1();
        // S1.Meth2();
        // S1.Meth3(); error
        //let's Dissucss about it,here S1 is refrence of a Super class & Sub is an obj, as Sub is a obj(also it is child which extends the Super)
        //but refrebce do not have the knowledge about the method outside the Super so that why we cant use the Meth3()




        //Learning about Abstract Classes
        // Sub1 S1=new Sub1();//(Here we created the instances of an Sub class(non abstract))
        // S1.Meth1A();
        // S1.Meth2();
        // S1.Meth3NA();
//ans
// This is a Method 1 of abstract
// This is a Method 2 of non-abstract
// This is a Method 3 of non-abstract

    // Super1 S1=new Sub1();//(Here we created the instances of an Super1 class( abstract classes ), yes its possible to do so)
    // //and the obj is Sub1 class, but it wont going have the  access to the methods which are not a Super1 and aint of abstarct type
    // S1.Meth1A();
    // S1.Meth2();
    // //S1.Meth3NA(); //c this method we cant call it as its not abstract(abstarct in a sense) or not in a Super1
    // S1.Meth4A();
//ans
// This is a Method 1 of abstract
// This is a Method 2 of non-abstract
// This is a Method 4 of abstract  

        // Task 1 for abstract class
        // Circle C1=new Circle(5);
        // C1.Area();
        // C1.Peri();
        // Reactangle R1=new Reactangle(5, 2);
        // R1.Area();
        // R1.Peri();
//Ans
// Area of the Circle is: 78.5
// Perimeter of the Circle is: 31.400002
// Area of the Reactangle is: 10.0
// Perimeter of the Reactangle is: 20.0


        //Task 1. Interface realted
        // Store S1=new Store();
        // Customer C1=new Customer("Shiv");
        // Customer C2=new Customer("Fuu");
        // S1.Register(C1);
        // S1.Register(C2);
        // S1.CallSale();

        //Task 2
        // SmartPhone S1=new SmartPhone();
        // Camera C1=S1; //so here C1 is the refrence of the Camera inteface which is also implemenetd by the main SmartPhone Class
        // MusicPalyer M1=S1;
        // C1.Click(); 
        // C1.Record();
        // M1.Play();
        // M1.Pause();
        // M1.Stop();
        // S1.Call();
        // S1.SMS();
        // S1.Play();
        // S1.Pause();
        // S1.Stop();
        // S1.Click();
        // S1.Record();

        //Checking more about the Inteface
        // System.out.println("The Value Of X: "+ITest.X);
        // ITest.Meth1();
        // // ITest.Meth4(); cant write like this 
        // ClasTest C1=new ClasTest();
        // C1.Meth1();
        // C1.Meth2();
        // C1.Meth3();
        // C1.Meth4();
//Ans
// The Value Of X: 10
// This is a method 1
// This is Method 1
// This is Method 2
// This is Method 3
// This is a method 4      



        //Stiatic Keyword
        // System.out.println("Price: "+HodaCity.Price);
        // System.out.println("It's OnRoad Price: "+HodaCity.OnRoadPrice("Mumbai"));
//Ans
// Price: 100000
// It's OnRoad Price: 110000     

        //Task
        //So the task is to generate the roll no by the class itself, we dont have to assign or create amy roll
        //like how we used to create parameterrize constructor and pass the roll no to it
        //e.g Student S1=new Student(1); like this but we have to generate the roll no by ourself, mean by class Student itself
        //if we goijng to take the student info, do we really need to assign roll one by one, thwy should be given by program itself
        // Student2 S1=new Student2();
        // System.out.println("The Student Roll No: "+S1.GenRoll("Mahesh"));
        // System.out.println("The Student Roll No: "+S1.GenRoll("Fuuu"));
//Ans
// The Student Roll No: 2020-Mahesh-1
// The Student Roll No: 2020-Fuuu-2
        //Noe for Acc
        Accc A1=new Accc();
        System.out.println("The Acc NO: "+A1.GetAcc("Shivatai"));
        Accc A2=new Accc();
        System.out.println("The Acc NO: "+A2.GetAcc("Chiwada"));
//Ans
// The Acc NO: 1763-Shivatai-1
// The Acc NO: 7981-Chiwada-2        


        //Singleton class
        // CoffeeMachine C1=CoffeeMachine.ObjMeth();
        // CoffeeMachine C2=CoffeeMachine.ObjMeth();
        // CoffeeMachine C3=CoffeeMachine.ObjMeth();
        // System.out.println("C1: "+C1);
        // System.out.println("C2: "+C2);
        // System.out.println("C3: "+C3);
        // if(C1==C2 && C2==C3)
        // {
        //     System.out.print("All of them r the same");
        // }
//Ans
// C1: CoffeeMachine@6f496d9f
// C2: CoffeeMachine@6f496d9f
// C3: CoffeeMachine@6f496d9f
// All of them r the same        
        sc.close();
    }
    
}



//Static member Task
class Student2
{
    static int Count=0;
    String GenRoll(String Name)
    {
        Count++;
        String Roll="2020-"+Name+"-"+Count;
        return Roll;

    }
}
class Accc
{
    static int Count=0;
    private final int Rand;
     Accc()
    {
        Random R1=new Random();
        this.Rand=1000+(R1.nextInt(8999));
        
    }
    String GetAcc(String Name)
    {
        Count++;
        String Roll=Rand+"-"+Name+"-"+Count;
        return Roll;
    }

}


//Singleton class(how do we achieve the singleton class)
// class CoffeeMachine
// {
//     private int CofQTY;
//     private int MilQTY;
//     private static CoffeeMachine Obj=null; //here we set Obj as the null so the, once one obj is created, it wont cteate another one 
//     //Obj==null will false
//     //so signleton class(the class with only one obj)
//     private CoffeeMachine()
//     {
//         CofQTY=2;
//         MilQTY=4;
//     }
//      static CoffeeMachine ObjMeth()
//     {
//         if(Obj==null)
//         Obj=new CoffeeMachine();
//         return Obj;
//     }
// }


        //Stiatic Keyword
class HodaCity
{
    static int Price=100000;
    int a,b;

    static int OnRoadPrice(String City)
    {
        switch(City)
        {
            case" Dehli":
            return (int)(Price+Price*0.05);
            case "Mumbai":
            return (int)(Price+Price*0.1);
        }
        return 1;
    }
    //static block
    static
    {
        if(Price>10000)
        {
            Price+=452;
        }
    }


}

//Inteface
interface ITest
{
    int X=10;
    // private int Y=10; //Identifier cant be private, as we need make it accessible for class
    public final static int Y=20; //Allowed
    public abstract void Meth2(); //Alowed
    // void Meth1()
    // {
    //     System.out.println("This is a method 1");
    // }  //this gives error 
    static void  Meth1()
    {
        System.out.println("This is a method 1 ");
    }
    default void  Meth4()
    {
        System.out.println("This is a method 4");
    }
}
interface ITest2 extends ITest //inteface can extend another interface
{
    void Meth3();
}
class ClasTest implements ITest2 //so here we just implemented with ITest2 which conatin ITest and ITest2
//so we just had to implemnt it 
{
    void Meth1()
    {
        System.out.println("This is Method 1");
    }
    public void Meth2()
    {
        System.out.println("This is Method 2");

    }
    public void Meth3()
    {
        System.out.println("This is Method 3");
    }
}


//Task 2
interface Camera
{
    void Click();
    void Record();
}

interface MusicPalyer
{
    void Play();
    void Pause();
    void Stop();
}
class Phone
{
    void Call()
    {
        System.out.println("calling...");
    }
    void SMS()
    {
        System.out.println("SMS...");
    }
}
class SmartPhone extends Phone implements Camera,MusicPalyer
{
    public void Click()
    {
        System.out.println("Photo Clicked");
    }
    public void Record()
    {
        System.out.println("Video Recording");
    }
    public void Play()
    {
        System.out.println("Playing the Video");
    }
    public void Pause()
    {
        System.out.println("Pause the Video");
    }
    public void Stop()
    {
        System.out.println("Stopped Video");
    }
}


//Interface Task
interface Member
{
    void CallBack();
}
class Store
{
    Member M1[]=new Member[100]; //As we know that Member is a interface , here we just created the array of the interface
    //in the refrence of an Member that is M1, so here inteface Member is taken as Array 
    int Count=0;
    void Register(Member M) //here we pass the reference of the Member to the Register method like S1.Register(C1);
    {
        M1[Count++]=M;
    }
    void CallSale()
    {
        for(int i=0;i<Count;i++)
        {
            M1[i].CallBack(); //Member have CallBack method just calling it using array of the reference
        }
    }
}
//So here let try to understand one thing after another
//
class Customer implements Member
{
    String Name;
    Customer(String Name)
    {
        this.Name=Name;
    }
    public void CallBack()
    {
        System.out.println("Sure we will Visit (Name)"+Name);
    }
}


//Abstract class Task
abstract class Shape
{
    abstract void Area();
    abstract void Peri();
}
class Circle extends Shape
{
    float Rad;
    Circle(float Rad )
    {
        this.Rad=Rad;
    }
    void Area()
    {
        System.out.println("Area of the Circle is: "+(3.14f*Rad*Rad));
    }
    void Peri()
    {
        System.out.println("Perimeter of the Circle is: "+(3.14f*Rad*2));
    }
    
}
class Reactangle extends Shape
{
    float Len,Brd;
    Reactangle(float Len,float Brd )
    {
        this.Len=Len;
        this.Brd=Brd;
    }
    void Area()
    {
        System.out.println("Area of the Reactangle is: "+(Brd*Len));
    }
    void Peri()
    {
        System.out.println("Perimeter of the Reactangle is: "+(2*Len*Brd));
    }
    
}


//Abstract Classes
abstract class Super1
{
    void Meth1A()
    {
        System.out.println("This is a Method 1 of abstract");
    }
    void Meth4A()
    {
        System.out.println("This is a Method 4 of abstract");
    }
    abstract void Meth2();

}
class Sub1 extends Super1
{
    @Override
    void Meth2() 
    {
        System.out.println("This is a Method 2 of non-abstract");
        
    }
    void Meth3NA()
    {
        System.out.println("This is a Method 3 of non-abstract");
    }
}


//Dynamic method Dispatch
class Super
{
    void Meth1()
    {
        System.out.println("This is a method 1");
    }
    void Meth2()
    {
        System.out.println("This is a method 2");
    }
}
class Sub extends Super
{
    void Meth3()
    {
        System.out.println("This is a method 3");
    }
    void Meth1()
    {
        System.out.println("This is a method 1 again...");
    }
}


//Method Overriding
class First
{
    void Display()
    {
        System.out.println("Hello there, In Class1");
    }
}
class Second extends First
{
    void Display()
    {
        System.out.println("Hello there, In Class2");
    }

}


//super keyword
class React
{

    int Len,Brd;
    int X=10;
    React(int Len,int Brd)
    {
        this.Len=Len;
        this.Brd=Brd;
    }
}
class Cuboid extends React
{
    int He;
    Cuboid(int Len,int Brd,int He) //so here we need to get the Len and Brd of parent class to get its values using the Cuboid 
    //constructor 
    {
        super(Len, Brd);//here we r calling parent class constructor
        //what if we dont call the parent , like i dont think we need to,yup there will be error 
        //we r extending then we shoud use isnt it ?

        //Lets c about the one more thing, what if we hae the same property in parent and child and want to access the parent property
        int X=20;
        System.out.println("This Class X Value"+this.X);
        System.out.println("Parent Class X Value"+super.X);
// This Class X Value10(wonder why it idnt 20)
// Parent Class X Value10
System.out.println("This Class X Value: "+X);
// This Class X Value: 20
        this.He=He;
        System.out.println("Ans: "+(Len*Brd+He));
    }


}


//this keyword
class Rectagle
{
    int Len,Brd;
    // Rectagle(int l,int b)
    // {
    //     Len=l;
    //     Brd=b;
    // }
    Rectagle(int Len,int Brd)
    {
        // Len=Len; //here u see it, when there is a ambiguty btn the Parameter and property we used this keyword 
        // Brd=Brd;
        this.Len=Len;
        this.Brd=Brd; //(now there is no error)
    }
    Rectagle()
    {
    this(2,2); //using this we can also pass the values to the obj inside anyother constructor
    //actually this act as a refrence here like R1, R2 see this.Len, this.Brd, this(2,2) is nthg but a R1.Len,R1.Brd,R1(2,2)
    //(here it can have any refernce not only R1) as inside the we cant use R1.len instead we use this.len (here this tells about current reference)
    }
    void Display()
    {
        System.out.println("Area of the Reactangle is: "+(Len*Brd));
    }
}


//Constructor
class Parent
{
    Parent()
    {
        System.out.println("This is a No-Para Parent Constructor");
    }
    Parent(String ABC)
    {
        System.out.println("This is a Para Parent Constructor: "+ABC);
    }
    Parent(int a, int b, int c)
    {
        System.out.println("This is a 3Para Parent Constructor with values"+a+" "+b+" "+c);
    }


}
class Child extends Parent
{
    Child(int a, int b, int c)
    {
        super(a,b,c);
        System.out.println("This is a 3Para Child Constructor with values"+a+" "+b+" "+c);
    }
    Child()
    {
        System.out.println("This is a No-Para Child Constructor");
    }
    Child(String ABC)
    {
        System.out.println("This is a Para Child Constructor: "+ABC);
    }
    Child(String ABC,int BFG)
    {
        System.out.println("This is a 2 Para Child Constructor: "+ABC+" No: "+BFG);
    }
    Child(String ABC,String BFG)
    {
        super(BFG);
        System.out.println("This is a 2 Para Child Constructor: "+ABC+" No: "+BFG);
    }
}


class Account
{
    int AccNo;
    String Name;
    String Addr;
    long Phone;
    String DOB;
    int Balance;
    Account()
    {

    }
    Account(int AccNo,String Name,String Addr,long Phone,String DOB,int Balance)
    {
        this.AccNo=AccNo;
        this.Name=Name;
        this.Addr=Addr;
        this.Phone=Phone;
        this.DOB=DOB;
        this.Balance=Balance;
    }
    int GetBal()
    {
        return Balance;
    }
    void SetBal(int Amount)
    {
        Balance+=Amount;
    }

}
class SAcc extends Account
{
    // SAcc(int AccNo,String Name,String Addr,long Phone,String DOB,int Balance)
    // {
    //     super.AccNo=AccNo;
    //     super.Name=Name;
    //     super.Addr=Addr;
    //     super.Phone=Phone;
    //     super.DOB=DOB;
    //     super.Balance=Balance; //this apporch directly assigns the parent class values to the properties without creating the constructor
    //     // super.SetBal();
    //     // super.GetBal()
        
    // }
    SAcc(int AccNo, String Name, String Addr, long Phone, String DOB, int Balance) //this field calls the child class constructor
    // (SAcc), which in turn calls the parent class constructor.
    {
        super(AccNo, Name, Addr, Phone, DOB, Balance); //calls the parent class (Account) constructor with the specified parameters.
    }
    /*
     * Calls the parent class constructor.
Initializes the parent class through its constructor.
     */
    
    
    void FxDeposit(int Amount)
    {
        Balance-=Amount;
        System.out.println("The amount "+Amount+" is Been Fixly Deposited...");
        System.out.println("NOTE: The FIXed Amount will aint be shown in Total Balance");
        System.out.println("Total Balance is :"+Balance);
    }
    void Deposit(int Amount)
    {
        Balance+=Amount;
        System.out.println("Deposit Successful!!!");
        System.out.println("Total Balance is :"+Balance);
    }
    void Withdraw(int Amount)
    {
        Balance-=Amount;
        System.out.println("Withdraw Successful!!!");
        System.out.println("Total Balance is :"+Balance);
    }

}
class LAcc extends Account
{
    int Loaan,TLoan;
    LAcc(int AccNo,String Name,String Addr,long Phone,String DOB,int Balance)
    {
        super.AccNo=AccNo;
        super.Name=Name;
        super.Addr=Addr;
        super.Phone=Phone;
        super.DOB=DOB;
        super.Balance=Balance;
    }
    void LoanApp()
    {
        Loaan=Balance*5;
        System.out.println("You can Claim the Loan Upto the "+Loaan+" Amount");
    }
    void TotLoanAmount()
    {
        TLoan=((Loaan*7)/100)+Loaan;
        System.out.println("The total Loan Amounr is a:"+TLoan);
    }
    void ReamAmount(int Months)
    {
        System.out.println("The Remaining Amount is:"+ (TLoan-Months*500));
    }

}


//Super keyword
class Cat
{
    String Cat1="No Name";
    String Cat2="Shiv";
    void CatName()
    {
        System.out.println("Teh Cat NAme is : "+Cat1);
    }
    Cat()
    {
        System.out.println("This is a Cat COnstructor");
    }

}
class Buka extends Cat
{
    
    Buka()
    {
        super.Cat1="Fu";
        super.CatName(); 
// This is a Cat COnstructor
// Teh Cat NAme is : Fu
// This is a Buka Constructor        
        //here we didnt need write the method or define property took it from parent and give our values 
        //if i dint want to new values just values from parent class simply i can take them as it
        System.out.println(" Cat 2: "+Cat2);    // Cat 2: Shiv
        System.out.println("This is a Buka Constructor");
    }
}
// class Shiv extends Cat
// {
//     Shiv()
//     {
//         System.out.println("This is a Shov Constructor");
//     }
// }

//Static Keyword
class Student1
{
    String Name;
    int Roll;
    static String CLG="ABC";
    public String toString()
    {
        return "Name: "+Name+" Roll No: "+Roll+" College Name: "+CLG;

    }

}

class StaM
{
    static void megh()
    {
        System.out.println("This is a static method");
    }
    static int a;
    static
    {
        a=10;
        System.out.println("The Value has been intiailalized\nThe value of a Variavle is : "+a);
    }
}

//Intefaces
interface ChessPlayer
{
    void Moves();
}
class Queen implements ChessPlayer
{
    public void Moves() //we need give visibility as public else it will be taken as deaflut but ChessPlayer decalred it as an public
    {
        System.out.println("Whatever of the moves of Queen");
    }
    
}
class Rook implements ChessPlayer
{
    public void Moves() 
    {
        System.out.println("Whatever of the moves of Rook");
    }
}
class King implements ChessPlayer
{
    public void Moves() 
    {
        System.out.println("Whatever of the moves of King");
    }
}


//Implementing the Multiple Inheritance throught the Interface

interface SongLover
{
    String Hobby2="Listening Songs";
}
interface AnimeLover
{
    String Hobby1="Enjoys Watching Anime";
}
interface Learner
{
    String Hobby3="Enjoys Learning new Stuff";
}
class MaHobb implements SongLover,AnimeLover,Learner
{
    void MaHL()
    {
    System.out.println("My Hobbies are :\n 1."+Hobby1+" \n 2."+Hobby2+" \n 3."+Hobby3);
    }
}
/*
 My Hobbies are :
 1.Enjoys Watching Anime 
 2.Listening Songs 
 3.Enjoys Learning new Stuff
 */


//Abstarct classes
abstract class Animal1
{
    String Eat="Food",Color;
    Animal1()
    {
        Color="Brown";
        System.out.println("This is a Animal Constructor");
    } //abstract xclass can have constrctor , seeems weird isnt it , it dont have obj but constructor
    //u might be wondering about the , how its gets called it is abstract class so sone other calss gonna define its abstract method
    //when there obj is created we also call superclass constrctor thats how it set the value brown thrght, we can chamge it later
    //if we need just like below
    abstract void Walk();
}
// class Dog1 extends Animal1
// {
//     String Activity="Bark";
//     Dog1()
//     {
//         System.out.println("This is a Dog1 Constructor");
//     }
//     void Eats()
//     {
//         System.out.println("Eats Food..."); //Concept of method overriding
//     }
//     void Walk()
//     {
//         System.out.println("Doggy walk slowly slowly.... but when saw the bike");

//     }
// }

class class2 extends Animal1
{
    class2()
    {
        System.out.println("This is a Class2 Constructor");
    }
    void Walk()
    {
        System.out.println("Chicken alwys slow slow till the kadhai");

    }
}
class Chicken extends class2
{

    Chicken()
    {
        System.out.println("This is a Chicken Constructor");
    }
    void Eats()
    {
        System.out.println("Eats who konw what..."); //Concept of method overriding
    }
    void Walk()
    {
        System.out.println("Chicken alwys slow slow till the kadhai");

    }
    void CahngeColor()
    {
        Color="White";
        System.out.println("Color: "+Color);
    }

}
// lets undeestand it tehn,here Anmal1 is a abstract class which declares the Walk() abstract method, the abstract classs can only decalre the  abstract method
//Now which of the class is going to extend that abstract class(Animal1) should define that abstact method(Walk()) decalred by the class()
//so here idea is given by abstract class i.e abstract method is decalred by Animal1


//Multilevel Inheritance

class Animal
{
    String Eat="Food";

}
class Mammls extends Animal
{
    int Legs=4;
    void Eats()
    {
        System.out.println("Eats Anything...");// overriding
    }
}
class Dog extends Mammls
{
    String Activity="Bark";
    void Eats()
    {
        System.out.println("Eats Food..."); //Concept of method overriding
    }
}










class Student
{
    String Name;
    int Roll;
    String Addr;
    int Marks[]=new int[3];

    Student()
    {
    }

    //Shallow Copy Constructor
    // Student(Student S1) 
    // {
    //     this.Name=S1.Name;
    //     this.Addr=S1.Addr;
    //     this.Roll=S1.Roll;
    //     this.Marks=S1.Marks;
    // }
    //here we copies the values(Name,Roll,etc) of obj S1 into the S2

    //Deep Copy Constructor
    Student(Student S1) 
    {
        this.Name=S1.Name;
        this.Addr=S1.Addr;
        this.Roll=S1.Roll;
        // for(int i=0;i<Marks.length;i++)
        // {
        // this.Marks[i]=S1.Marks[i];
        // }
        this.Marks=S1.Marks.clone(); //we can achieve using clone keyword too
        //the cahnges made in original do not affect the clone one 
    }
/*
Name: M<ahesh Addr: ksdd Roll: 1
87
96
100
Name: M<ahesh Addr: ksdd Roll: 1
87
96
92
*/    
    public String toString()
    {
        return "Name: "+Name+" Addr: "+Addr+" Roll: "+Roll;
    }

    // Student(String Name)
    // {
    //     System.out.println("The Name: "+Name);
    // }
    // Student(String Name,int RollNo)
    // {
    //     System.out.println("The Name: "+Name+" Roll No: "+RollNo);
    // }
    // Student(char Name,int RollNo)
    // {
    //     System.out.println("The Name: "+Name+" Roll No: "+RollNo);
    // }
    // Student(int RollNo,String Name)
    // {
    //     System.out.println("The Name: "+Name+" Roll No: "+RollNo);
    // }
}


class Subject
{
    String SubID;
    String Name;
    int MaxMarks;
    int MarksObt;

    Subject(String SubID,String Name,int MaxMarks,int MarksObt)
    {
        this.SubID=SubID; //this keyword used to refer ṭo the current instance
        this.Name=Name;
        this.MaxMarks=MaxMarks;
        this.MarksObt=MarksObt;
    }
    public String toString()
    {
        //we r using the toString method to reprersent the String 
        return "Subject ID: "+SubID+" Subject Name: "+Name+" Subject Max Marks: "+MaxMarks+" Subject Marks Obtained: "+MarksObt;
    }
}

class Customer1
{
    String CID;
    String Name;
    String Addr;
    long Pho;

    Customer1(String CID1,String Name1,String addr1,long Pho1)
    {
        CID=CID1;
        Name=Name1;
        Addr=addr1;
        Pho=Pho1;
    }
    Customer1(String CID1,String Name1)
    {
        CID=CID1;
        Name=Name1;
        // Addr=addr1;
        // Pho=Pho1;
    }
    void Display()
    {
        System.out.println("The Customer ID: "+CID);
        System.out.println("The Customer Name: "+Name);
        System.out.println("The Customer Address: "+Addr);
        System.out.println("The Customer Phone: "+Pho);

    }

}
class Product //The class other thnan the main class can't be public
                //so dont use it 
{
    private int INO;
    private String Name;
    private float Prize;
    private int QTY;

    int GetINO()
    {
        return INO;
    }
    String GetName()
    {
        return Name;
    }
    float GetPrize()
    {
        return Prize;
    }
    int GetQTY()
    {
        return QTY;
    }
    void SetQTY(int Q1)
    {
        QTY=Q1;
    }
    Product(int INo1,String Name1,float Prize1,int QTY1)
    {
        INO=INo1;
        Name=Name1;
        Prize=Prize1;
        QTY=QTY1;
    }
    void Bill() throws InterruptedException
    {
        System.out.println("*******The Bill*******");
        System.out.println("Product No: "+INO);
        System.out.println("The Product Name: "+Name);
        System.out.println("The Productt Prize :"+Prize);
        System.out.println("The Product QTY: "+QTY);
        System.out.print("Hence Total");
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        System.out.print(" "+(Prize*QTY));


    }


}