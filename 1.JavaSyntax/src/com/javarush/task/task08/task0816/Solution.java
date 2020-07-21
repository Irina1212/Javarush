package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.util.Calendar.JUNE;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map <String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Устименко", dateFormat.parse("JANUARY 12 1996"));
        map.put("Чура", dateFormat.parse("MAY 3 1990"));
        map.put("Пупкін", dateFormat.parse("MARCH 6 2000"));
        map.put("Птушкін", dateFormat.parse("MAY 7 1960"));
        map.put("Пушкін", dateFormat.parse("JUNE 17 1800"));
        map.put("ЛедіГага", dateFormat.parse("MAY 13 2000"));
        map.put("Монатік", dateFormat.parse("AUGUST 11 1980"));
        map.put("Мадонна", dateFormat.parse("JULY 6 1975"));
        map.put("Гомес", dateFormat.parse("DECEMBER 8 1993"));

        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Date> pair = iterator.next();
            String key = pair.getKey();//ключ
            Date value  = pair.getValue();

            if ( value.getMonth() > 4 && value.getMonth() < 8)
            {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
