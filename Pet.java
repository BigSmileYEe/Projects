public class Pet
{
    // private pet information
    private String name;
    private String type;
    private int age;

    // default constructor
    public Pet()
    {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    // custom constructor
    public Pet(String newName, String newType, int newAge)
    {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    // set and get the pet's name
    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    // set and get the pet's type
    public void setType(String newType)
    {
        type = newType;
    }

    public String getType()
    {
        return type;
    }

    // set and get the pet's age
    public void setAge(int newAge)
    {
        age = newAge;
    }

    public int getAge()
    {
        return age;
    }

    // return the sound the pet makes
    public String speak()
    {
        if (type.equalsIgnoreCase("Dog"))
        {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("Cat"))
        {
            return "Meow";
        }
        else
        {
            return "Yowl";
        }
    }

    // display the pet's information
    public String toString()
    {
        String info = "Pet information:\n";
        info += "Type: " + type + "\n";
        info += "Name: " + name + "\n";
        info += "Sound: " + speak() + "\n";
        info += "Age: " + age;

        return info;
    }
}
