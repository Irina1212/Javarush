package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        String s = "rftgyhuji";
        list.add(s);
        s = "rtrfgybhunj";
        list.add(s);
        s = "cfvgbhjnk";
        list.add(s);
        s = "dertfgyhujik";
        list.add(s);
        s = "r5tyuiop";
        list.add(s);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }


    }
}
