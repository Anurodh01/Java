import java.util.*;
import java.io.*;
// import java.lang.*;
class Student
{
    int rollno;
    String name, address;
    Student(int rollno, String name, String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address= address;
    }
    public String toString()
    {
        return this.rollno+" "+this.name+" "+this.address;
    }
}
class sortbyroll implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.rollno-b.rollno;
    }
}
public class ArraysClass {
    public static int getsum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        return sum;
    }
public static String[] getsetofstring() 
    {
        String[] stringarray = new String[3];
        try
        {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
            for(int i=0;i<stringarray.length;i++)
            {
                stringarray[i]= br.readLine();
            }
        }
        catch(IOException e)
        { System.out.print(e);}
        return stringarray;
    }
    public static void main(String args[])
    {
        int[] array={12,34,79,3,90,22};
        //Arrays classes is the class in java which gives different methods for the implementation of array as sorting binary seavh and all
        //Arrays.sort(array);    //to sort the array 
        for(int i: array)
        System.out.println(i);


        //below function will apply the binary search
        int key=7;
        int index= Arrays.binarySearch(array, key);
        System.out.println(key+" is found at index "+index);


        //to fill the array with a specified value
        int[] array1= new int[10];
        Arrays.fill(array1, 12);
        for(int i: array1)
        System.out.println(i);


        //to sort the array in between the array by giving the index 
        array1[0]=10;array1[1]=1; array1[2]=6; array1[3]=90; array1[9]=11;
        Arrays.sort(array1, 3,8);
        for(int i: array1)
        System.out.println(i);

        Student[] studentarray = new Student[3];
        studentarray[0]= new Student(151,"Anurodh singh","Maharaipur");
        studentarray[1]= new Student(131, "Abhishek Saini","Jaipur");
        studentarray[2]= new Student(121,"chirag","udaipur");

        Arrays.sort(studentarray, new sortbyroll());
        for(Student student: studentarray)
        System.out.println(student);


        //passing and getting response in terms of array in java
        int sum = getsum(array1);
        System.out.println("Sum of array1 elements is: "+sum);

        String arr[]= getsetofstring();
        for(String str: arr)
        System.out.println(str);
    }
}
