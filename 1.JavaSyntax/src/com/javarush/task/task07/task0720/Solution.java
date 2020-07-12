package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < m; i++)
        {
            String str = list.get(0);
            list.add(str);
            list.remove(0);
        }

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }


    }
}
