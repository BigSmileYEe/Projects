
public class Exam extends Assessment
{
    // Points awarded for each question
    private double pointsEach;

    // Calculate the exam score
    public Exam(int questions, int missed)
    {
        pointsEach = 100.0 / questions;
        double score = 100.0 - (missed * pointsEach);
        setScore((int) score);
    }

    // Return points per question
    public double getPointsEach()
    {
        return pointsEach;
    }
}
