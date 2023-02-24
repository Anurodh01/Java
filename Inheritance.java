class Car
{
    String name;
    int numberofwheels;
    Car(String name, int numberofwheels)
    {
        this.name= name;
        this.numberofwheels= numberofwheels;
    }
}
class SportsCar extends Car{
    Boolean isalloywheel;
    SportsCar(String name, int numberofwheels, Boolean isalloywheel)
    {
        super(name,numberofwheels);
        this.isalloywheel= isalloywheel;
    }
    @Override public String toString()
    {
        return "Car "+this.name+" has "+this.numberofwheels+"wheels and  has alloywheel"+this.isalloywheel;
    }
}
public class Inheritance {
    public static void main(String args[])
    {
        SportsCar s1= new SportsCar("Buggati",4,true);
        System.out.println(s1.toString());
    }
}
