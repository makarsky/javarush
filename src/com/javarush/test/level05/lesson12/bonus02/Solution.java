package com.javarush.test.level05.lesson12.bonus02;



/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, min(b, min(c, min(d, e))));

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }
}
