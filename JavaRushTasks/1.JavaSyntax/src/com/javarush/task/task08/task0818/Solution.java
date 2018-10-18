package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < 10; i++) {
            map.put("Богач" + i, 100 * i);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        map.entrySet().removeIf(stringIntegerEntry -> stringIntegerEntry.getValue() < 500);
    }

    public static void main(String[] args) {

    }
}