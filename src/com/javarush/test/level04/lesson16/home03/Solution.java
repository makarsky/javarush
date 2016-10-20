package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
-1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        int sum = 0;
        boolean exit = false;
        while (!exit) {
            String s = br.readLine();
            //if (s.equals("-1"))
            //    break; выход из цикла без учёта -1
            int number = Integer.parseInt(s);
            sum += number;
            exit = s.equals("-1");
        }
        System.out.println(sum);
    }
}
