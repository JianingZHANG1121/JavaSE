package BigInteger;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {

        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3); // Addition

        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr[0]); // Divider
        System.out.println(arr[1]); // Remainder

        boolean result = bd1.equals(bd2);
        System.out.println(result); // Equation

        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4); // Power

        BigInteger bd5 = bd1.max(bd2);
        System.out.println(bd5); // Maximum

        BigInteger bd6 = BigInteger.valueOf(1000);
        int i = bd6.intValue(); // BigInteger to Int (Cannot out of int's range)
        System.out.println(i);

        BigInteger bd7 = BigInteger.valueOf(200);
        double j = bd7.doubleValue(); // BigInteger to Double (Cannot out of double's range)
        System.out.println(j);

    }
}
