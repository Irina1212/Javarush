 package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/


 public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat ira = new Cat("Ira", 23, 52, 80 );
        Cat nika = new Cat("Nika", 20, 52, 85);
        Cat murka = new Cat("Murka", 2, 12, 30);

        System.out.println(ira.fight(nika));
        System.out.println(nika.fight(ira));
        System.out.println(nika.fight(murka));
        System.out.println(ira.fight(murka));

    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
