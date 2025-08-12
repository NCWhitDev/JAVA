import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        // Withdraw some cash from the account.
        
        double balance = 100.5;
        
        System.out.print("How much would you like to withdraw? ");
        double cashNeeded = keyboard.nextDouble();
        balance -= cashNeeded;

        if (balance<50)
        {
            System.out.println("Warning! Low balance in your account!");
            System.out.println("To avoid overdraft, deposit more money.");
            System.out.println("Now your balance is $" + balance);
        }
        else
            System.out.println("Now your balance is $" + balance);
    }

}
