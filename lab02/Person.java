public class Person
{
    String name;

    public Person(String name)
    {
        this.name = name;
    }
    public Person(Person otherPerson)
    {
        this.name = otherPerson.name;
    }
    public void introduceYourself()
    {
        System.out.println(name);
    }
}
