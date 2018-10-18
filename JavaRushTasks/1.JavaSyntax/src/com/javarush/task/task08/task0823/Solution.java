package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        list.add(reader.readLine());
        Iterator it = list.iterator();
        String s = it.next().toString();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if ((i == 0 && ch[i] != ' ') || ch[i] != ' ' && ch[i - 1] == ' ') {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        it.remove();
        String myStr = new String(ch);
        list.add(0, myStr);
        for (String str : list)
            System.out.println(str);


    }
}
