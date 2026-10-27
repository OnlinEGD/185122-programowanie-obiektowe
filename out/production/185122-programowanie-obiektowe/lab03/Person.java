package lab03;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person()
    {

    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getEmail()
    {
        return this.email;
    }

    public void setName(String name)
    {
        if(name == null || name == ""){ return; }
        this.name = name;
    }

    public void setAge(int age)
    {
        if(age < 0 || age > 150) { return; }
        this.age = age;
    }

    public void setEmail(String email)
    {
        if(!email.contains("%")) { return; }
        this.email = email;
    }
}
