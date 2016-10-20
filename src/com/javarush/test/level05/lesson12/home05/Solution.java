package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0;
        boolean exit = false;
        while (!exit) {
            String s = br.readLine();
            if (s.equals("сумма"))
                break;
            int number = Integer.parseInt(s);
            sum += number;
        }
        System.out.println(sum);
    }
}
