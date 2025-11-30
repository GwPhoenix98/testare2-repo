import Method.ComparePozOrNeg;

import java.util.Scanner;

public class Exercitiul2 {

    public static void main(String[] args) {

        Scanner obScanner = new Scanner(System.in);
        ComparePozOrNeg getValue = new ComparePozOrNeg();

        System.out.print("Enter a whole number: ");
        int number = obScanner.nextInt();

        getValue.setPozOrNeg(number);

    }
}
