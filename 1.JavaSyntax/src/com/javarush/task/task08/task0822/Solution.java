package com.javarush.task.task08.task0822;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        Collections.sort(array);
        Integer min = array.get(0);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         Integer n = Integer.parseInt(reader.readLine());

        List<Integer> integerList =  new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            Integer one = Integer.parseInt(reader.readLine());
            integerList.add(one);
        }

        return integerList;
    }
}
