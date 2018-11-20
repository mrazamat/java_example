package uz.coder.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DisplayCurrentDate {
    public static void main(String[] args) {
        // Display Current Date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //Display Current Time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        //Display Current Date and Time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Formatting Date and Time
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
