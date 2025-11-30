import Method.CompareNumbers;

import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CompareNumbers getResponse = new CompareNumbers();

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        getResponse.compNumbers(number1, number2, number3);
    }
}
