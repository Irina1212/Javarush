package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

      //  System.out.println("Ввести с клавиатуры два целых числа, которые будут координатами точки,");
      //  System.out.println(" не лежащей на координатных осях OX и OY.");

        String s1 = reader.readLine();
        int x = Integer.parseInt(s1);

        String s2 = reader.readLine();
        int y = Integer.parseInt(s2);

        if (x>0 && y>0)
            System.out.println("1");
        else if (x>0 && y<0)
            System.out.println("4");
        else if (x<0 && y>0)
            System.out.println("2");
        else if (x<0 && y<0)
            System.out.println("3");

    }
}
