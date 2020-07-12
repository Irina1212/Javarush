package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[20];
        int[] n1 = new int[10];
        int[] n2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// великий масив
        for (int i = 0; i < 20; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

// копіювання великого масиву у два маленьких
        for (int i = 0; i < 10; i++) {
            n1[i] = num[i];
        }
        for (int i = 0; i < 10; i++) {
            n2[i] = num[10+i];
        }
// виведення на екран
        for (int i = 0; i < 10; i++) {
           System.out.println(n2[i]);
        }
    }
}
