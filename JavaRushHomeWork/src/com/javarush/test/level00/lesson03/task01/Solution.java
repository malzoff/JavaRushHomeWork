package com.javarush.test.level00.lesson03.task01;

/* Элли самая красивая
Написать программу, выводящую на экран надпись «Элли самая красивая» 5 раз. Каждый раз – с новой строки.
Пример вывода на экран:
Элли самая красивая
Элли самая красивая
Элли самая красивая
Элли самая красивая
Элли самая красивая
*/
public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        print3("Элли самая красивая");
    }


    static void print3(String s)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(s);
        }
    }
}
