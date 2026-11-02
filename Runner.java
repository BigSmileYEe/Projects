
import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        // created cthe scanner for user input
        Scanner input = new Scanner(System.in);

        // first pet using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());
        System.out.println();

        // second pet using custom constructor
        Pet pet2 = new Pet("Buster", "Dog", 11);
        System.out.println(pet2.toString());
        System.out.println();

        // get information for the third pet
        System.out.println("Enter animal type:");
        String type = input.nextLine();

        System.out.println("Enter animal name:");
        String name = input.nextLine();

        System.out.println("Enter animal age:");
        int age = input.nextInt();

        // create and display the third pet
        Pet pet3 = new Pet();
        pet3.setType(type);
        pet3.setName(name);
        pet3.setAge(age);

        System.out.println();
        System.out.println(pet3.toString());

        input.close();
    }
}
