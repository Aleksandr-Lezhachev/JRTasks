package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int a = Integer.parseInt(buffer.readLine());
            if (max < a)
                max = a;
        }
        System.out.println(max);
    }
}