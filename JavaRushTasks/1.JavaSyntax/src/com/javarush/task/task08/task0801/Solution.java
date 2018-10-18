package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet <String> str = new HashSet<>();
        str.add("арбуз");
        str.add("банан");
        str.add("вишня");
        str.add("груша");
        str.add("дыня");
        str.add("ежевика");
        str.add("жень-шень");
        str.add("земляника");
        str.add("ирис");
        str.add("картофель");
        Iterator iterator = str.iterator();
        while (iterator.hasNext()){
            String text = iterator.next().toString();
            System.out.println(text);
        }


    }
}
