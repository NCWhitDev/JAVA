import java.util.Scanner;

public class RectangleArea
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        // Demo 1: Single Rectangle
        System.out.print("Enter the length: ");
        double len = kb.nextDouble();
        System.out.print("");

        System.out.print("Enter the width: ");
        double width = kb.nextDouble();
        System.out.print("");

        double area = len * width;

        System.out.println("The area is: " + area);

        
        
        
        // Demo 2: Two Rectangles (copy-paste) -> Very inefficient
        System.out.print("Enter the length: ");
        double len1 = kb.nextDouble();
        System.out.println();

        System.out.print("Enter the width: ");
        double width1 = kb.nextDouble();
        System.out.println();

        double area1 = len1 * width1;
        System.out.println("The area is: " + area1);

        System.out.print("Enter the length: ");
        double len2 = kb.nextDouble();
        System.out.println();

        System.out.print("Enter the width: ");
        double width2 = kb.nextDouble();
        System.out.println();

        double area2 = len2 * width2;
        System.out.println("The area is: " + area2);

        
        
        
        
        // Demo 3: 100 Rectangles (while loop)
        int i = 0; // Integer variable that will be used as a counte.
        while (i<100) // The while condition. Keeps looping as long as it is true
        {

            System.out.print("Enter the length: ");
            double len = kb.nextDouble();
            System.out.print("");

            System.out.print("Enter the width: ");
            double width = kb.nextDouble();
            System.out.print("");

            double area = len * width;

            System.out.println("The area is: " + area);

            i++; 
        }
    }
}