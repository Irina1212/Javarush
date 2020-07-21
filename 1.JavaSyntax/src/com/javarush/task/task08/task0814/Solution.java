package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> numberSet = new HashSet<>();

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(4);
        numberSet.add(5);
        numberSet.add(6);
        numberSet.add(7);
        numberSet.add(8);
        numberSet.add(9);
        numberSet.add(10);
        numberSet.add(11);
        numberSet.add(12);
        numberSet.add(13);
        numberSet.add(14);
        numberSet.add(15);
        numberSet.add(16);
        numberSet.add(17);
        numberSet.add(18);
        numberSet.add(19);
        numberSet.add(20);

        return numberSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            Integer x = iterator.next();

            if ( x > 10 )
            {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        Set<Integer> numberSet = createSet();

        numberSet = removeAllNumbersGreaterThan10(numberSet);


    }

}


