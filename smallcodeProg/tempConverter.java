import java.util.Scanner;

public class tempConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum degree: ");
        int maxTemp = sc.nextInt();

        System.out.println();

        double[] cTemp = new double[maxTemp];

        // Populating cTemp array with the temperatures.
        for (int i = 0; i < cTemp.length; i++)
        {
            cTemp[i] = i;
        }

        // Passing and returning an array from a method
        double[] fTemp = cToF(cTemp);

        System.out.println("Celsius \t Fahrenheit");

        for (int i = 0; i < cTemp.length; i++)
        {
            System.out.printf("%7s \t %10s\n", cTemp[i], fTemp[i]);
        }
    }

    public static double[] cToF(double[] c)
    {
        double[] tempArray = new double[c.length];
        for (int i = 0; i<c.length; i++)
            tempArray[i] = (9/5)*c[i] + 32;
      
        return tempArray;
    }

}
