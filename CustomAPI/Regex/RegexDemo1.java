public class RegexDemo1 {
    public static void main(String[] args) throws Exception {

        /*
         * ^ -> Except
         * . -> Any Character
         * ? or * -> Appear once or never
         * + -> Appear at least once
         * \d -> [0-9]
         * \D -> [^0-9]
         * \s -> Blank Char
         * \S -> not-Blank Char -> [^\s]
         * \w -> English Char, Number and _
         * \W -> not-Word Char -> [^\w]
         * [] -> Range -> [0-8], [a-zA-Z]
         * {} -> Following Digits -> {2,4} -> follow by 2 to 4 Chars
         * () -> divide as group
         */

        // String Match Use Regular Expression
        String phoneNum1 = "13755986278";
        String phoneNum2 = "15919808990";

        String regex1 = "1[3-9]\\d{9}";
        System.out.println(phoneNum1.matches(regex1));
        System.out.println(phoneNum2.matches(regex1));

        String teleNum1 = "0712-3242434";
        String teleNum2 = "02122442";

        String regex2 = "0\\d{2,3}-?\\d{4,9}";
        System.out.println(teleNum1.matches(regex2));
        System.out.println(teleNum2.matches(regex2));

        String email1 = "2837418055@qq.com";
        String email2 = "zjn20041121@outlook.com";
        String email3 = "abc@pci.com.cn";

        String regex3 = "\\w+@[\\w&&[^_]]{2,8}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println(email1.matches(regex3));
        System.out.println(email2.matches(regex3));
        System.out.println(email3.matches(regex3));

        String userName1 = "Dream_111";
        String userName2 = "_HelloIamNing_";

        String regex4 = "\\w{4,16}";

        System.out.println(userName1.matches(regex4));
        System.out.println(userName2.matches(regex4));

        String idNum1 = "362522200411210033";
        String idNum2 = "36102119810616008X";

        String regex5 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dxX]";
        System.out.println(idNum1.matches(regex5));
        System.out.println(idNum2.matches(regex5));

    }
}
