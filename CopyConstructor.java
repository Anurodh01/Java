class Complex
{
    private int re;
    private int im;
    Complex(int re, int im)
    {
        this.re= re;
        this.im= im;
    }
    Complex(Complex C)
    {
        re= C.re;
        im= C.im;
    }
    @Override
    public String toString()
    {
        return this.re+"+i"+this.im;
    }
}
public class CopyConstructor {
    public static void main(String args[])
    {
        Complex c1= new Complex(10, 15);
        System.out.println(c1);
        Complex c2 =c1;   /// this is just a reference of the same object no other object created
        System.out.println(c2);
        Complex c3= new Complex(c1);  //basically this would create the new object but it will give as java doesn't give the default copy constructo just like cpp
        //we need to declare the copy constructor in java
        System.out.println(c3);
        System.out.println((c1 instanceof Complex));
        System.out.println((c2 instanceof Complex)); 
        System.out.println((c3 instanceof Complex)); 
    }
}
