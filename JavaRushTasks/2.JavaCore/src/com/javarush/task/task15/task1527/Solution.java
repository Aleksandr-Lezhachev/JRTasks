package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<String> list = new ArrayList<String>();
        String param = null;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            int startI = 0;
            int lastI = 0;
            if (arr[i] == '?' || arr[i] == '&') {
                startI = i + 1;
                for (int j = i; j < arr.length - 1; j++) {
                    if (arr[j + 1] != '=' && arr[j + 1] != '&' ) {
                        lastI++;
                    } else {
                        break;
                    }
                }
                int k = s.lastIndexOf("lvl");
                System.out.println(k);
                param = s.substring(startI, startI+lastI);
                list.add(param);

            }
        }
        for(String str: list){
            System.out.print(str+" ");

        }

    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
