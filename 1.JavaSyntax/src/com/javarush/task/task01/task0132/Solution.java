package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.rmi.ServerError;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sotni = number/100;

        int desatky = number/10-sotni*10;

        int odyn = number-sotni*100-desatky*10;

        return sotni+desatky+odyn ;


    }



}