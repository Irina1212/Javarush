package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //String string = "vfgbh - tvgyuh, tygu  Gyuhk";
        String[] subStr;
        String delimeter = "\\b"; // Разделитель
        subStr = string.split(delimeter); // Разделения строки str с помощью метода split()
        // Вывод результата на экран
        for(int i = 0; i < subStr.length; i++) {

            String word = subStr[i];
            subStr[i] = word.substring(0, 1).toUpperCase() + word.substring(1);
        }

        for(int i = 0; i < subStr.length; i++) {
            System.out.print(subStr[i]);
        }
        //напишите тут ваш код
    }
}
