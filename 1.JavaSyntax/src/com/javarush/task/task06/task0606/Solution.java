package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int length = (int) (Math.log10(a) + 1);

        for ( int i = 1; i <= length; i++) {

            if (a % 2 == 0) {
                even++;
                a = a/10;
            }
            else {
                odd++;
                a = a/10;
            }
        }

        System.out.print("Even: " + even + " Odd: " + odd);

    }
}
