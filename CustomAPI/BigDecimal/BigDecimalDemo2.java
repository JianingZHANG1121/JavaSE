package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo2 {
    public static void main(String[] args) {

        BigDecimal bd1 = BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(2.0);
        BigDecimal bd3 = bd1.add(bd2); // Addition
        System.out.println(bd3);

        BigDecimal bd4 = bd1.subtract(bd2); // Subtraction
        System.out.println(bd4);

        BigDecimal bd5 = bd1.multiply(bd2); // Multiplication
        System.out.println(bd5);

        BigDecimal bd6 = bd1.divide(bd2); // Divide with no remainder
        System.out.println(bd6);

        BigDecimal bd7 = BigDecimal.valueOf(3.0);
        BigDecimal bd8 = bd1.divide(bd7, 2, RoundingMode.HALF_UP); // Divide with rounding and rounding mode
        System.out.println(bd8);

        /*
         * Rounding Mode
         * UP: far from zero
         * DOWN: closer to zero
         * CEILING: closer to positive infinite
         * FLOOR: closer to negative infinite
         * HALF_UP: closer num. half to the bigger num
         * HALF_DOWN: closer num. half to the smaller num
         */

    }
}
