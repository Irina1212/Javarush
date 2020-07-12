package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);

        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);
        int count = 0;

        if (c>0)
        {
            count++;
        }

        if (a>0)
        {
            count++;
        }

        if (b>0)
        {
            count++;
        }

        System.out.println(count);




     /*   if ( (a>0)^(b>0)^(c>0) ) // одне з чисел додатнє
            System.out.println("1");
        else if ( (a<0) && (b<0) && (c<0) ) // всі числа відємні
            System.out.println("0");
        else if ( (a>0) && (b>0) && (c>0) ) // всі числа додатні
            System.out.println("3");
        else if ( (a==0) && (b==0) && (c==0) ) // всі числа 0
            System.out.println("0");
        else
            System.out.println("2");

      */

    }
}
