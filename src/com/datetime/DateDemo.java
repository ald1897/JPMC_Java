package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfMonth());
        LocalTime time = LocalTime.now();
        System.out.println(time.getHour());
        LocalDateTime dateTime = LocalDateTime.of(2002, Month.APRIL, 2, 10, 30);
        System.out.println(dateTime);
    }
}
