package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        int min = list.get(0).length();
        for (int i = 1; i < list.size(); i++)
        {
            if (min > list.get(i).length())
            {
                min = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() == min)
                System.out.println(list.get(i));
        }
    }
}
