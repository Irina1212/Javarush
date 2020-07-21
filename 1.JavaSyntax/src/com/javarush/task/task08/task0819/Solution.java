package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator2 = cats.iterator();

        while (iterator2.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Cat one = iterator2.next();
            iterator2.remove();
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Cat one = iterator.next();
            System.out.println(one);
        }
    }

    // step 1 - пункт 1
    public static class Cat
    {
    }
}
