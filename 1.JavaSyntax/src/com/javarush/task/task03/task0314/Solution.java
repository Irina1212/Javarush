package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i=1 ; i<=10; i++) {
            for ( int n = 1; n<=10; n++){
                System.out.print( i*n + " ");
            }
            System.out.println();
        }

    }
}
