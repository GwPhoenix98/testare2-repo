package Method;

public class CompareNumbers {

    public void compNumbers(int num1, int num2, int num3) {

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("They are neither equal nor different.");
        }

    }
}
