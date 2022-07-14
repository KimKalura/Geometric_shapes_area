package School;

public class Student extends Person {
    private String groupClass;

    public Student(String firstName, String lastName, String groupClass) {
        super(firstName, lastName);
        this.groupClass = groupClass;
    }

    public String getGroupClass() {
        return groupClass;
    }

    public void setGroupClass(String groupClass) {
        this.groupClass = groupClass;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + this.getFirstName() + " " + this.getLastName() + " and I am in the " + this.groupClass + " Group.");

    }

    @Override
    public String toString() {
        return "Student{" +
                "groupClass='" + groupClass + '\'' +
                '}';
    }
}
