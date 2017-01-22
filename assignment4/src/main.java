import sun.util.calendar.BaseCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Oscar on 2017-01-22.
 */
public class main {

    public static void main(String[] args) throws ParseException {

        String date = "01/1/2000";

        Date2000 date2000 = new Date2000();
        System.out.println(date2000.day(date));
    }
}
