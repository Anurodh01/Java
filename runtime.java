class animal
{
    public void print_speak()
    {
        System.out.println("GEEKs");
    }   
}
class dog extends animal 
{
    public void print_for()
    {
        System.out.println("The dog barks");
    }
}
class lion extends dog{
    public void print_speak()
    {
        System.out.println("geeks");
    }
}
public class runtime {
    public static void main(String args[])
    {
        lion l= new lion();
        l.print_speak();
        l.print_for();
        l.print_speak();
    }
}
