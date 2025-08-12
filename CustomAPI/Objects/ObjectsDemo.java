package Objects;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {

        String s1 = null;
        String s2 = new String("1");

        // isNull()
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

        // nonNull()
        System.out.println(Objects.nonNull(s1));
        System.out.println(Objects.nonNull(s2));

        // equals(): cannot have null value compared
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
    }
}
