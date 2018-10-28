package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        Double weghtMoon;
        weghtMoon=weightEarth/9.8*1.666;
        return Math.round(weghtMoon *100.0)/100.0;
    }
}