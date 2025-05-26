package MyPack1;
// import MyPack1.Demo1;

public class Demo2 extends Demo1
{
    public void Show()
    {
        System.out.println("The Ans:\na: "+a+" c: "+c+" d: "+d);
        //the error to the b as it is private cant be accesible outside of the same class, not even in teh same package
    }
    
}



