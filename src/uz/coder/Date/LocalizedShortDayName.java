package uz.coder.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalizedShortDayName {
    public static void main(String[] args) {
        Date d = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        String format = dateFormat.format(d);
        System.out.println("Current date and time = " + format);
        System.out.printf("Localized day name = %tA/%TA\n",d,d);
        System.out.printf("Localized short day name = %ta/%Ta\n",d,d);
    }
}
