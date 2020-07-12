package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum;


        if (n>0)
        {
            int k = Integer.parseInt(reader.readLine());
            maximum =k;
            for( int i=1; i<=n-1 ; i++)
            {
                int j = Integer.parseInt(reader.readLine());
                if (maximum < j)
                {
                    maximum = j;
                }
            }
          System.out.println(maximum);
        }

    }
}
