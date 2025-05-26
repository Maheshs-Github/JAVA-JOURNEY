//just seeing about the JavaDoc 
/**
 * @author Mahesh Mane
 * @version 9.0
 * @since 2023
 * 
 */
public class JDoc 
{
    String Name;
    /**
     * This is a Parametrized Constructor
     * @param Name
     */
    JDoc(String Name)
    {

    }
    /**
     * No Idea
     * @return  return type of the Doc
     * @throws Exception To See if its throwing any exception
     */
    String getName() throws Exception
    {
        return Name;
    }
    /**
     * 
     * @param Roll Updating thre Roll No
     */
    void setName(int Roll)
    {
        Name=Name+1;
    }


    


//Java Doc is just the way to write to comments but here, we also can genearate Documenation in web form for our generated classes
/*
  Javadoc Comments: These are special comments in your code that start with /** and end with 
  Documentation Generation: Javadoc converts these comments into an HTML documentation website.
  Usage: It helps developers understand the code by providing detailed descriptions of classes, methods, and parameters.
 */






 //Annotations 

 //Lets understand about the built in annotations with example 
 // 1. @Override
 //(Lets take one example where one class will inherite one method and override it)

//  public abstract class Class1
//  {
//     abstract void Display();

//  }
//  public class class2 extends Class1
//  {
//     void Dispaly()
//     {

//     }
    //so here we have declared the abstract class with one abstract method so we have to define that method in
    //inherited class 
    //even thought we did inherited that method, still showing error

//  }

    //Now just imagine if the class wasnt even the abstract class, we wanted to overrite that method 
    //but small mistakes makes it totally diff class now 
public  class Class1
{
    void Display()
    {

    }

}
public class class2 extends Class1
{
//    void Dispaly() (mistaked one)
     @Override   //if we got any spell it will show an error 
    void Display()

   {

   }

}   




// @SuppressWarnings("deprecation")
 public static void main(String[] args) 
 {
    class3 C3=new class3();
    // C3.  yup it won't show(deprecared pne)

    // 3. @SuppressWarnings
    C3.DDisplay();  //Note: JDoc.java uses or overrides a deprecated API. (shows this warning when compiling )
    //to negalte it 


    //well something like that check those later, no needed rn lets go to swing and further
    
    
 }





} 
//2. Deprecated 
//if u want any method of class not want to be used any more or just telling other not to use it make it Deprecated 
class class3
{
    void Display()
    {
        System.out.println("We can use this one");
    }
    @Deprecated
    void DDisplay()
    {
        System.out.println("dont use this");
    }
}