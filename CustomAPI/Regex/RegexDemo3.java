import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {

        String str = "abbbbbbbbbbbaaaaaaaaaa";

        // Greedy Crawling (Default in Java): Get more as possible -> add + or * after regex
        String regex1 = "ab+";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(str);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        // Non-Greedy Crawling: Get less as possible -> add +? or *? after regex
        String regex2 = "ab+?";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(str);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }

    }
}
