package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<Integer> byteList = new HashSet<>();
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        while (fileInputStream.available() > 0) {
            byteList.add(fileInputStream.read());
        }
        fileInputStream.close();
        ArrayList<Integer> sortedList = new ArrayList<>(byteList);
        Collections.sort(sortedList);
        for (Integer bt : sortedList) {
            System.out.print(bt + " ");
        }
    }
}
