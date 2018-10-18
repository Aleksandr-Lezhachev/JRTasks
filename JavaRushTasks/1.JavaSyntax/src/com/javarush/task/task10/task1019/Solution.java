package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            String s = reader.readLine();
            if (s == null || s.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(s);
            String name = reader.readLine();
            if (name == null|| s.isEmpty()) {
                break;
            }

            map.put(name, id);
        }
        for (HashMap.Entry<String, Integer> pair : map.entrySet()) {
            String s = pair.getKey();
            int v = pair.getValue();
            System.out.println(v + " " + s);
        }
    }
}
