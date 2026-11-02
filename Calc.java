public class Calc
{
    // private numbers for calculations
    private double num1;
    private double num2;

    // default constructor
    public Calc()
    {
        num1 = 0;
        num2 = 0;
    }

    // set and get the first number
    public void setNum1(double newNum1)
    {
        num1 = newNum1;
    }

    public double getNum1()
    {
        return num1;
    }

    // set and get the second number
    public void setNum2(double newNum2)
    {
        num2 = newNum2;
    }

    public double getNum2()
    {
        return num2;
    }

    // calculator methods
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

    // show the stored numbers
    public String toString()
    {
        return "Displaying private data fields using toString():\n"
            + "Num1: " + num1 + "\n"
            + "Num2: " + num2;
    }
}
