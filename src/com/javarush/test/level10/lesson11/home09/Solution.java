//ПОПРОБОВАТЬ РЕШИТЬ С ПОМОЩЬЮ map.entrySet()
package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        ArrayList<Integer> found = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            int num = 1;

            if (found.contains(i))
            {
                continue;
            }

            for (int j = i + 1; j < list.size(); j++)
            {
                if (found.contains(j))
                {
                    continue;
                }
                if (list.get(i).equals(list.get(j)))
                {
                    found.add(j);
                    num++;
                }
            }
            result.put(list.get(i), num);
        }

        return result;
    }
}
