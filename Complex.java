class complexfun
{
    private int re;
    private int im;
    public complexfun(int re, int im)
    {
        this.re= re;
        this.im= im;
    }
    public complexfun(complexfun c)
    {
        c.re= this.re;
        c.im= this.im;
    }
    public String toString()
    {
        return this.re+"+"+this.im+"i"; 
    }
}
public class Complex {
    public static void main(String args[])
    {
        complexfun c= new complexfun(10, 20);
        System.out.println(c.hashCode());
        complexfun newc= new complexfun(c);
        System.out.println(newc.hashCode());
    }
}
