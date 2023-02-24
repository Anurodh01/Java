import java.util.*;
class Student
{
    int id;
    String name;
    public Student(int id, String name)
    {
        this.id= id;
        this.name= name;
    }
    @Override
    public String toString()
    {
        return this.id+" "+this.name;
    }
}
//now we need to comparators to compare to student objects
class SortbyId implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.id- s2.id;
    }
}
class SortByName implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
class SortByNameAndId implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        int namesorting = s1.name.compareTo(s2.name);
        int idsorting = s1.id- s2.id;
        return namesorting == 0? idsorting: namesorting;
    }
}
public class ComparatorSorting {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Student[] students= new Student[5];
        for(int i=0;i<5;i++)
        {
           System.out.println("Enter the id: "); 
            int id= sc.nextInt();
            System.out.println("Enter the name: ");
            sc.nextLine();
            String name= sc.nextLine();
            students[i]= new Student(id, name);
        }
        System.out.println("Students list: ");
        for(Student student: students)
            System.out.println(student);

        //here sorting the students list on basis of the id of the students
        System.out.println("Students list after sorting: ");
        Arrays.sort(students, new SortbyId());
        for(Student student: students)
            System.out.println(student);

        //now sorting on basis of name students
        System.out.println("Students list after sorting on basis of names: ");
        Arrays.sort(students, new SortByName());
        for(Student student: students)
            System.out.println(student);

        //now sorting on basis of name students
        System.out.println("Students list after sorting on basis of id and names: ");
        Arrays.sort(students, new SortByNameAndId());
        for(Student student: students)
            System.out.println(student);
        sc.close();
    }
}
