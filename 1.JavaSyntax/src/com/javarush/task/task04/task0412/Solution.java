package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine(); //читаем строку с клавиатуры
        int n = Integer.parseInt(s);

        if (n>0)
        {
            n=n*2;
            System.out.println(n);
        }

        else if (n<0)
        {
            n=n+1;
            System.out.println(n);
        }

        else
        {
            System.out.println("0");
        }



    }

}