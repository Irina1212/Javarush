package com.javarush.task.task08.task0827;

/* 
Работа с датой
*/

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }


    public static boolean isDateOdd(String date) {

        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

        try {
            Date dateNew = format.parse(date);
            System.out.println(dateNew);

            //виясняю кількість днів у поточному місяці
            // та який зараз місяць
            Integer day = dateNew.getDate();
            System.out.println("день " + day);
            Integer month = dateNew.getMonth();
            System.out.println("місяць " + month);

            //рахую кількість днів до поточного місяця
            Integer[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int dayOfM = 0;
            for (int i = 0; i < month; i++) {
                dayOfM = dayOfM + dayOfMonth[i];
            }
            System.out.println("днів у місяці " + dayOfM);

            // виясняю який рік
            Integer dateNewYeer = dateNew.getYear() + 1900;
            System.out.println("рік " + dateNewYeer);

            // виясняю чи рік високосний, якщо так - valueYear = 1
            int valueYear = 0;
            if ((dateNewYeer % 4) == 0 && (dateNewYeer % 100) != 0) {
                valueYear = 1;
                System.out.println("год високосний");
            } else if ((dateNewYeer % 400) == 0) {
                valueYear = 1;
                System.out.println("год високосний");
            } else {
                System.out.println("год не високосний valueYear " + valueYear);
            }

            //рахую всі дні
            int countAllDay = dayOfM + day;

            if (dayOfM + day == 59 && month == 1) {
            }
            else if (valueYear == 1 && month > 1)
                countAllDay = countAllDay + valueYear;
            else
                 {};


            if (countAllDay % 2 == 1) {
                return true;
            }
        }

        catch (ParseException e) {
            e.printStackTrace();
        }

        return false;
    }

}
