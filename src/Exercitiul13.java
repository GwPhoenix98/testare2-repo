import Ex13Methods.Student;
import Ex13Methods.Person;

public class Exercitiul13 {
    public static void main(String[] args) {

        Person person = new Person("Ion", 27);
        Student student = new Student("Sandu", 25, "Informatics", 2);

        person.display();
        student.display();

        student.setSpecialty("Mathematics");
        System.out.println("The student's new domain: " + student.getSpecialty());

        student.display();
    }
}

