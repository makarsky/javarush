package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        /*ArrayList<String> month = new ArrayList<>(); // мой вариант
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ind = month.indexOf(s);
        System.out.println(month.get(ind) + " is " + (ind + 1) + " month");*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String month = br.readLine();
        SimpleDateFormat df = new SimpleDateFormat("MMM", Locale.US);
        Calendar cal = Calendar.getInstance();
        try
        {
            cal.setTime(df.parse(month));
            System.out.println(month+ " is " + (cal.get(Calendar.MONTH)+1) + " month");
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
