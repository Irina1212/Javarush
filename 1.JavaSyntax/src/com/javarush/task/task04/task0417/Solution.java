package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        if ( a==b && b==c)
            System.out.println( a + " " + b + " " + c );
        else if (a==b)
            System.out.println( a + " " + b );
        else if (a==c)
            System.out.println( a + " " + c );
        else if (c==b)
            System.out.println( c + " " + b );



    }
}