package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        int x = 1;
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }*/

        list.add(1);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(23);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(5);
        list.add(7);

        ArrayList<Integer> kklist = new ArrayList<>() ;
        for (int i = 0; i < list.size(); i++) {

            for(int j = i+1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    x++;
                    kklist.add(i, x);
                }
                else {
                    kklist.add(i, x);
                    break;
                }
            }
            x = 1;
        }

        int max = kklist.get(0);
        for (int i = 1; i < kklist.size(); i++)
        {
            if (max < kklist.get(i))
            {
                max = kklist.get(i);
            }
        }

        System.out.println(max);
    }
}