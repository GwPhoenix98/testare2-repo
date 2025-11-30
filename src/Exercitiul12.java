import Method.Student;

public class Exercitiul12 {
    public static void main(String[] args) {

        Student student = new Student("Ion");

        System.out.println("The student's name is: " + student.getName());

        student.action();
    }
}
