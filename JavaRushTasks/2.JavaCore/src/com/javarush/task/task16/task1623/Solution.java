package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

/**
 * работает но валидатор не проходит
 */
public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {

        GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
            start();
        }

        @Override
        public void run() {
            if (countCreatedThreads <= count) {
                GenerateThread t = new GenerateThread();
                System.out.println(t.toString());
            }
        }

        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
