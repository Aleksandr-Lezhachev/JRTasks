package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        Cat cat = null;
        for (int i = 0; i < 10; i++) {
            cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
           System.out.println(cats.get(i));
        }
    }
}