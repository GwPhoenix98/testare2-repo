package Method;

public class ComparePozOrNeg {

    public void setPozOrNeg(int number) {

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("Yhe number is negative");
        } else {
            System.out.println("The number is equal to zero.");
        }
    }
}
