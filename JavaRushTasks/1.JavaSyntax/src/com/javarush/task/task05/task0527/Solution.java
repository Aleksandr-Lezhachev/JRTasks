package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 12, "Hammer");
        Dog jeffDog = new Dog("Jeff", 12, 11);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        String weapon;

        public Cat(String name, int height, String weapon) {
            this.name = name;
            this.height = height;
            this.weapon = weapon;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tooth;

        public Dog(String name, int height, int tooth) {
            this.name = name;
            this.height = height;
            this.tooth = tooth;
        }
    }

    //напишите тут ваш код
}
