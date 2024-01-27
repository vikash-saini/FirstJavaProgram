package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {
    public static void main(String[] args) {

//        System.currentTimeMillis() will tell you that how many milliseconds has been passed since 1 Jan 1970 to till today
        System.out.println(System.currentTimeMillis());
        System.out.println(Long.MAX_VALUE);

        Date d = new Date(); //date class throws the today's date
        System.out.println(d);
        Date f = new Date(22345678);
        System.out.println(d.getTime()/1000/3600/12);
        System.out.println("Time"+d.getHours()+":"+d.getMinutes());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE)); //12
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));


        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2020));

        LocalDate l = LocalDate.now();
        System.out.println(l);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-mm-yyyy --E h:m:s");
        System.out.println(dtf.format(ldt)); //create date string using date and format
        System.out.println(dtf1.format(ldt));

        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf2.format(ldt));

        String input = "01/01/2023";

//        System.out.println("dateformat: "+dtf.format(ldt));
//        DateTimeFormatter oldPattern = DateTimeFormatter .ofPattern("dd/MM/yyyy");
//        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        LocalDate datetime = LocalDate.parse(input, oldPattern);
//        System.out.println("dateformat oldformat: "+datetime);
//        String output = datetime.format(newPattern);
//        System.out.println("Date in old format (java 8) : " + input);
//        System.out.println("Date in new format (java 8) : " + output);

    }
}
