package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map <String, String > perepys = new HashMap<>();
        perepys.put("Petrow", "Kolja");
        perepys.put("Ustymenko", "Iryna");
        perepys.put("Petrowa", "Nika");
        perepys.put("Petrowna", "Nika");
        perepys.put("Pet", "Viktor");
        perepys.put("Kos", "Viktor");
        perepys.put("Nikon", "Ann");
        perepys.put("Canon", "Mar");
        perepys.put("Mur", "Sia");
        perepys.put("Pes", "Gaga");

        return perepys;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String value  = pair.getValue();//ключ

                if (value.equals(name))
                {
                    count++;
                }
        }

        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();//ключ

                if (key.equals(lastName))
                {
                    count++;
                }
        }

        return count;

    }

    public static void main(String[] args) {


    }
}
