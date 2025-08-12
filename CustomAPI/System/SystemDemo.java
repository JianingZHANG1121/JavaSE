public class SystemDemo {
    public static void main(String[] args) {

        /*
         * 0: normal exit
         * else: abnormal exit
         */
        // System.exit(0);
        // System.out.println("test of normal exit");

        /*
         * return current time (in milisecond)
         */
        long tm = System.currentTimeMillis();
        System.out.println(tm);

        /*
         * Copy Array
         * If Basic Data Structure -> should be the same
         * If Defined Data Structure -> should have transformation (Parent Class to Children Class)
         * Should not exceed array length
         */
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[10];

        System.arraycopy(arr1, 3, arr2, 4, 5);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
