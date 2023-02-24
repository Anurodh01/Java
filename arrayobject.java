import java.util.*;
class student
{
    static int id =0;
    String name;
    String course;
    student(String name,  String course)
    {
        id = id+1;
        this.name= name;
        this.course= course;
    }
    @Override
    public String toString()
    {
        return (name+" "+course);
    }
}
public class arrayobject {
    public static void main(String args[])
    {
    Scanner sc= new Scanner(System.in);
    student[] students= new student[5];
    for(int i=0;i<5;i++)
    {
        System.out.println("Enter the name of student "+(i+1));
        String name= sc.nextLine();
        System.out.println("Enter the course opted by student "+(i+1));
        String course= sc.nextLine();
        students[i]= new student(name,course);
    }
    int i=0;
    for(student st : students)
    {
        System.out.println(st);
        // System.out.println((i+1)+". "+st.name+" "+st.course);
        // i++;
    }
}
}
