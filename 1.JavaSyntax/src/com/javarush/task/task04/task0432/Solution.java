package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();

        String s2 = reader.readLine();
        int n = Integer.parseInt(s2);

        int i=1;
        while (i<=n) {
            System.out.println(s1);
            i++;
        }

    }
}
