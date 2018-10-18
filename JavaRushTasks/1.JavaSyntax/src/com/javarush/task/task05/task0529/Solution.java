package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        String a="1";
        int sum=0;
        while(a!="сумма"){
            a = bufferedReader.readLine();
            if(a.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            if(!(a.equals("сумма"))) {
                sum += Integer.parseInt(a);
            }
        }
    }
}
