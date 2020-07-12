package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> number = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            number.add(Integer.parseInt(reader.readLine()));
        }

        // sort(array);
        Collections.sort(number);

        for (int x : number) {
            System.out.println(x);
        }
    }

    /* public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i =0; i < array.length-1; i++)
        {
            for (int j =0; j < array.length-1; j++)
            if ( array[j] < array[j+1])
            {
                int n = array[j];
                array[j] = array[j+1];
                array[j+1] = n;
            }
        }
    }

     */
}
