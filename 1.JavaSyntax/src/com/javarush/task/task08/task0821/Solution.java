package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);

    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map <String, String > slovar = new HashMap<>();
        slovar.put("Petrow", "Kolja");
        slovar.put("Ustymenko", "Iryna");
        slovar.put("Petrowa", "Nika");
        slovar.put("Petrowna", "Nika");
        slovar.put("Pet", "Viktor");
        slovar.put("Kos", "Viktor");
        slovar.put("Nikon", "Ann");
        slovar.put("Petrow", "Mar");
        slovar.put("Mur", "Sia");
        slovar.put("Pes", "Gaga");

        return slovar;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
