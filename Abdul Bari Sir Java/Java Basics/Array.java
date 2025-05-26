import java.util.Scanner;

public class Array 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // int A[]={1,2,3,4,5};
        // System.out.println("Length of an array is a:"+A.length);
        // //here lenght is a property not method

        // //just hoe we camn print the array
        // System.out.println(A); //we cant direclty print the array, we have to use loops 
        // System.out.println("Element sin the Array");
        // for(int i=0;i<A.length;i++)
        // {
        //     System.out.print(A[i]+" ");
        // }

        // //how will we print it in reverse order
        // System.out.println("\nLen: "+A.length);
        // // for(int i=A.length;i>=1;i--)
        // // {
        // //     System.out.print(A[i]+" ");
        // // } ///ehy there is Array out of bound exception,its bcoz our loop is going from 5-1 
        // //but array only have 0-4 index in it(we should always consider checking idex from 0 as its start from their)
        // System.out.println("\nPrinting Elements in the Reverse : ");
        // for(int i=(A.length-1);i>=0;i-- )
        // {
        //     System.out.print(A[i]+" ");
        // }


        // //checking for the values in A[]
        // System.out.println("\nvalues in A[] using its index");
        // for(int i=0;i<A.length;i++)
        // {
        //     System.out.print(A[i]+" ");
        // }

        // //checking for the values in A[] using foreach loop
        // System.out.println("\nvalues in A[] using foreach loop: ");
        // for(int X : A)
        // {
        //     System.out.print(X+" ");

        // }
        

        // //Lets try to change the values of the A[]
        // A[2]=110;
        // System.out.println("\n Changing the value of perticular Index");
        // for(int D:A)
        // {
        // System.out.print(++D+" ");
        // }
        // System.out.println();
        // //Here we tring to check that the change in value of D can also change the value of A
        // for(int D:A)
        // {
        // System.out.print(D+" "); //ans 1 2 110 4 5 (means for each loop dont change the original value )
        // //i order to change thr value of an array, we hacve to made changes in the original array
        // }
        // //Using foreach loop in java
        // //to print thhe array element witout use of its index

        // //int X=0;
        // int[] B=new int[10];
        // System.out.println("\nEnter the elements in the Array:");
        // for(int i=0;i<5;i++)
        // {
        //     B[i]=sc.nextInt();
            
        // }
        // for(int X : B)
        // {
        //     System.out.print(X+" ");

        // }//1.2,3,4,5
        //here we dont need index just the values




        //Some Tasks 
        

        //1. Finding the sum of all elements 
        // int Sum=0;
        // for(int TotalN: Array)
        // {
        //     Sum+=TotalN;
        // }
        // System.out.println("Sum of thr Array:"+Sum);


        //Seraching one of the element in the array
        // System.out.println("Enter the Element to search: ");
        //int No=sc.nextInt();
        // for(int TotalN: Array)
        // {
        //     if(TotalN==No)
        //     {
        //     System.out.print("The Entered No: "+No+" is in the array");
        //     break;
        //     }
        //     else
        //     System.out.print("The Number "+No+" is NOT in the array");

        // } //we cant we use for each loop bcoz of 
        /*
The Number 8 is NOT in the arrayThe Number 8 is NOT in the arrayThe Number 8 is NOT in the arrayThe
 Number 8 is NOT in the arrayThe Number 8 is NOT in the arrayThe Number 8 is NOT in the arrayThe Entered N
 o: 8 is in the array         
         */

         //By using iterative loop
        //  for(int i=0;i<Array.length;i++)
        //  {
        //     if(Array[i]==No)
        //     {
        //     System.out.print("The Entered No: "+No+" is in the array at index "+i);
        //     //break; //it was  some what wise to think about the putting break but break get out of the loop
        //     //it will still execute the NOT part which we dont want if we found no in array
        //     System.exit(0);
        //     }
        //  }
        //  System.out.print("The Number "+No+" is NOT in the array");
        //  //ans 8
        //The Entered No: 8 is in the array at index 6
        //5
        //The Number 5 is NOT in the array




        //another task finding max element
        // int Max=0;
        // for(int i=0;i<Array.length;i++)
        // {
        //     if(Array[i]>Max)
        //     {
        //         Max=Array[i];
        //     }
        // }
        // System.out.println("Max No is :"+Max);



        //another task finding 2nd largest no
        //Now thats intresting 
        //lets take an example  int Array[]={6,3,9,7,2,1,8,4};
        // Max1=6, Max2=6 ; Max1=6, Max2=3  ; Max=9,Max2=7 ; MAx1=9, Max2=8;
        //so here to tell about ans is:
        //at 1st lets intilize both Max with 1st Value i.e is 6
        //general idea is MAx1 will have most greatest till checked and Max2 will have 2nd greatest
        // it will only check with value to be less than Max1
        
        // int Max1=0,Max2=0;
        // for(int i=0;i<Array.length;i++)
        // {
        //     if(i==0)
        //     {
        //         Max1=Array[0]; // here we put the if condition bcoz we dontwant modify the value each time
        //         Max2=Array[0];
        //     }
        //     if(Array[i]>Max1) //its same finding greatest no
        //     {
        //         Max2=Max1;
        //         Max1=Array[i];
        //     }
        //     if((Array[i]>Max2) && (Array[i]<Max1))
        //     {
        //         Max2=Array[i];
        //     }//now here to find 2nd greatest no we have to check it with the 
        // //     //Max2 and MAx1


        // //     //also we can use else logic seems simple
        // //     // else if(Array[i]>Max2)
        // //     // {
        // //     //     Max2=Array[i];
        // //     // }
        // }
        // System.out.println("The Second Largest Value is a :"+Max2); 
        // System.out.println(Max1);


        //Lets brwak down the code to understand it 
        //e.g int Array[]={6,3,9,15,2,7,7,2,1,17,8,4};
        /*
        if(i==0)
            {
                Max1=Array[0]; 
                Max2=Array[0];
            }         
         */
        //Ans---> Max1=6,Max2=6
        /*
         if(Array[i]>Max1) 
            {
                Max1=Array[i];
            }
        if((Array[i]>Max2) && (Array[i]<Max1))
            {
                Max2=Array[i];
            }
         */
        //Further, Max1= 3>6, 9>6=9, 15>9=15, 2>15,7>
        // Max2= 3>6 && 3<6, 9>6 && 9<9 ,15>6 && 15<15,2>6 && 2<15,
        //yeah its the way it willgoes on but if we dont swap the Max1 value with Max2 value we going to 
        //loss 2nd greatest like at some pint Max1=17,Max2=8 but second largest here is 15

        


        //Lets try another logic some other things 

        // int Max1=Array[0];
        // int Max2=Array[0];

        // for(int i=0;i<Array.length;i++)
        // {
        //     if(Array[i]>Max1)
        //     {
        //         Max2=Max1;
        //         Max1=Array[i];
        //     }
        //     else if(Array[i]>Max2)
        //     {
        //         Max2=Array[i];
        //     }
        // }
        //  System.out.println("The Second Largest Value is a :"+Max2); 
        //  System.out.println(Max1);




        //Rotating An Array
        //Left Shift(Just simply shifting each of the array element to the lefrt side by one idex)
        // int Array[]={6,3,9,15,2,7,7,2,1,17,8,4};
        // int Temp=Array[0];
        // System.out.println("Len:"+Array.length);
        // for(int i=0;i<Array.length-1;i++)
        // {
        //     // if(i==(Array.length-1)) //specify the element at 11th position
        //     // {
        //     //     Array[i]=Temp;
        //     // }
        //     // else
        //     Array[i]=Array[i+1]; //if we didnt put it in else it will check for 11th(last pos)
        //     //where it dont going to have any value to take, as we r taking temp there
           
        //     // System.out.print(Array[i]+" ");
        // }
        // Array[Array.length-1]=Temp;
        // System.out.println("\nAns:");
        // for(int X:Array)
        // {
        // System.out.print(X+" ");
        // }


        //Right Shift
    //     int Array[]={6,3,9,15,2,7,7,2,1,17,8,4};
    //     int Len=Array.length-1;
    //     int Temp=Array[Len];
    //     //int Temp1=Array[0];
    //    // Array[1]=Array[0];
       
    //     //System.out.println("Len:"+Array.length);
    //     for(int i=Array.length-1;i>=1;i--)
    //     {
    //         // if(i==0) //specify the element at 11th position
    //         // {
    //         //     Array[i]=Temp;
    //         // } 
    //         // else if(i==1)
    //         // {
    //         //     Array[i]=Temp1;
    //         // }
    //         //else if(i>0)
    //         // else
    //         // {
    //         Array[i]=Array[i-1]; //if we didnt put it in else it will check for 11th(last pos)
    //         //where it dont going to have any value to take, as we r taking temp there
    //         // }
    //         System.out.print(Array[i]+" ");
    //     }
    //     Array[0]=Temp;
    //     System.out.println("\nAns:");
    //     for(int X:Array)
    //     {
    //     System.out.print(X+" ");
    //     }

        //will c about it later



        //Inserting in an Array 
        // int Array[]={1,2,3,4,5,6};
        // Array[2]=33;
        // for(int X:Array)
        // {
        //     System.out.print(X+" "); //ans 1 2 33 4 5 6  it is overrding
        // }
        //Insertng into the Array
        // Array[10]=7;
        // for(int X:Array)
        // {
        //     System.out.print(X+" ");
        // }//yup ans is an error as an size of array cant be cahnge in run time 
        //so for that we need to specify the size which can store more elements for future 
        // int Array1[]=new int[6];
        // Array1[0]=0;
        // Array1[1]=1;
        // Array1[2]=3;
        // Array1[3]=3;
        // Array1[4]=4;
        // for(int X:Array1)
        // {
        //     System.out.print(X+" ");
        // }
        // for(int i=Array1.length-1;i>=2;i--)
        // {
        //     if(i==2)
        //     {
        //         Array1[2]=2;
        //     }
        //     else
        //     {
        //     Array1[i]=Array1[i-1];
        //     }
        // }
        // System.out.println();
        // for(int X:Array1)
        // {
        //     System.out.print(X+" ");
        // }
        //Ans 0 1 3 3 4 0 (Array before Insertion)
        //0 1 2 3 3 4 (Array after Insertion at 2nd Index)


        //Dont mind about the ans one error we gotta reslove is 
        //Index of out of bound exception
        // for(int X:Array1)
        // {
        //     System.out.print(X+" ");
        // }
        // System.out.println("\nLength of an Array: "+Array1.length);
        // for(int i=0;i<Array1.length-1;i++)
        // {
        //     System.out.println(Array1[i]+" ");
        // }
        // for(int i=Array1.length;i>0;i--)
        // {
        //     System.out.println("\n Ans:"+Array1[i]+" ");
        // } //so its gives index out of bound exception

        //lets 6 in plac eof Array.length which is also 6
        // for(int i=6;i>0;i--)
        // {
        //     System.out.println("\nAns: "+i+" ");
        // }
        // this will work now i g

        // for(int i=Array1.length;i>0;i--)
        // {
        //     System.out.println("\n Ans:"+Array1[i]+" ");
        // }//it will not work as our Array is of 0-5 size but Array.length is of an size 6
        //and here its starting from the 6 which isnt th eindex of athe array
        // for(int i=Array1.length-1;i>0;i--)
        // {
        //     System.out.println("\n Ans:"+Array1[i]+" ");
        // } //yup tguis works


        //Deleting element from the array
    //    int Array[]={6,3,9,15,2,7,7,2,1,17,8,4};
    //    System.out.println("which element u like to delete:"); 
    //    int No=sc.nextInt();
    //    int Len=Array.length;
    //    int Index=0;
    //    for(int i=0;i<Len-1;i++)
    //    {
    //     if(No==Array[i])
    //     {
    //         Index=i;
    //     }
    //    }
    //    System.out.println("Index is a:"+Index);
    //    for(int i=Index;i<Len-1;i++)
    //    {
    //     Array[i]=Array[i+1];
    //     System.out.print(Array[i]+" ");
    //    }
    //    System.out.println();
    //    for(int C:Array)
    //    {
    //     System.out.print(C+" ");
    //    }
