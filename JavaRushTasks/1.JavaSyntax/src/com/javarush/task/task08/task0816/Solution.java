package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static int count = 0;

    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("MARCH 1 1980"));
        map.put("Stallone2", df.parse("APRIL 1 1980"));
        map.put("Stallone3", df.parse("JUNE 1 1980"));
        map.put("Stallone4", df.parse("JUNE 1 1980"));
        map.put("Stallone5", df.parse("JUNE 1 1980"));
        map.put("Stallone6", df.parse("AUGUST 1 1980"));
        map.put("Stallone7", df.parse("JUNE 1 1980"));
        map.put("Stallone8", df.parse("DECEMBER 1 1980"));
        map.put("Stallone9", df.parse("JULY 1 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) throws ParseException {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String pair = it.next().getValue().toString();
            if (pair.contains("Jun") || pair.contains("Jul") || pair.contains("Aug")) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException {

    }
}
