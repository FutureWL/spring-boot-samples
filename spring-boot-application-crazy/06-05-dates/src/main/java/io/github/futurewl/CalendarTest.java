package io.github.futurewl;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarTest {

    public static void main(String[] args) {
//        Locale.setDefault(Locale.ENGLISH);
        TimeZone.setDefault(TimeZone.getTimeZone("EST"));
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        System.out.println(c2.getTime());
    }

}
