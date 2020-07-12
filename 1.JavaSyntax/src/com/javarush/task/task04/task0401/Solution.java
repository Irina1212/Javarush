package com.javarush.task.task04.task0401;

/* 
Мне не подходит этот возраст…
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.aage);
        person.adjustAge(person.aage);
        System.out.println("Adjusted age is: " + person.aage);
    }

    public static class Person {
        public int aage = 20;

        public void adjustAge(int age) {
            aage = age + 20;
            System.out.println("Age in adjustAge() is: " + aage);
        }
    }
}
