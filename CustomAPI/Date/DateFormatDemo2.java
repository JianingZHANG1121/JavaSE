package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo2 {
    public static void main(String[] args) throws ParseException {

        printFormattedBirthdayPractice();

        decideIfSuccessPractice();

    }

    private static void decideIfSuccessPractice() throws ParseException {

        // Start Time & End Time
        String startStr = "2025-11-11 0:0:0";
        String endStr = "2025-11-11 0:10:0";

        // Ordering Time
        String orderStr1 = "2025-11-11 0:1:0";
        String orderStr2 = "2025-11-11 0:11:0";

        // Parse Date Object
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate1 = sdf.parse(orderStr1);
        Date orderDate2 = sdf.parse(orderStr2);

        // Get time in ms and compare
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime1 = orderDate1.getTime();
        long orderTime2 = orderDate2.getTime();

        if (orderTime1 >= startTime && orderTime1 <= endTime) {
            System.out.println("Order1 Success");
        } else {
            System.out.println("Order1 Fail");
        }

        if (orderTime2 >= startTime && orderTime2 <= endTime) {
            System.out.println("Order2 Success");
        } else {
            System.out.println("Order2 Fail");
        }

    }

    private static void printFormattedBirthdayPractice() throws ParseException {

        // Catch the date info
        String str = "2003-12-24";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);

        // Format and print
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        String result = sdf2.format(date);
        System.out.println("Her Birthday is " + result);
    }
}
