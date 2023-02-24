abstract class Person
{
    abstract void walk();
}
class Student extends Person
{
    String name;
    void walk()
    {
        System.out.println("Student is walking actually.");
    }
}
public class Abstraction {
    public static void main(String args[])
    {
        Person s1= new Student();
        s1.walk();
    } 
}
