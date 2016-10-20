package com.javarush.test.level05.lesson12.bonus03;



/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int max = Integer.parseInt(reader.readLine());

        for(int i = 1; i < maximum; i++)
        {
            int n = Integer.parseInt(reader.readLine());
            max = Math.max(max, n);
        }

        System.out.println(max);
    }
}
