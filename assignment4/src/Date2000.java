

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Oscar on 2017-01-22.
 */
public class Date2000 {
    private static final int[] daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    private static final String[] weekDays =  {"Söndag","Måndag","Tisdag","Onsdag","Torsdag","Fredag","Lördag"};

    private int day;
    private int month;
    private int year;
    private int totalDays;


    public Date2000(String date){
        day = Integer.parseInt(Character.toString(date.charAt(0)) + Character.toString(date.charAt(1)));
        month = Integer.parseInt(Character.toString(date.charAt(3)) + Character.toString(date.charAt(4)));
        year = Integer.parseInt(Character.toString(date.charAt(6)) + Character.toString(date.charAt(7)) + Character.toString(date.charAt(8)) + Character.toString(date.charAt(9)));
        totalDays = 0;

    }

    private boolean leapYear(int year){
        return (year%4)==0;
    }


    public String getWeekday(){
        if((year-2000) != 0){
            for(int i = 0; i < year-2000; i++){
                if(leapYear(i)){
                    totalDays += 366;
                }else {
                    totalDays += 365;
                }
            }
        }
        for(int i = 0; i < month-1;i++){
            totalDays += daysPerMonth[i];
        }
        totalDays = totalDays + day-1;
        int dayOfTheWeek = (totalDays%7)-1;
        if(totalDays%7 == 0){
            dayOfTheWeek = 6;
        }
        return weekDays[dayOfTheWeek];
    }



}
