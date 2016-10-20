package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human();
        Human child2 = new Human();
        Human child3 = new Human();
        child1.name = "child1";
        child2.name = "child2";
        child3.name = "child3";
        Human mother = new Human();
        mother.name = "mother";
        mother.age = 30;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);
        Human father = new Human();
        father.sex = true;
        father.age = 35;
        father.name = "father";
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        Human gm1 = new Human();
        gm1.age = 60;
        gm1.name = "gm1";
        gm1.children.add(mother);
        Human gm = new Human();
        gm.age = 60;
        gm.name = "gm";
        gm.children.add(father);
        Human gf = new Human();
        gf.age = 65;
        gf.sex = true;
        gf.name = "gf";
        gf.children.add(father);
        Human gf1 = new Human();
        gf1.age = 65;
        gf1.sex = true;
        gf1.name = "gf1";
        gf1.children.add(mother);
        System.out.println(gf);
        System.out.println(gf1);
        System.out.println(gm);
        System.out.println(gm1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        boolean sex = false;
        int age = 1;
        ArrayList<Human> children = new ArrayList<>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }
}
