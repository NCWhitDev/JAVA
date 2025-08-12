public class StaticDemo 
{
    public static void main(String [] args) 
    {
        System.out.println(Math.pow(2,2));

        Rectangle R1 = new Rectangle(5,10);
        
        System.out.println(Rectangle.getCount());
        
        Rectangle R2 = new Rectangle();
        R2.setLength(50);
        R2.setWidth(100);
        
        System.out.println(R1.getArea());
    }
}
