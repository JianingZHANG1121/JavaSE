public class RegexDemo4 {
    public static void main(String[] args) {

        String str = "AmyasdfghjklNingasdfghjklAmy";

        /*
         * 1. Replace "asdfghjkl" with " love "
         * 2. Get the three names
         */

        // replaceAll()
        String result=str.replaceAll("asdfghjkl", " loves ");
        System.out.println(result);

        // split()
        String[] arr = str.split("asdfghjkl");
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
