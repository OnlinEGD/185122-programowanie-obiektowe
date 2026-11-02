package lab04a;

public class Employee extends Person{

    public String position;
    public Employee(String firstName) {
        super(firstName);
    }

    public void displayData()
    {
        //System.out.println(this.firstName); nie pojdzie bo jest prywatne (gdyby bylo protected to by poszlo) ale ponizej mamy alternatywe
        System.out.println(this.getFirstName());
        System.out.println(this.lastName);
        System.out.println(this.position);
    }

    public void showInformation()
    {
        System.out.println(this.getFirstName());
        System.out.println(this.lastName);
        System.out.println(this.position);
    }
}
