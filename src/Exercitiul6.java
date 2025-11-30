public class Exercitiul6 {
    public static void main(String[] args) {

        String text = "I'm studying the Java programming language, which I'm currently testing!";

        int firstM = text.indexOf('m');

        int lastM = text.lastIndexOf('m');

        if (firstM == -1) {
            System.out.println("The letter 'm' was not found in the text.");
        } else {
            System.out.println("The first occurrence of the letter 'm' is at index: " + firstM);
            System.out.println("The last occurrence of the letter 'm' is at index: " + lastM);
        }
    }
}
