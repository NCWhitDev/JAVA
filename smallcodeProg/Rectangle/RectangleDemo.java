import java.util.Scanner;

public class Rectangle2Demo
{
    public static void main(String[] args)
    {
        Rectangle2 box = new Rectangle();

        System.out.println("Length: " + box.getLength());
        System.out.println("Width: " + box.getWidth());
        System.out.println("Area: " + box.getArea());

        double num = 100;

        box.setLength(num);
        box.setWidth(1000);
        box.set(90,num);

        System.out.println("Length: " + box.getLength());
        System.out.println("Width: " + box.getWidth());
        System.out.println("Area: " + box.getArea());

        /*
         * Rooms area 
         * 
         */

        Scanner kb = new Scanner(System.in);

        Rectangle2 bedroom =  new Rectangle2();
        Rectangle2 den = new Rectangle2();
        Rectangle2 kitchen = new Rectangle2();

        double area, number;

        // Get from the user bedroom dimensions
        System.out.print("What is the bedroom's length? ");
        number = kb.nextDouble();
        bedroom.setLength(number);
        System.out.print("What is the bedroom's width? ");
        number = kb.nextDouble();
        bedroom.setWidth(number);

        // set den's dimensions
        System.out.print("What is the den's length? ");
        number = kb.nextDouble();
        den.setLength(number);
        System.out.print("What is the den's width? ");
        number = kb.nextDouble();
        den.setWidth(number);

        // set den's dimensions
        System.out.print("What is the kitchen's length? ");
        number = kb.nextDouble();
        kitchen.setLength(number);
        System.out.print("What is the kitchen's width? ");
        number = kb.nextDouble();
        kitchen.setWidth(number);

        // Calculate overall area
        area = bedroom.getArea() + den.getArea() + kitchen.getArea();

        System.out.println("The total area of the rooms is: " + area);
    }
}
