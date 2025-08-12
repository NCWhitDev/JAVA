import java.io.*;
import java.util.Scanner;

public class fileToArray
{
    public static void main(String[] args) throws IOException
    {
        final int SIZE = 5; // Assuming we know the size.
        int i = 0, numbers[] = new int[SIZE]; 

        File file = new File("Values.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext() && i < numbers.length)
        {
            numbers[i] = inputFile.nextInt();
            i++;
        }

        inputFile.close();

        ArrayDisplay(numbers);
    }

    public static void ArrayDisplay(int[] array)
    {
        for (int val:array)
            System.out.print(val + " ");
        System.out.println(); 
    }

}
