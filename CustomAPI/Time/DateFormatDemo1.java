package Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo1 {
    public static void main(String[] args) throws ParseException {

        simpleDateFormatUsage();

        parseDateFromString();

    }

    private static void parseDateFromString() throws ParseException {
        String str = "2003-12-24 03:12:24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date.getTime());
    }

    private static void simpleDateFormatUsage() {

        // Default Date Format
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);

        // Specific Date Format
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EE");
        String str2 = sdf2.format(d1);
        System.out.println(str2);
    }
}
