public class Rectangle2
{
    // Attributes (fields or data)
    private double length;
    private double width;

    // Methods
    public Rectangle()
    {
        length = 0;
        width = 0;
    }

    public Rectangle(double newLength, double newWidth)
    {
        length = newLength;
        width = newWidth;
    }

    public void set(double newLength, double newWidth)
    {
        length = newLength;
        width = newWidth;
    }

    public void setLength(double newLength)
    {
        length = newLength;
    }

    /*
     * setLength method that can cause shadowing
     */

    /*
    public void setLength(double length)
    {	
    this.length = length;
    System.out.println("Parameter Variable length: " + length);
    }
     */
    

    public void setWidth(double newWidth)
    {
        width = newWidth;
    }

    /*
     * setWidth method that can cause shadowing
     */

    /*
    public void setWidth(double w)
    {	
    double width = 999;
    width = w;

    // // Demo to prove that the local variable width
    // // of this method is set to 10 not the instance field.
    System.out.println("Local Variable Width: " + width);
    }
     */

    public double getWidth()
    {	
        //returning the instance field width.
        // How do we know that? Because getWidth can't access
        // the width variable in another method such as setWidth.
        return width; 
    }

    public double getLength()
    {	
        //returning the instance field width.
        // How do we know that? Because getWidth can't access
        // the width variable in another method such as setWidth.
        return length; 
    }

    public double getArea()
    {
        return length * width;
    }

}
