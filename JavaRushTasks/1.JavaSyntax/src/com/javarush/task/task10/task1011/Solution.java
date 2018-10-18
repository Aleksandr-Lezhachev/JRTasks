package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char [] arr= s.toCharArray();
        for(int i =1; i<41; i++) {
            String k = new String (arr);
            System.out.println(k);
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length - i] = ' ';


        }

    }

}

