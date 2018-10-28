package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream stream = new FileInputStream(bufferedReader.readLine());
        while(stream.available()>0){
            System.out.println(Integer.parseInt(String.valueOf(stream.read())));
        }
    }
}
