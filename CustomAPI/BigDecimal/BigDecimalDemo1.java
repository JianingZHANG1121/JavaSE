package BigDecimal;

import java.math.BigDecimal;

public class BigDecimalDemo1 {
    public static void main(String[] args) {

        // new BigDecimal by double value
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);

        System.out.println(bd1.add(bd2)); // not exact

        // new BigDecimal by String
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");

        System.out.println(bd3.add(bd4)); // exact

        // static method to new BigDecimal
        BigDecimal bd5 = BigDecimal.valueOf(10.0);
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd5);
        System.out.println(bd6);
        System.out.println(bd5 == bd6);

        // in range of double -> use valueof()
        // out of double's range -> new by String value
    }
}
