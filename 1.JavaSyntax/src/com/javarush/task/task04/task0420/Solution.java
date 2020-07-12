package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        int maxim = MaxD( MaxD(a,b) , c );
        int minim = MinD( MinD(a,b) , c );

        if (a<=b && a>=c || a<=c && a>=b )
            System.out.println(maxim + " " + a + " " + minim );
        else if (b<=a && b>=c || b<=c && b>=a )
            System.out.println(maxim + " " + b + " " + minim );
        else if (c<=a && c>=b || c<=b && c>=a )
            System.out.println(maxim + " " + c + " " + minim );

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

    public static int MinD(int a, int b )
    {
        if (a>b)
            return b;
        else if (b>a)
            return a;
        else
            return a;
    }

}