/*which element u like to delete:
9
Index is a:2
15 2 7 7 2 1 17 8 4
6 3 15 2 7 7 2 1 17 8 4 4 
*/

           

        //Copying an Array

        // int Array[]={1,2,3,4,5,6};
        // int Array1[]=new int[10];
        // for(int i=0;i<=Array.length-1;i++)
        // {
        //     Array1[i]=Array[i];
        // }
        // for(int X:Array1)
        // {
        //     System.out.print(X+" ");
        // }

        // //lets print the reverse of its array
        // System.out.println("\n Reverse Array: ");
        // for(int i=0;i<=Array.length-1;i++)
        // {
        //     Array1[i]=Array[(Array.length-1)-i];
        // }
        // for(int X:Array1)
        // {
        //     System.out.print(X+" ");
        // }


        //Increasing Size of an Array
        // int Array[]={1,2,3,4,5,6};
        // int Array1[]=new int[2*Array.length];
        // for(int i=0;i<=Array.length-1;i++)
        // {
        //     Array1[i]=Array[i];
        // }
        // for(int X:Array1)
        // {
        //     System.out.print(X+" ");
        // }
        // for(int i=0;i<=Array1.length-1;i++)
        // {
        //     Array[i]=Array1[i];
        // }
        // System.out.println("Original Array: ");
        // for(int X:Array)
        // {
        //     System.out.print(X+" ");
        // }

        //we will c this later





        //2D Array
        //int Array[][]=new int[4][4];
        int Array1[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        for(int i=0;i<Array1.length;i++)
        {
            for(int j=0;j<Array1.length;j++)
            {
                System.out.print(Array1[i][j]+" ");
            }
            System.out.println();
        }

        //Using for each loop
        for(int X[]:Array1) //here X[] gives all the references for specific array
        {
            for(int Y:X) //Y points the actual Array 
            {
                System.out.print(Y+" ");
            }
            System.out.println();
        }

        // //Addition of Array, to add them sure be  of same size as 4*4 and 4*4
        // int Array[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}; 
        // int Sum[][]=new int[4][4];
        // for(int i=0;i<Array1.length;i++)
        // {
        //     for(int j=0;j<Array1.length;j++)
        //     {
        //         Sum[i][j]=Array1[i][j]+Array[i][j];
        //         System.out.print(Sum[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // //Using For each
        // for(int X[]: (Sum))
        // {
        //     for(int Y:X)
        //     {
        //         System.out.print(Y+" ");
        //     }
        //     System.out.println();
        // }



        //Multiplication of Array, to add them sure be  of same size as 4*4 and 4*4
        int Array[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}; 
        int Sum[][]=new int[4][4];
        System.out.println("\nMultiplication");
        for(int i=0;i<Array1.length;i++)
        {
            for(int j=0;j<Array1.length;j++)
            {
                Sum[i][j]=0;
                for(int k=0;k<Array1.length;k++)
                {
                Sum[i][j]+=Array1[i][k]*Array[k][j];
                }
                System.out.print(Sum[i][j]+" ");
            }
            System.out.println();
        }
        //Using For each
        System.out.println("Printing USing for each loop: ");
        for(int X[]: (Sum))
        {
            for(int Y:X)
            {
                System.out.print(Y+" ");
            }
            System.out.println();
        }




    


       sc.close();        
    }
    
}
