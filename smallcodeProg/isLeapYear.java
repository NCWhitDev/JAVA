import java.util.Scanner;

public class isLeapYear
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a year to check if it is a leap year: ");
        int year = keyboard.nextInt();

        boolean isLeap = false;

        if (year%4 == 0)
        {
            // e.g., 1700 and 1800 also e.g., 1988, 1992
            if (year%100 == 0)
            {
                if (year%400 == 0) 
                {
                    isLeap = true;
                }
                else
                {
                    isLeap = false;
                }
            }
            else
            {
                isLeap = true;
            }
        }
        else
        {
            isLeap = false;
        }

        if (isLeap)
            System.out.println("The year is a leap year");
        else
            System.out.println("The year is not a leap year");

    }
}

// // This is a more efficient implementation of the 
// // conditional statement in the code we discussed in the class.
// if (year%4 == 0)
// {
// if (year%100 == 0 && year%400 == 0) 
// {
// isLeap = true;
// }
// }