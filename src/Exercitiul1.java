public class Exercitiul1 {

    public static void main(String[] args) {

        byte bValue = 120;
        short sValue = bValue;
        System.out.println("Byte -> Short: " + sValue);

        int iValue = 2100;
        double dValue = iValue;
        System.out.println("Int -> Double: " + dValue);

        long lValue = 20000L;
        int iValue2 = (int) lValue;
        System.out.println("Long -> Int: " + iValue2);
    }
}
