package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (a==b)
            System.out.println(3);
        else if (a==c)
            System.out.println(2);
        else if (b==c)
            System.out.println(1);

    }
}
