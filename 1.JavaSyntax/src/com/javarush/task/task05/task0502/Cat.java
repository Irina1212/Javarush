package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int scoreOneCat = 0;
        int scoreTwoCat = 0;

        if (this.age>anotherCat.age)
            scoreOneCat++;
        else if (this.age<anotherCat.age)
            scoreTwoCat++;

        if (this.weight>anotherCat.weight)
            scoreOneCat++;
        else if (this.weight<anotherCat.weight)
            scoreTwoCat++;

        if (this.strength>anotherCat.strength)
            scoreOneCat++;
        else if (this.strength<anotherCat.strength)
            scoreTwoCat++;

        System.out.println(scoreOneCat + " " + scoreTwoCat);

        return scoreOneCat>0;



    }

    public static void main(String[] args) {
        Cat ira = new Cat();
        ira.age = 23;
        ira.weight = 52;
        ira.strength = 80;

        Cat nika = new Cat();
        nika.age = 23;
        nika.weight = 52;
        nika.strength = 80;

        System.out.println(nika.fight(ira));
        System.out.println(ira.fight(nika));


    }
}
