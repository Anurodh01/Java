//the java static method and variable executes as they are written inside the class defintion
// class Test
// {
//     static 
//     {
//         System.out.println("Hello this is another static block");
//     }
//     static int a= m1();
//     static int m1()
//     {
//         System.out.println("This is m1 method called");
//         return 20;
//     }
//     static{
//         System.out.println("this is static block");
//     }
//     Test()
//     {
//         System.out.println("This is TEst constructor");
//     }
    
    
// }


class Student
{
    String name;
    int rollno;


     static int counter=0;
     static String college;
    
    static int setrollno()
    {
        counter++;
        return counter;
    }
    static void setCollege(String clgname)
    {
        college= clgname;
    }
    Student(String name)
    {
        this.name= name;
        this.rollno= setrollno();
    }
    public void studentinfo()
    {
        System.out.println(this.rollno+" "+this.name+" "+college);
    }
}
public class staticblock {
    public static void main(String args[])
    {
        Student.setCollege("IIITV");
        Student s1= new Student("Anurodh Singh");
        s1.studentinfo();
        Student s2= new Student("Chirag Khatik");
        s2.studentinfo();
    }
}
