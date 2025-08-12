package Runtime;

import java.io.IOException;

public class RuntimeDemo {

    public static void main(String[] args) throws IOException {

        // Get System Runtime Object
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();

        // Stop JVM
        // Runtime.getRuntime().exit(0);
        System.out.println("See if JVM stopped");

        // Get CPU Process Num
        System.out.println(Runtime.getRuntime().availableProcessors());

        // Get Maximum Memory (byte)
        System.out.println("MaxMemory in GB: " + Runtime.getRuntime().maxMemory() / 1024 / 1024);

        // Get Total Memory used by JVM from system
        System.out.println("Total Memory used by JVM in GB: " + Runtime.getRuntime().totalMemory() / 1024 / 1024);

        // Get free Memory in JVM
        System.out.println("Free Memory in JVM in GB: " + Runtime.getRuntime().freeMemory() / 1024 / 1024);

        // Run CMD Commands
        Runtime.getRuntime().exec("notepad");

    }

}
