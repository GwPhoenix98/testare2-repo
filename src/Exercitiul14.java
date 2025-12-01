class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age);
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {

            throw new InvalidAgeException(
                    "Error: The age you entered (" + age + ") is not valid!"
            );
        }
        this.age = age;
    }

    public void display() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

public class Exercitiul14 {
    public static void main(String[] args) {

        try {
            Student student = new Student("Ion", -5);
            student.display();

        } catch (InvalidAgeException e) {
            System.out.println("A custom exception was caught!");
            System.out.println("Details: " + e.getMessage());
            System.out.println("Suggestion: Please enter an age between 0 and 120.");
        }

        System.out.println("The program continues normally...");
    }
}