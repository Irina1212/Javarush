package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name)
    {
        this.name = name;
        this.age = 2;
        this.weight = 12;
        this.color = "Black";
    }

    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Black";
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 12;
        this.color = "Black";
    }

    public void initialize(int age, String color)
    {
        this.age = age;
        this.weight = 12;
        this.color = color;
    }

    public void initialize(int age, String color, String address)
    {
        this.age = age;
        this.color = color;
        this.address = address;
        this.weight = 12;
    }


    public static void main(String[] args) {

    }
}
