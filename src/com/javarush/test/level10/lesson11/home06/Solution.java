package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String fname;
        int age;
        int height;
        int weight;
        String lname;
        int kids;

        public Human(String fname)
        {
            this.fname = fname;
        }
        public Human(String fname, String lname)
        {
            this.fname = fname;
            this.lname = lname;
        }
        public Human(String fname, String lname, int age)
        {
            this.fname = fname;
            this.lname = lname;
            this.age = age;
        }
        public Human(String fname, String lname, int age, int weight)
        {
            this.fname = fname;
            this.lname = lname;
            this.age = age;
            this.weight = weight;
        }
        public Human(String fname, String lname, int age, int weight, int height)
        {
            this.fname = fname;
            this.lname = lname;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        public Human(String fname, String lname, int age, int weight, int height, int kids)
        {
            this.fname = fname;
            this.lname = lname;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.kids = kids;
        }

        public Human(int age)
        {
            this.age = age;
        }
        public Human(String fname, int age)
        {
            this.fname = fname;
            this.age = age;
        }
        public Human(int age, int height)
        {
            this.age = age;
            this.height = height;
        }
        public Human(int age, int height, int weight)
        {
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

    }
}
