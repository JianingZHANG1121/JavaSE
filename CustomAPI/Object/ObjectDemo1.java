package Object;

public class ObjectDemo1 {

    public static void main(String[] args) {

        // toString(): Return String Expression of Object
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);

        /*
         * equals(): Compare if equal (Data Structure and Value)
         * If not overwrite, then it uses Object Class (Compare Address)
         * If overwrote, then it uses that Class's Method of equals() (such as String,
         * Compare Data Structure and Value)
         */
        String str2 = new String("1");
        String str3 = new String("1");

        boolean result1 = str2.equals(str3);
        System.out.println(result1);

        StringBuilder sb = new StringBuilder("1");
        boolean result2 = str2.equals(sb);
        System.out.println(result2);

    }

}
