package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date today = new Date();
        insert10000(list);
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - today.getTime(); //вычисляем разницу

        return msDelay;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
