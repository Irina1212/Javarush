package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;

        while (true) {
            String sa = reader.readLine(); //читаем строку с клавиатуры
            int number = Integer.parseInt(sa);
            count++;

            if (number==-1)
            break;
            else
                sum = sum + number;
        }

       double medium = 1.0*sum/--count;

        System.out.println(medium);


    }
}

