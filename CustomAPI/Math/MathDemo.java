public class MathDemo {
    public static void main(String[] args) {

        /**
         * Math.abs() -> absolute value
         */
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));

        // bug: int range -> -2147483648 ~ 2147483647
        System.out.println(Math.abs(-2147483648)); // no corresponding positive int value -> output -2147483648
        System.out.println(Math.abs(-2147483647));
        // System.out.println(Math.absExact(-2147483648)); // generate error msg

        /**
         * Math.ceil() -> upper int value
         */
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.ceil(12.5));
        System.out.println(Math.ceil(-12.3));
        System.out.println(Math.ceil(-12.5));

        /**
         * Math.floor() -> lower int value
         */
        System.out.println(Math.floor(12.3));
        System.out.println(Math.floor(12.5));
        System.out.println(Math.floor(-12.3));
        System.out.println(Math.floor(-12.5));

        /**
         * Math.round() -> round to nearest int value (0.5 will round to upper int
         * value)
         */
        System.out.println(Math.round(12.3));
        System.out.println(Math.round(12.5));
        System.out.println(Math.round(-12.3));
        System.out.println(Math.round(-12.5));

        /**
         * Math.max(a, b) -> return larger value
         */
        System.out.println(Math.max(1, 2));

        /**
         * Math.min(a, b) -> return smaller value
         */
        System.out.println(Math.min(1, 2));

        /**
         * Math.pow(base, power) -> return power of base
         */
        System.out.println(Math.pow(1, 2));

        /**
         * Math.sqrt() -> sqrt root
         * Math.cbrt() -> cbrt root
         */
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8)); 

        /**
         * Math.random() -> random num between [0.0, 1.0)
         */
        System.out.println(Math.random()); 

    }

}
