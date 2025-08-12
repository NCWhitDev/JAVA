import java.util.Scanner;

public class FullSpeedClassification
{
    public static void main(String[] args)
    {
        final double SPEED = 330;

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the fly speed: ");
        double flySpeed = kb.nextDouble();

        double calcMach = flySpeed/SPEED;

        // Demo 1: Stacked-if structure
        if (calcMach > 5.0)
            System.out.println("Hypersonic!");

        if (calcMach <= 5.0 && calcMach > 1.0)
            System.out.println("Supersonic!");

        if (calcMach == 1.0)
            System.out.println("Transsonic!");

        if (calcMach < 1.0)
            System.out.println("Subsonic!");

            
            
        // // Demo 2: if-else-if structure - Redundant
        // if (calcMach > 5.0)
        // System.out.println("Hypersonic!");
        // else if (calcMach <= 5.0 && calcMach > 1.0) // We know it must be <= 5.0
        // System.out.println("Supersonic!");
        // else if (calcMach == 1.0)
        // System.out.println("Transsonic!");
        // else if (calcMach < 1.0) // This is redundant condition check
        // System.out.println("Subsonic!");

        
        
        // // Demo 3: if-else if structure - Efficient
        // if (calcMach > 5.0)
        // System.out.println("Hypersonic!");
        // else if (calcMach > 1.0)
        // System.out.println("Supersonic!");
        // else if (calcMach == 1.0)
        // System.out.println("Transsonic!");
        // else
        // System.out.println("Subsonic!");
    }
}
