import java.util.Scanner;

public class Calc
{
    // Private variables
    private double num1;
    private double num2;

    // Default constructor
    public Calc()
    {
        num1 = 0;
        num2 = 0;
    }

    // Get a valid number from the user
    public double readNumber(Scanner scan, String message)
    {
        System.out.println(message);

        while (!scan.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a number:");
            scan.next();
        }

        return scan.nextDouble();
    }

    // Set and get the first number
    public void setNum1(double newNum1)
    {
        num1 = newNum1;
    }

    public double getNum1()
    {
        return num1;
    }

    // Set and get the second number
    public void setNum2(double newNum2)
    {
        num2 = newNum2;
    }

    public double getNum2()
    {
        return num2;
    }

    // Calculator methods
    public double add()
    {
        return num1 + num2;
    }

    public double subtract()
    {
        return num1 - num2;
    }

    public double multiply()
    {
        return num1 * num2;
    }

    public double divide()
    {
        return num1 / num2;
    }

    // Display the stored numbers
    public String toString()
    {
        return "Displaying private data fields using toString():\n"
            + "Num1: " + num1 + "\n"
            + "Num2: " + num2;
    }
}
