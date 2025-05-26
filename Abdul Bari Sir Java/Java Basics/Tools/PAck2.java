package Tools;

public class PAck2 
{
    public void Meth()
    {
        System.out.println("This is a Meth package");
    }
}


/*

so in u r laptop by deafalut c directory in the work in a commond prompt, so probablu we need change it first fior taht
//Win + R and then type there cmd(just command propmpt will be open )

 C:\Users\INFINITY>cd /d"D:\Programs\Abdul Bari Sir Java\Java Basics\Packages"
 cd /d--> changes the dirctory to the d with that specified 

D:\Programs\Abdul Bari Sir Java\Java Basics\Packages>dir
 Volume in drive D is New Volume
 Volume Serial Number is 1A2E-9EE4

 Directory of D:\Programs\Abdul Bari Sir Java\Java Basics\Packages

25-06-2024  17:51    <DIR>          .
25-06-2024  17:42    <DIR>          ..
25-06-2024  17:45               234 pack1.java
25-06-2024  17:52               141 PAck2.java
               2 File(s)            375 bytes
               2 Dir(s)  310,535,143,424 bytes free

D:\Programs\Abdul Bari Sir Java\Java Basics\Packages>javac -d . PAck.java
error: file not found: PAck.java
Usage: javac <options> <source files>
use --help for a list of possible options

D:\Programs\Abdul Bari Sir Java\Java Basics\Packages>javac -d . PAck2.java
a we know that above line just compiles java program but we want to put this in the package at same directory
for that we wrote the above statment -d . ---> put craete package in this directory

D:\Programs\Abdul Bari Sir Java\Java Basics\Packages>dir
dir--->shows folders or files in that directory
 Volume in drive D is New Volume
 Volume Serial Number is 1A2E-9EE4

 Directory of D:\Programs\Abdul Bari Sir Java\Java Basics\Packages

25-06-2024  18:06    <DIR>          .
25-06-2024  17:42    <DIR>          ..
25-06-2024  17:45               234 pack1.java
25-06-2024  17:52               141 PAck2.java
25-06-2024  18:06    <DIR>          Packages
               2 File(s)            375 bytes

D:\Programs\Abdul Bari Sir Java\Java Basics\Packages\Packages>cd..
cd.. ---> to come out of the current directory               
 */