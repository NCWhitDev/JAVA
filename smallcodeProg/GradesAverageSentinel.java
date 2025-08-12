import java.util.Scanner;

public class GradesAverageSentinel
{

    public static void main(String[] args)
    {
        // Declare a Scanner object
        Scanner kb = new Scanner(System.in);

        double totalGrade = 0.0;

        System.out.print("Enter the grade of a student (-1 to exit): ");
        double studentGrade = kb.nextDouble();

        // while loop
        int i = 0;

        while(studentGrade != -1)
        {
            totalGrade += studentGrade;

            System.out.print("Enter the grade of a student (-1 to exit): ");
            studentGrade = kb.nextDouble();

            i++;
        }

        double classAverage = 0;

        if (i != 0)
        {
            classAverage = totalGrade / i;
        } else
        {
            classAverage = 0;
        }

        System.out.println("The average of the class is: " 
            + classAverage);

    }
}
