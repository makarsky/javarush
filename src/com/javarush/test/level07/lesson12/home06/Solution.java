package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandf1 = new Human();
        grandf1.name = "grandf1";
        grandf1.sex = true;
        grandf1.age = 55;
        Human grandf2 = new Human();
        grandf2.name = "grandf2";
        grandf2.sex = true;
        grandf2.age = 53;
        Human grandm1 = new Human();
        grandm1.name = "grandm1";
        grandm1.sex = false;
        grandm1.age = 50;
        Human grandm2 = new Human();
        grandm2.name = "grandm2";
        grandm2.sex = false;
        grandm2.age = 50;
        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 27;
        father.father = grandf1;
        father.mother = grandm1;
        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 26;
        mother.father = grandf2;
        mother.mother = grandm2;
        Human child1 = new Human();
        child1.name = "child1";
        child1.age = 1;
        child1.father = father;
        Human child2 = new Human();
        child2.name = "child2";
        child2.age = 2;
        child2.father = father;
        Human child3 = new Human();
        child3.name = "child3";
        child3.age = 3;
        child3.father = father;
        System.out.println(grandf1.toString());
        System.out.println(grandf2.toString());
        System.out.println(grandm1);
        System.out.println(grandm2);
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
