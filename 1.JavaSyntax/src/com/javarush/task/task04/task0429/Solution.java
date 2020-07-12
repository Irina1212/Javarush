package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);

        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);

        int countN = 0; // кількість негативних чисел
        int countP = 0; // кількість позитивних чисел

        if (a<0)
             countN++;
        if (b<0)
             countN++;
        if (c<0)
             countN++;


        if (a>0)
             countP++;
        if (b>0)
             countP++;
        if (c>0)
             countP++;


        System.out.println("количество отрицательных чисел: " + countN);
        System.out.println("количество положительных чисел: " + countP);

         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);

        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);

        int countN = Neg(a)+Neg(b)+Neg(c);
        int countP =  Poz(a)+Poz(b)+Poz(c);;

        System.out.println("количество отрицательных чисел: " + countN);
        System.out.println("количество положительных чисел: " + countP);

    }

    public static int Poz(int n)
    {
        if (n>0)
            return 1;
        else
            return 0;
    }

    public static int Neg(int n)
    {
        if (n<0)
            return 1;
        else
            return 0;
    }


}
