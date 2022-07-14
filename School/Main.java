package School;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Moshe", "Sarang", "Ebraistic", "Hebrew");
        teacher1.introduce();
        Student student1 = new Student("Ariella", "Solomon", "II.5");
        student1.introduce();

//       System.out.println(student1 instanceof Person);
//       System.out.println(student1 instanceof Student);
//       System.out.println(student1 instanceof Object);
    }
}
