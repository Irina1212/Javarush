package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map <String, String > slovar = new HashMap<>();
        slovar.put("Petrow", "Kolja");
        slovar.put("Ustymenko", "Iryna");
        slovar.put("Petrowa", "Nika");
        slovar.put("Petrowna", "Nika");
        slovar.put("Pet", "Viktor");
        slovar.put("Kos", "Viktor");
        slovar.put("Nikon", "Ann");
        slovar.put("Canon", "Mar");
        slovar.put("Mur", "Sia");
        slovar.put("Pes", "Gaga");

        return slovar;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        // заношу всі значення в масив
        Iterator<Map.Entry<String, String >> iterator = map.entrySet().iterator();
        List<String> pohozye = new ArrayList<>();
        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair1 = iterator.next();
            String value1  = pair1.getValue(); //  получаю значення
            pohozye.add(value1);
        }

        // шукаю в масиві унікальні
        List<String> nePohozye = new ArrayList<>();
        for( int i = 0; i < pohozye.size(); i++)
        {
            for( int j = i+1; j < pohozye.size(); j++) {
                if (pohozye.get(i).equals(pohozye.get(j)))
                {
                    String s = pohozye.get(i);
                    nePohozye.add(s);
                }
            }
        }

        // видаляю зі списку дублікати
        for (int i = 0; i < nePohozye.size(); i++)
        {
            removeItemFromMapByValue(map, nePohozye.get(i));
        }


        /*// друкую масив
        Iterator<String> iterator1 = nePohozye.iterator();
        while (iterator1.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator1.next();
            System.out.println(text);
        }*/

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy2 = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy2.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

        /*Map <String, String > myMap = createMap();

        removeTheFirstNameDuplicates(myMap);

        Iterator<Map.Entry<String, String>> iterator3 = myMap.entrySet().iterator();
        while (iterator3.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator3.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }*/

    }
}
