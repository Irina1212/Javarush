package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/
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

        String s3 = reader.readLine();
        int n3 = Integer.parseInt(s3);

        String s4 = reader.readLine();
        int n4 = Integer.parseInt(s4);

       // int a = MaxD(n1, n2);
       // int b = MaxD(n3, n4);
        // System.out.println( MaxD(a,b) );

        System.out.println(MaxD( MaxD(n1, n2), MaxD(n3, n4)));

    }
    public static int MaxD(int a, int b )
    {
        if (a<b)
            return b;
        else if (b<a)
            return a;
        else
            return a;
    }
}
