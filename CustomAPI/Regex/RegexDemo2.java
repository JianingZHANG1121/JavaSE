import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {

        // Source string
        String str = "I like Java. It has many versions, such as Java8 and Java11. Besides, the next is Java17, I believe Java17 would be coming soon.";

        // Simple pattern with no condition
        simplePattern(str);

        /*
         * Conditional pattern
         * 1. crawl only Java8, 11, 17, but only print Java, no version
         * 2. crawl Java8, 11, 17
         * 3. crawl all except Java8, 11, 17
         * use Non-catch Group
         */
        conditionalPattern1(str);
        conditionalPattern2(str);
        conditionalPattern3(str);

    }

    public static void simplePattern(String str) {

        // Define regex pattern
        String regex = "Java\\d{0,2}";

        // Get the object of regex expression
        Pattern p = Pattern.compile(regex);

        // Get the object of file matcher
        Matcher m = p.matcher(str);

        // matcher.find()
        // If found, true. Index would be recorded at bottom and increase next time
        // If not found, return false.
        // Loop to print all strings that satify regex
        while (m.find()) {
            String s = m.group(0);
            System.out.println(s);
        }

    }

    public static void conditionalPattern1(String str){

        /*
         * Define conditional regex pattern
         * ? represents "Java"
         */
        String regex = "Java(?=8|11|17)";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group(0);
            System.out.println(s);
        }

    }

    public static void conditionalPattern2(String str){

        /*
         * Define regex pattern
         * if ((?i)Java) -> don't care about upper and letter char -> ((?i)Java)(?:8|11|17)
         */
        String regex = "Java(?:8|11|17)";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group(0);
            System.out.println(s);
        }

    }

    public static void conditionalPattern3(String str){

        /*
         * Define regex pattern
         */
        String regex = "Java(?!8|11|17)";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while (m.find()) {
            String s = m.group(0);
            System.out.println(s);
        }

    }

}
