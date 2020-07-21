package com.javarush.task.task08.task0818;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map <String, Integer > slovar = new HashMap<>();
        slovar.put("Petrow", 500);
        slovar.put("Ustymenko", 10000);
        slovar.put("Petr", 8000);
        slovar.put("Petko", 50000);
        slovar.put("Pet", 4000);
        slovar.put("Kos", 4503);
        slovar.put("Nikon", 4567);
        slovar.put("Canon", 256);
        slovar.put("Mur", 7654);
        slovar.put("Pes", 476);

        return slovar;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer >> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Integer> pair1 = iterator.next();
            Integer value1  = pair1.getValue(); //  получаю значення

            if (value1 < 500)
            {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}