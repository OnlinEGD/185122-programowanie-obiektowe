package lab04a;

public class Manager extends Employee{
    private String department;

    public Manager(String firstName) {
        super(firstName);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println(this.department);
    }
}
