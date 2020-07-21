package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        List<String> listMonth = new ArrayList<>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

        for (int i = 0; i < listMonth.size(); i++)
        {
            if (month.equals( listMonth.get(i)))
            {
                int numberMonth = i+1;
                System.out.println( month + " is the " + numberMonth + " month");
                break;
            }
        }

    }
}
