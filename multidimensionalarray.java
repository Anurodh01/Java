// import java.io.*;
import java.util.*;
public class multidimensionalarray {
    public static void main(String args[])
    {
        // Integer[][] intarray= new Integer[3][3];
        Scanner sc= new Scanner(System.in);
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<3;j++)
        //     {
        //         intarray[i][j]=sc.nextInt();
        //     }
        // }
        
        // int[][] array= new int[3][];
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println("enter the size of array you want for the index "+i);
        //     int size= sc.nextInt();
        //     array[i]= new int[size];
        //     for(int j=0;j<array[i].length;j++)
        //     {
        //         array[i][j]=  i+1;
        //     }    
        // }
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<array[i].length;j++)
        //     {
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        //cloning of array 

        //to clone a single dimensional array the deep copy of array pointer forms 
        int[] array= new int[5];
       
        for(int i=0;i<array.length;i++)
        {
            array[i]= i+1;
        }
        int[] newarray= array.clone();
        for(int i: newarray)
        System.out.println(i+" ");
        sc.close();
    }
}
