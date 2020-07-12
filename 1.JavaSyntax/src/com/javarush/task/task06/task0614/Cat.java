package com.javarush.task.task06.task0614;

/* 
Статические коты
*/
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Cat {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++)
        {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
            for (int i = 0; i < cats.size(); i++)
            {
                int j = cats.size() - i - 1;
                System.out.println( cats.get(j) );
            }
    }
}
