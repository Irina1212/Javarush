package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] number = new int[20];

        for ( int i = 0; i < 20; i++)
        {
            number[i] = Integer.parseInt(reader.readLine());
        }

        maximum = number[0];
        for (int i = 1; i < number.length; i++)
        {
            if (maximum < number[i] )
                maximum = number[i];
        }

        minimum = number[0];
        for (int i = 1; i < number.length; i++)
        {
            if (minimum > number[i] )
                minimum = number[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}
