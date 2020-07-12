package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] nom = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumParni = 0;
        int sumNeParni = 0;

        for (int i = 0; i < 15; i++)
        {
            nom[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 15; i++)
        {
            if ( i%2 == 0) {
                sumParni = sumParni + nom[i];
            }
            else {
                sumNeParni = sumNeParni + nom[i];
            }
        }

        if (sumParni > sumNeParni)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");


    }
}
