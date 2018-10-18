package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 1, maxcount = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).toString().equals((list.get(i + 1).toString()))) {
                count++;
                if (count > maxcount) {
                    maxcount = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(maxcount);
    }

}

