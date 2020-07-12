package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sa = reader.readLine(); //читаем строку с клавиатуры
        int a = Integer.parseInt(sa);  // перша сторона

        if ( a>0 && (a%2)==0 )
            System.out.println("положительное четное число");
        else if ( a>0 && (a%2)!=0 )
            System.out.println("положительное нечетное число");
        else if ( a<0 && (a%2)==0 )
            System.out.println("отрицательное четное число");
        else if ( a<0 && (a%2)!=0 )
            System.out.println("отрицательное нечетное число");
        else
            System.out.println("ноль");


    }
}
