package BigInteger;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {

    public static void main(String[] args) {

        // BigInteger(int num, Random rnd): Return random BigInteger, range from 0 ~ (num power of 2 - 1)
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            BigInteger bd1 = new BigInteger(4, rnd);
            System.out.println(bd1);
        }
        // 100.fori -> tab will create a loop with i < 100

        // BigInteger(String val): Return the BigInteger in String val (must only contain integer in String)
        BigInteger bd2 = new BigInteger("123");
        System.out.println(bd2);

        // BigInteger(String val, int radix): Return BigInteger of val of corresponding radix (if radix is 2, val must only contain 0 and 1)
        BigInteger bd3 = new BigInteger("0101", 2);
        System.out.println(bd3);

        // BigInteger.valueOf(type num) -> range within long type -> 1000L represents long type 1000
        BigInteger bd4 = BigInteger.valueOf(1000L);
        System.out.println(bd4);

        // If an object of BigInteger is created, it would not be changed

    }
}
