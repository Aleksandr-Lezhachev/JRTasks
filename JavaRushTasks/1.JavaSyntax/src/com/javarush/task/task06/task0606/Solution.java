package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        int b = 0;
        String a = bufferedReader.readLine();
        char[] strToArray = a.toCharArray();
        for (int i = 0; i < strToArray.length; i++){
            b = Character.getNumericValue(strToArray[i]);
        if (b % 2 == 0)
            even++;
        else
            odd++;
         }
        System.out.println("Even: "+ even +  " Odd: " +odd);
    }
}
