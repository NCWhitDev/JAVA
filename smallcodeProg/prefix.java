/**
 * This program demonstrates the ++ and -- operators
 * in prefix mode.
 */
public class Prefix
{
    public static void main(String[] args)
    {
        int number = 4;

        // Display the value in number.
        System.out.println("number is " + number);
        System.out.println("I will increment number.");
        ++number;

        // Display the value in number.
        System.out.println("Now, number is " + number);
        System.out.println("I will decrement number.");
        --number;

        // Display the value in number.
        System.out.println("Now, number is " + number);
        System.out.println("\n");
  
        // Demo 2
        int newNumber;

        newNumber = ++number;
        System.out.println("The new number is " + newNumber);
        System.out.println("\n");
      
        newNumber = number++;
      
        System.out.println("Now, number is " + number);
        System.out.println("The new number is " + newNumber);
    }
} 
