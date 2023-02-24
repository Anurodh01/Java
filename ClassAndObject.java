class Laptop
{
    int serialno;
    String name;
    int cost;
    String features;
    Laptop(int serialno, String name, int cost, String features)
    {
        this.serialno= serialno;
        this.name= name;
        this.cost= cost;
        this.features= features;
    }
    public String toString()
    {
        return name+" "+cost;
    }
}
public class ClassAndObject {
    public static void main(String args[])
    {
        Laptop lappy1= new Laptop(1,"Hp 245 notebook",45000,"500 GB Ram and windows 10 installed");
        System.out.println(lappy1);
        Laptop lappy2= new Laptop(1,"Dell 23 NotePro",85000,"1 TB Ram and windows 10 installed");   
        System.out.println(lappy2);
    }
}
