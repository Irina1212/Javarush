package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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


        if (a<=b && a>=c || a<=c && a>=b )
            System.out.println(a);
        else if (b<=a && b>=c || b<=c && b>=a )
            System.out.println(b);
        else if (c<=a && c>=b || c<=b && c>=a )
            System.out.println(c);
        else
            System.out.println(a);

    }
}
