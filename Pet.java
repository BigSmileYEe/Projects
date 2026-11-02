public class Pet
{
    // private variable for the pet's name
    private String name;

    // default constructor
    public Pet()
    {
        setName("Pet Name");
    }

    // set the pet's name
    public void setName(String newName)
    {
        name = newName;
    }

    // get the pet's name
    public String getName()
    {
        return name;
    }

    // display pet information
    public String toString()
    {
        return "Pet information:\nName: " + name;
    }

    public static void main(String[] args)
    {
        // create the first pet
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        System.out.println();

        // create the second pet
        Pet pet2 = new Pet();
        pet2.setName("Buster");
        System.out.println(pet2.toString());
    }
}

