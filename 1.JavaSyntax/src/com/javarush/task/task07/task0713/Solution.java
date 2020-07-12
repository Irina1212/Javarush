package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //  заповнюю лист
        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < 20; i++) {
            int s = Integer.parseInt(reader.readLine());
            list.add(s);
        }

        ArrayList<Integer> dilNa3 = new ArrayList<Integer>();
        ArrayList<Integer> dilNa2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        // розділяю між трьома списками
        for (int i = 0; i < list.size(); i++)
        {
            if( list.get(i) % 3 == 0 && list.get(i) % 2 == 0)
            {
                dilNa2.add(list.get(i));
                dilNa3.add(list.get(i));
            }
            else if (list.get(i) % 3 == 0)
            {
                dilNa3.add(list.get(i));
            }
            else if (list.get(i) % 2 == 0)
            {
                dilNa2.add(list.get(i));
            }
            else
            {
                other.add(list.get(i));
            }
        }

        System.out.println("діляться на 3:");
        printList(dilNa3);
        System.out.println("діляться на 2:");
        printList(dilNa2);
        System.out.println("інші:");
        printList(other);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}

