public class RegexDemo5 {
    public static void main(String[] args) {

        catchGroupDemo1();
        catchGroupDemo2();
        nonCatchGroupDemo();

    }

    public static void catchGroupDemo1(){

        /*
         * Catch Group
         * () -> group
         * . -> any char
         * \\num -> the number of group with reference to left quote (
         * + -> appear at least once
         */

        // Start Char == End Char
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("15661".matches(regex1));
        System.out.println("a123b".matches(regex1));

        // Start Str = End Str
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2)  );
        System.out.println("123777123".matches(regex2)  );
        System.out.println("abc123abd".matches(regex2)  );

        // Start Str = End Str && Every Char is Identical in Start/End Str
        String regex3 = "((.)\\2?).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("111234111".matches(regex3));
        System.out.println("121aaa112".matches(regex3));

    }

    public static void catchGroupDemo2(){

        String str = "AAAAAAAAAAAAAAAmmmmmmmmmmmmyyyyyyyyyyyyy";

        /*
         * Replace the duplicate char with only one
         * $num -> get the group content when not in the regex
         */
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);

    }

    public static void nonCatchGroupDemo(){

        /*
         * Non-catch Group
         * Does not take up the Group Number
         * (?=) (?:) (?!)
         */

        // Example in RegexDemo2

    }

}
