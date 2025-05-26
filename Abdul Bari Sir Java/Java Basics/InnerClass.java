public class InnerClass 
{

    public static void main(String[] args) 
    {
        // Outer O1=new Outer();
        // O1.ODisplay(); //Refre notebook to undestand about it more 

        //Local Inner Class
        // clad C1=new clad();
        // C1.Diaplay();
//Ans
// Hello , Felow


        //Anonymous class
        //(it is basiically the anonymous class, which represents the interface or abstract class while creating its )
        // Gladd G1=new Gladd();
        // G1.Meth1();
//Ans
//Displaying.....        
        

        //Static Inner class
        //(They r the same as Nested Inner class, difference is that, they can be accessible dirercly by using outer class name )
        //while nested can't be avaliable like that 
        GVGv.Ivcjb I1=new GVGv.Ivcjb();
        I1.Dis();
//Ans
// X: 10        
    }
}


//Static Inner Class
class GVGv
{
    static int x=10;
    int y=20;
    static class Ivcjb
    {
        void Dis()
        {
            System.out.println("X: "+x);// aslo if the class is static it will be only bale to handle static memeber
        }
    }
}

//Anonymous Inner Class
//Anonymous class is the class without teh class name
abstract class ab
{
    abstract void Display();
}
class Gladd
{
     public void Meth1()
     {
        ab A1=new ab() //ab is abstract class, so we cant create the obj of it,but we caret its reference i.e ab=A1
        //but in here we overriding teh Display method, so it will becames concreate class but compiler cates the anonymous i.e nameless class
        {
            public void Display()
            {
                System.out.println("Displaying.....");
            }
        };
        A1.Display();
     }
}


//Local Innner Class
class clad 
{
    void Diaplay()
    {
        class IClad //this is a Local Inner Class, it's Written inside the method & avaliable oanl inside that method
        {
            void Display()
            {
                System.out.println("Hello , Felow");
            }
        }
        IClad I1=new IClad();
        I1.Display();
    }
}
class Outer
{
    int X=10;
    class Inner
    {
        int Y=20;
        void IDisplay()
        {
            System.out.println("X: "+X+" Y: "+Y);
        }
    }
    void ODisplay()
    {
        Inner I1=new Inner();
        I1.IDisplay();
    }
}

