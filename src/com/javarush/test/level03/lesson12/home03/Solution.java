package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader reader = new BufferedReader(isr);

        String n = reader.readLine();
        int in = Integer.parseInt(n);
        System.out.println("Я буду зарабатывать $" + in + " в час");
    }
}