package MyPack1;

public class Demo3 
{
    public void Show()
    {
        Demo1 D1=new Demo1();
        System.out.println("The Ans:\na: "+D1.a+" c: "+D1.c+" d: "+D1.d);
        //the error to the b as it is private cant be accesible outside of the same class, not even in teh same package
    }
    

    
}
