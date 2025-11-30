public class Exercitiul5 {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25, 30, 35};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the elements is: " + sum);
    }
}

