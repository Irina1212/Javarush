package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String babushkaName = reader.readLine();
        Cat babushka = new Cat(babushkaName);
        String dedName = reader.readLine();
        Cat ded = new Cat(dedName);


        String motherName = reader.readLine();
        Cat mother = new Cat(motherName,babushka);
        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName,ded);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother, father);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);


       /* String mamaName1 = reader.readLine();
        Cat catDaughter1 = new Cat(daughterName1, catMother1);
        String daughterName1 = reader.readLine();
        Cat catDaughter1 = new Cat(daughterName1, catMother1);
*/

        System.out.println(mother);
        System.out.println(father);
        System.out.println(daughter);
        System.out.println(son);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parenMama;
        private Cat parentPapa;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent) {
            this.name = name;
            this.parent = parent;
        }

        Cat(String name, Cat parentMama, Cat parentPapa) {
            this.name = name;
            this.parenMama = parentMama;
            this.parentPapa = parentPapa;
        }

        @Override
        public String toString() {
            if (parent == null)
                return "The cat's name is " + name + ", no mother ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name;
        }
    }

}
