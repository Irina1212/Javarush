package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map< String, String > list = new HashMap<>();
        while (true) {
            String sity = reader.readLine();
            if (sity.isEmpty()) {
                break;
            }

            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }

            list.put( sity, family );
        }

        // Read the house number
        //System.out.println("введіть місто");
        String nameSity = reader.readLine();

        if ( !nameSity.isEmpty() ) {
            if ( list.containsKey(nameSity) );
            {
                String familyName = list.get(nameSity);
                System.out.println(familyName);
            }
        }
    }
}
