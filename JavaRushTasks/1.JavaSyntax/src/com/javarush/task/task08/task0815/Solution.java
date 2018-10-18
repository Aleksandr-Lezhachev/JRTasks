package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name","surname1");
        map.put("name1","surname2");
        map.put("name2","surname3");
        map.put("name3","surname4");
        map.put("name4","surname5");
        map.put("name5","surname6");
        map.put("name6","surname7");
        map.put("name7","surname8");
        map.put("name8","surname9");
        map.put("name9","surname10");

        return  map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count=0;
        for(Map.Entry<String,String> pair : map.entrySet()){
            String nameCur = pair.getValue();
            if(name.equals(nameCur)){
                count++;
            }
        }
        return  count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count=0;
        for(Map.Entry<String,String> pair : map.entrySet()){
            String nameCur = pair.getKey();
            if(lastName.equals(nameCur)){
                count++;
            }
        }
        return  count;

    }

    public static void main(String[] args) {

    }
}
