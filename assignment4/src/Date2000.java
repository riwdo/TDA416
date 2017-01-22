

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Oscar on 2017-01-22.
 */
public class Date2000 {
    //private Calendar c;
    private static final int[] daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static final String[] weekDays =  {"Söndag","Måndag","Tisdag","Onsdag","Torsdag","Fredag","Lördag"};
    //year % 4 == 0

    public Date2000(String date){
        int day;
        int month;
        int year;

        int start = 0;

        day = Integer.parseInt(Character.toString(date.charAt(0)) + Character.toString(date.charAt(1)));
        month = Integer.parseInt(Character.toString(date.charAt(3)) + Character.toString(date.charAt(4)));
        year = Integer.parseInt(Character.toString(date.charAt(6)) + Character.toString(date.charAt(7)) + Character.toString(date.charAt(8)) + Character.toString(date.charAt(9)));

        System.out.println(year);
        int days = 0;
        if((year-2000) != 0){
                for(int i = 0; i < year-2000; i++){
                    if(i % 4 == 0){
                        days += 366;
                    }else {
                        days += 365;
                    }
                }
        }
        for(int i = 0; i < month-1;i++){
            days += daysPerMonth[i];
        }
        days = days + day-1;
        int dayOfTheWeek = (days%7)-1;
        if(days%7 == 0){
            dayOfTheWeek = 6;
        }



        System.out.println(weekDays[dayOfTheWeek]);


  //      c = Calendar.getInstance();
    }


    public boolean leapYear(int year){
        return (year%4)==0;
    }

/*
    public String day(String date) throws ParseException {
        c.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(date));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return days[dayOfWeek-1];
    }
*/


}
