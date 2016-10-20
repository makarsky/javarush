package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число,
иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 31 1970"));
    }

    public static boolean isDateOdd(String date)
    {
        Date start = new Date(date);
        start.setHours(0);
        start.setDate(1);
        start.setMinutes(0);
        start.setSeconds(0);
        start.setMonth(0);
        Date d = new Date(date);
        long result = d.getTime() - start.getTime();
        long day = 1000 * 60 * 60 * 24;
        result = result / day;
        if (result % 2 == 0)
        {
            return true;
        }
        return false;
    }
}