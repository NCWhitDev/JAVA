public class Rectangle 
{
    // Fields 
    private double length;
    private double width;
    // Static field to count instances
    private static int instantCount = 0; 

    public Rectangle()
    {
        length = 0;
        width = 0;
        instantCount++;
    }

    // arg-constructor
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
        instantCount++;
    }
    
    // Methods
    public double getLength() return length;

    public double getWidth() return width;

    public void setLength(double l)
    {
        length = l;
    }

    public void setWidth(double w)
    {
        width = w;
    }

    public double getArea()
    {
        System.out.println(getCount());
        return length * width;
    }

    // method to get instantCount
    public static int getCount()
    {
        return instantCount;
    }
}
