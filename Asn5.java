
import java.util.ArrayList;

public class Asn5
{
    public static void main(String[] args)
    {
        // Create two ArrayLists
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add four items to each list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the original lists
        System.out.println("Original fruit list:");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }

        System.out.println();

        System.out.println("Original number list:");
        for (int number : numbers)
        {
            System.out.println(number);
        }

        // Remove an item from each list
        fruits.remove(1);
        numbers.remove(1);

        // Change an item in each list
        fruits.set(0, "Strawberry");
        numbers.set(0, 50);

        // Display the updated lists
        System.out.println();
        System.out.println("Updated fruit list:");
        for (String fruit : fruits)
        {
            System.out.println(fruit);
        }

        System.out.println();

        System.out.println("Updated number list:");
        for (int number : numbers)
        {
            System.out.println(number);
        }
    }
}
