package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> ar = new ArrayList<>();
        boolean cycle = true;

        while (cycle)
        {
            String s = reader.readLine();
            if (s.equals("end"))
            {
                cycle = false;
            }
            else
            {
                ar.add(s);
            }
        }

        for (String s : ar)
        {
            System.out.println(s);
        }
    }
}
