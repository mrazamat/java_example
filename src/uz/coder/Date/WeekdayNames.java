package uz.coder.Date;

import java.text.DateFormatSymbols;

public class WeekdayNames {
    public static void main(String[] args) {
        String[] days = new DateFormatSymbols().getWeekdays();
        for (String weekday : days) {
            System.out.println(weekday);
        }
    }
}
