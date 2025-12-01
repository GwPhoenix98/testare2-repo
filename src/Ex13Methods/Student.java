package Ex13Methods;

public class Student extends Person {
    private String specialty;
    private int studyYear;

    public Student(String name, int age, String specialty, int studyYear) {
        super(name, age);
        this.specialty = specialty;
        this.studyYear = studyYear;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    @Override
    public void display() {
        System.out.println("Student: " + getName() + ", age: " + getAge() +
                ", specialty: " + specialty + ", an: " + studyYear);
    }
}