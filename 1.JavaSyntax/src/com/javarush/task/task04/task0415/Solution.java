package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine(); //читаем строку с клавиатуры
        int a = Integer.parseInt(sa);  // перша сторона

        String sb = reader.readLine(); //читаем строку с клавиатуры
        int b = Integer.parseInt(sb);  // друга сторона

        String sc = reader.readLine(); //читаем строку с клавиатуры
        int c = Integer.parseInt(sc);   // третя сторона

        if ( (a+b)>c && (a+c)>b && (c+b)>a )
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");
    }
}