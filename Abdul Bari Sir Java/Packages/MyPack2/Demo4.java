package MyPack2;

import MyPack1.Demo1;

public class Demo4 extends Demo1
{

    public void Show()
    {
        // Demo1 D1=new Demo1();
        System.out.println("The Ans:\na: "+a+" d: "+d);
        //the error to the b as it is private cant be accesible outside of the same class, not even in teh same package
        //also c is default which aint avaliable outside of the package
    }
    

    
}
