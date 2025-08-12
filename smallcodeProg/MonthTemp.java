import java.util.Scanner;
import java.util.Random;

public class MonthTemp
{

    public static void main(String[] args)
    {
        // A 2D array to store the temps for four weeks, 7 days
        int[][] temps = new int[4][7];

        Random rand = new Random();

        for (int row=0;row<temps.length;row++)
        {
            for (int col=0;col<temps[row].length;col++)
            {
                temps[row][col] = rand.nextInt(40) + 31;
            }
        }

        // Printing Table of Temperatures
        System.out.println("The temperatures this month are: ");
        System.out.println(" \t D1 \t D2 \t D3 \t D4 \t D5 \t D6 \t D7");
        System.out.println("------------------------------------" 
            + "--------------------------------------");

        for (int row=0;row<temps.length;row++)
        {
            System.out.print("W"+(row+1)+"\t");
            int[] sumWeekTemp =new int[4];
            for (int col=0;col<temps[row].length;col++)
            {
                System.out.printf(" %d \t",temps[row][col]);

            }

            System.out.print("\n");
        }

        double[][] cTemps = new double[temps.length][];
        cTemps = fToC(temps);

        
        System.out.println("\n\nThe temperatures this month are: ");
        System.out.println(" \t D1 \t D2 \t D3 \t D4 \t D5 \t D6 \t D7");
        System.out.println("------------------------------------" 
            + "--------------------------------------");

        for (int row=0;row<cTemps.length;row++)
        {
            System.out.print("W"+(row+1)+"\t");
            int[] sumWeekTemp =new int[4];
            for (int col=0;col<cTemps[row].length;col++)
            {
                System.out.printf(" %4.2f \t",cTemps[row][col]);

            }

            System.out.print("\n");
        }

    }

    public static double[][] fToC(int fTemps[][])
    {
        double[][] cTemps = new double[fTemps.length][fTemps[0].length];

        for (int row=0;row<fTemps.length;row++)
        {
            for (int col=0;col<fTemps[row].length;col++)
            {
                cTemps[row][col] = (fTemps[row][col]-32) * 5.0/9;
            }
        }

        return cTemps;
    }

}
