package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("surname1", "name1");
        map.put("surname2", "name1");
        map.put("surname3", "name2");
        map.put("surname4", "name2");
        map.put("surname5", "name1");
        map.put("surname6", "name3");
        map.put("surname7", "name1");
        map.put("surname8", "name3");
        map.put("surname9", "name1");
        map.put("surname10", "name4");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> it : copy.entrySet()) {
            String text = it.getValue();
            if (Collections.frequency(map.values(), text) > 1) {
                removeItemFromMapByValue(map, text);
            }
/*Вторая реализация ( тоже работает) но не проходит валидатор
            for (Map.Entry<String, String> i : copy.entrySet()) {
                if (text.equals(i.getValue())) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, text);
                count = 0;
        }*/
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
