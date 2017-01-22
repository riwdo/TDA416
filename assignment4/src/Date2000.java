

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Oscar on 2017-01-22.
 */
public class Date2000 {
    private Calendar c;
    private static final String[] days =  {"Söndag","Måndag","Tisdag","Onsdag","Torsdag","Fredag","Lördag"};


    public Date2000(){
        c = Calendar.getInstance();
    }


    public String day(String date) throws ParseException {
        c.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(date));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek-1];
    }



}
