import java.util.Scanner;

public class Tests
{
    // rivate variables
    private double ave;
    private int count;
    private int score;

    // default constructor
    public Tests()
    {
        ave = 0;
        count = 0;
        score = 0;
    }

    // get the average
    public double getAve()
    {
        return ave;
    }

    // get the number of scores
    public int getCount()
    {
        return count;
    }

    // gget the test score
    public int getScore()
    {
        return score;
    }

    // set the test score
    public void setScore(int newScore)
    {
        score = newScore;
    }

    // calculate the average of the test scores
    public void getAverage()
    {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        count = 0;

        System.out.println("Enter a test score (-1 to quit):");
        score = input.nextInt();

        while (score != -1)
        {
            sum += score;
            count++;

            System.out.println("Enter a test score (-1 to quit):");
            score = input.nextInt();
        }

        ave = sum / count;
    }

    // display the average
    public String toString()
    {
        return "The average of the " + count
            + " scores entered is "
            + String.format("%.2f", ave) + ".";
    }
}
