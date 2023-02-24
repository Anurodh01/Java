abstract class Shape
{
    String color;
    abstract double Area();
    public Shape(){}
    public Shape(String color)
    {
        System.out.println("shape constructor called");
        this.color= color;
    }
    abstract public String toString();
    public String getColor()
    {
        return this.color;
    }
}

class Circle extends Shape
{
    private double radius; 
    // public Circle()
    // {}
    public Circle(String color, double radius)
    {
        super(color);
        this.radius= radius;
        System.out.println("Circle constructor called.");
    }
    public Circle(Circle C)
    {
        C.color= super.color;
        C.radius= this.radius;
    }
    public double Area()
    {
        return Math.PI* radius *radius;
    }
    public String toString()
    {
        return "Circle color is: "+super.getColor()+" and area of circle is: "+this.Area();
    }
}

class Rectangle extends Shape
{
    private int length;
    private int breadth;
    public Rectangle(String color, int length, int breadth)
    {
        super(color);
        this.length= length;
        this.breadth= breadth;
    }
    public double Area()
    {
        return this.length * this.breadth;
    }
    public String toString()
    {
        return "Rectangle color is: "+super.getColor()+" and area of rectangle is: "+this.Area();
    }
}
public class Test {
    public static void main(String argsp[])
    {
        Circle c1= new Circle("Red", 10);
        System.out.println(c1.hashCode());
        Rectangle r1= new Rectangle("Pink", 20, 10);
        System.out.println(r1);
        Circle c2=c1;
        System.out.println(c2.hashCode());

        //now we will see tehe copy constructor 
        Circle c3= new Circle(c1);    //but the java doesn't provide bydefault copy constructor
        System.out.println(c3.hashCode());
    }
}
