package PackageLearn;
import PackageLearn.Packages.pack1;
import PackageLearn.Packages.Pack3;
import PackageLearn.Package2.InnerPackage.Pack4;
import PackageLearn.Packages.Pack2;
public class PackageTest1 
{
    public static void main(String[] args) 
    {
         pack1 P1=new pack1();
         P1.Meth1();
         Pack3 P3=new Pack3();
         P3.Meth2();
         Pack4 P4=new Pack4();
         P4.Meth4();
         Pack2 P2=new Pack2();
         P2.Mrth(); //we just trying to put the errored file in their

/*
This is a Methd 1
Thi is a Method 2 of Pack 3
This is a Method 4 of Pack 4
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Void methods cannot return a value

        at PackageLearn.Packages.Pack2.Mrth(Pack2.java:8)
        at PackageLearn.PackageTest1.main(PackageTest1.java:17)
*/         


        
    }
    
}
