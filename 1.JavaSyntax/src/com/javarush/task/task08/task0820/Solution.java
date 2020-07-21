package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> result = new HashSet<Dog>();
        //напишите тут ваш код
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        result.add(dog1);
        result.add(dog2);
        result.add(dog3);

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
       Set <Object> setOb = new HashSet<>();
       setOb.addAll(cats);
       setOb.addAll(dogs);

        return setOb;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator <Cat> iterator = cats.iterator();

        while (iterator.hasNext())
        {
            Object objectCat = iterator.next();

            if (pets.contains(objectCat))
            {
                pets.remove(objectCat);
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator <Object> iterator = pets.iterator();

        while (iterator.hasNext())
        {
            Object objectPets = iterator.next();
            System.out.println(objectPets);
        }
    }

    //напишите тут ваш код
    public static class Cat
    {}

    public static class Dog
    {}
}
