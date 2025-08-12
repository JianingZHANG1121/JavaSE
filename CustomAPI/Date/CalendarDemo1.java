package Date;

import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {

        /* Calendar: abstract, can't new object
         * Get calendar of this time zone
         * Month: 0~11. 0 -> Jan
         * Week: 1~7. 1 -> Sunday
         */
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        // Change all the calendar
        // Date d = new Date(0L);
        // c.setTime(d);
        // System.out.println(c);

        // Change a specific part of calendar
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(year + ", " + month + ", " + date + ", " + week);

        c.set(Calendar.YEAR, 2003);
        c.set(Calendar.MONTH, 11);
        c.set(Calendar.DAY_OF_MONTH, 24);
        System.out.println(c.get(Calendar.YEAR) + "" + (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH));

        c.add(Calendar.YEAR, 1);
        c.add(Calendar.MONTH, -1);
        c.add(Calendar.DAY_OF_MONTH, -3);
        System.out.println(c.get(Calendar.YEAR) + "" + (c.get(Calendar.MONTH) + 1) + c.get(Calendar.DAY_OF_MONTH));

    }
}
