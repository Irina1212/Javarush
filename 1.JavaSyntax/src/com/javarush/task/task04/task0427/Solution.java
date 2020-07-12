package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        int num = (int)Math.log10(a)+1;


        if ( a>0 && a<1000 && a%2==0 && num==1)
        System.out.println("четное однозначное число");

        else if  ( a>0 && a<1000 && a%2!=0 && num==1 )
        System.out.println("нечетное однозначное число");

        else if  ( a>0 && a<1000 && a%2==0 && num==2 )
        System.out.println("четное двузначное число");

        else if  ( a>0 && a<1000 && a%2!=0 && num==2 )
        System.out.println("нечетное двузначное число");

        else if  ( a>0 && a<1000 && a%2==0 && num==3 )
        System.out.println("четное трехзначное число");

        else if  ( a>0 && a<1000 && a%2!=0 && num==3 )
        System.out.println("нечетное трехзначное число");

    }
}
