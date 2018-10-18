package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        int a=0;
        double sum=0;
        int count =0;
        while(a!=-1) {
            a = Integer.parseInt(bufferedReader.readLine());
            if (a != -1) {
                sum = sum + a;
                count++;
            }
            if (a == -1) {
                System.out.println(sum / count);
            }
        }
    }
}

