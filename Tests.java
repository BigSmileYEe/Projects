public class Tests
{
    public static void main(String[] args)
    {
        // declares the three test scores
        double test1 = 88.2;
        double test2 = 78.9;
        double test3 = 97.6;

        //calculate the average of the test scores
        double average = (test1 + test2 + test3) / 3;

        // display the test scores and average
        System.out.println("Test score 1:  " + test1);
        System.out.println("Test score 2:  " + test2);
        System.out.println("Test score 3:  " + test3);
        System.out.printf("The average of 3 test scores is:  %.2f%n", average);
    }
}
