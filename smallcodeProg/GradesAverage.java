import java.util.Scanner;

public class GradesAverage
{
    public static void main(String[] args)
    {
        // Declare a Scanner object
        Scanner kb = new Scanner(System.in);

        // Prompt the user for the number of students
        System.out.print("How many students in class? ");
        int students = kb.nextInt();

        double totalGrade = 0.0;

        int i = 0;

        while(i < students)
        {
            System.out.print("Enter the grade of a student: ");
            double studentGrade = kb.nextDouble();

            totalGrade += studentGrade;
            // totalGrade = totalGrade + studentGrade;

            i++;
        }

        double classAverage = totalGrade / students;
        System.out.println("The average of the class is: " 
            + classAverage);

    }
}
