class student{
    int roll;
    String name;
    String course;
    student()
    {
        System.out.println("this is the student constructor");
    }
    student(int roll, String name, String course)
    {
        this.roll= roll;
        this.name= name;
        this.course= course;
    }
    student(int roll)
    {
        this.roll= roll;
        System.out.println("this is constructor with only roll");
    }
    student(String name, String course)
    {
        this.name= name;
        this.course= course;
        System.out.println("this is constructor with only name");
    }
    public String toString()
    {
        return this.roll + this.name+ this.course;
    }
}
class Coursemark extends student{
    int mark;
    Coursemark(int id, String name,String course, int mark)
    {
        super(id,name,course);
        this.mark= mark;
    }
    public String toString()
    {
        return super.toString()+ "has gotten "+mark+" marks";
    }
}
public class Constructor {
    public static void main(String args[])
    {
    // student s= new student();
    // System.out.println(s);
    // student s1= new student(1);
    // System.out.println(s1);
    // student s2= new student("Apradhi","apradh");
    // System.out.println(s2);
    // student s3= new student(1,"anurodh","Computer Science");
    // System.out.println(s3);
    Coursemark mark= new Coursemark(1,"anurodh", "computer science", 9);
    System.out.println(mark.toString());
    }
}
