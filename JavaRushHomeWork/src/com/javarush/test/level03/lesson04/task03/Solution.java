package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "protoss";
        Zerg zerg2 = new Zerg();
        zerg1.name = "protoss3";
        Zerg zerg3 = new Zerg();
        zerg1.name = "zerg4";
        Zerg zerg4 = new Zerg();
        zerg1.name = "zerg5";
        Zerg zerg5 = new Zerg();
        zerg1.name = "zerg6";
        Zerg zerg6 = new Zerg();
        zerg1.name = "zerg7";
        Zerg zerg7 = new Zerg();
        zerg1.name = "zerg8";
        Zerg zerg8 = new Zerg();
        zerg1.name = "zerg9";
        Zerg zerg9 = new Zerg();
        zerg1.name = "zerg10";
        Zerg zerg10 = new Zerg();
        zerg1.name = "zerg2";

        Protos protoss1 = new Protos();
        protoss1.name = "protoss1";
        Protos protoss2 = new Protos();
        protoss1.name = "protoss2";
        Protos protoss3 = new Protos();
        protoss1.name = "protoss3";
        Protos protoss4 = new Protos();
        protoss1.name = "protoss4";
        Protos protoss5 = new Protos();
        protoss1.name = "protoss5";

        Terran ter1 = new Terran();
        ter1.name = "ter1";
        Terran ter2 = new Terran();
        ter2.name = "ter2";
        Terran ter3 = new Terran();
        ter3.name = "ter3";
        Terran ter4 = new Terran();
        ter4.name = "ter4";
        Terran ter5 = new Terran();
        ter5.name = "ter5";
        Terran ter6 = new Terran();
        ter6.name = "ter6";
        Terran ter7 = new Terran();
        ter7.name = "ter7";
        Terran ter8 = new Terran();
        ter8.name = "ter8";
        Terran ter9 = new Terran();
        ter9.name = "ter9";
        Terran ter10 = new Terran();
        ter10.name = "ter10";
        Terran ter11 = new Terran();
        ter11.name = "ter11";
        Terran ter12 = new Terran();
        ter12.name = "ter12";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }

}