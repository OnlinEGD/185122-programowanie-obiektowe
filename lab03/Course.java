package lab03;

public class Course {
    public String name;
    public static final int maxStudents = 10;
    public static int numberOfCreatedCourses = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course()
    {
        numberOfCreatedCourses++;
    }
}
