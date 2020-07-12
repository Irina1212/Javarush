package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine(); //читаем строку с клавиатуры
        double n = Double.parseDouble(s);



        if ( n>=0 && n<3 )
            System.out.println("зелёный");
        else if (  n>=3 && n<4 )
            System.out.println("жёлтый");
        else if ( n>=4 && n<5 )
            System.out.println("красный");
        else if ( (n%5)>=0 && (n%5)<3 )
            System.out.println("зелёный");
        else if (  (n%5)>=3 && (n%5)<4 )
            System.out.println("жёлтый");
        else
            System.out.println("красный");

    }
}