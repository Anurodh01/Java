interface I1
{
    void m1();
}
interface I2
{
    void m2();
}
class inter implements I1, I2{
    @Override 
    public void m1()
    {
        System.out.println("this is overridden m1 function of interface I1");
    }
    @Override
    public void m2()
    {
        System.out.println("this is overridden m2 function of interface I2");
    }
}
public class Interfacelearning {
    public static void main(String args[])
    {
        inter i = new inter();
        i.m1();
        i.m2();
    }
}
