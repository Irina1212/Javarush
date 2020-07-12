package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        // мінімальна строка
        int min = list.get(0).length();
        for (int i = 1; i < list.size(); i++)
        {
            if (min > list.get(i).length())
            {
                min = list.get(i).length();
            }
        }

        // максимальна строка
        int max = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
            }
        }

        // вивід мінімальної чи максимальної строки
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == max || list.get(i).length() == min)
            {
                System.out.println(list.get(i));
                break;
            }

        }

    }
}
