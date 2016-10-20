package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int n3 = Integer.parseInt(s3);

        if (n2 < n1) {
            if (n2 > n3) {
                System.out.println(n2);
            }
            else if (n1 > n3)
            {
                System.out.println(n3);
            }
            else
                System.out.println(n1);
        }
        else if (n1 > n3) {
            System.out.println(n1);
        }
        else if (n2 > n3) {
            System.out.println(n3);
        }
        else
            System.out.println(n2);

    }
}
