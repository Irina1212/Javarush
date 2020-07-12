package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int n1 = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int n2 = Integer.parseInt(s2);

        if (n1<n2)
            System.out.println(n1);
        else if (n2<n1)
            System.out.println(n2);
        else
            System.out.println(n1);


    }
}