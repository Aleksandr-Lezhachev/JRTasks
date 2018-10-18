package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        int countCreatedThreads;

        GenerateThread() {
            this.countCreatedThreads++;
            super(countCreatedThreads.toString);
        }

        @Override
        public String toString() {
            return "GenerateThread{" +
                    "countCreatedThreads=" + countCreatedThreads +
                    '}';
        }
    }
}
