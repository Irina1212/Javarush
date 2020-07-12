package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg z1 = new Zerg();
        z1.name = "Z1";
        Zerg z2 = new Zerg();
        z2.name = "Z2";
        Zerg z3 = new Zerg();
        z3.name = "Z3";
        Zerg z4 = new Zerg();
        z4.name = "Z4";
        Zerg z5 = new Zerg();
        z5.name = "Z5";


        Protoss prot1 = new Protoss();
        prot1.name = "Prot1";
        Protoss prot2 = new Protoss();
        prot2.name = "Prot2";
        Protoss prot3 = new Protoss();
        prot3.name = "Prot3";

        Terran terran1 = new Terran();
        terran1.name = "Terra1";
        Terran terran2 = new Terran();
        terran2.name = "Terra2";
        Terran terran3 = new Terran();
        terran3.name = "Terra3";
        Terran terran4 = new Terran();
        terran4.name = "Terra4";


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
