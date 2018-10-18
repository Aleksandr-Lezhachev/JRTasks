package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE;
        int minN = 0, maxN = 0;
        ArrayList<String> list = new ArrayList<String>();
        Reader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        for (int i = 0; i < 10; i++) {
            list.add(bufferedReader.readLine());
        }
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).length()) {
                min = list.get(i).length();
                minN = i;
            }
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                maxN = i;
            }
        }
        if (maxN < minN) System.out.println(list.get(maxN));
        else System.out.println(list.get(minN));
    }
}
