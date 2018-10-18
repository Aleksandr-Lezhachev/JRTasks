package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (int k = 0; k < abcArray.length; k++) {
            int count = 0;
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    if (abcArray[k] == s.charAt(i)) count++;
                }
            }
            System.out.println(abcArray[k] + " "+ count);
        }

/* на основе мап - результат верный, проверку не проходит

        HashMap<Character, Integer> mapChar = new HashMap<>();
        for (char anAbcArray : abcArray) {
            mapChar.put(anAbcArray, 0);
        }
        for (String s : list) {
            for (int i = 0; i < s.length(); i++) {
                if (mapChar.keySet().contains(s.charAt(i))) mapChar.put(s.charAt(i), mapChar.get(s.charAt(i)) + 1);
            }
        }

        for (HashMap.Entry<Character, Integer> map : mapChar.entrySet()) {
            char ch = map.getKey();
            int val = map.getValue();
            System.out.println(ch + " " + val);
        }
        */
        }

    }
