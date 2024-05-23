package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class GetCurrentDateAndTimeUsingDateTime {

    public static void main(String[] args) {

        // Using LocalDateTime API
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");

        String formattedTime = dateTime.format(formatter);

        System.out.println(dateTime);
        System.out.println(formattedTime);

        // Using LocalDate and LocalTime API
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formatTime = time.format(timeFormatter);
        System.out.println(date);
        System.out.println(time);
        System.out.println(formatTime);


        // Using SimpleDateFoemat with Date() API
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        String format = simpleDateFormat.format(new Date());
        System.out.println(format);

    }
}
