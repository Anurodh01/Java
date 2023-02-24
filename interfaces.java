interface I1
{
    final int a=10;          ///interface variable are public, static, final by default
    void display();                     ///interface have the abstract method by default
}
public class interfaces implements I1 {
    public void display()
    {
        System.out.println("This is display method overridden by interfaces classes");
    }
    public static void main(String args[])
    {
        interfaces i = new interfaces();
        i.display();
        System.out.println(a);
    }
}
