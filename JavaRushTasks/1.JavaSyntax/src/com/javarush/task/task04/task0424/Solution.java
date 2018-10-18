package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        if(a==b && a!=c)
            System.out.println(3);
        if(a==c&& a!=b)
            System.out.println(2);
        if(b==c && b!=a)
            System.out.println(1);
    }
}
