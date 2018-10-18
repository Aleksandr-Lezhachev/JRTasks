package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String surname;
        private boolean sex;
        private int age;
        private int weight;
        private int height;

        public Human(String name, String surname, boolean sex, int age, int weight, int height) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, int age, int weight, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String surname, boolean sex, int age, int height) {
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String surname, boolean sex, int age) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String surname, boolean sex, int age, int height) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }

        public Human(String name, boolean sex, int age, int weight, int height) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}
