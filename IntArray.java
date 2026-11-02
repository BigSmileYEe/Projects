import java.util.Arrays;

public class IntArray
{
    // Array data
    private int length;
    private int myArray[];

    // Create an array with the given number of elements
    public IntArray(int newLength)
    {
        length = newLength;
        myArray = new int[length];
    }

    // Return the number of elements
    public int size()
    {
        return length;
    }

    // Fill the array with random numbers from 1 to 6
    public void fillRand()
    {
        for (int i = 0; i < length; i++)
        {
            myArray[i] = (int)(Math.random() * 6) + 1;
        }
    }

    // Change an element
    public void set(int index, int value)
    {
        myArray[index] = value;
    }

    // Return an element
    public int get(int index)
    {
        return myArray[index];
    }

    // Remove all elements
    public void clear()
    {
        myArray = new int[0];
        length = 0;
    }

    // Check whether the array is empty
    public boolean isEmpty()
    {
        return length == 0;
    }

    // Sort the array from smallest to largest
    public void sort()
    {
        Arrays.sort(myArray);
    }

    // Display the array elements
    public String toString()
    {
        return Arrays.toString(myArray);
    }
}
