class addition
{
    int a;
    int b;
    int c;
    addition(int a, int b, int c)
    {
    a= this.a;
    b= this.b;
    c= this.c;
    }
    public void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public void add(int a)
    {
        System.out.println(a+1000);
    }
}
public class Polymorphism {
    public static void main(String args[])
    {
        addition a= new addition(10,20,30);
        a.add(10);
        a.add(20,40);
        a.add(10,20,30);

    }
}
