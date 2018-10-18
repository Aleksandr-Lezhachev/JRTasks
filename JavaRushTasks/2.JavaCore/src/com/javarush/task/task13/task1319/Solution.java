package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()));

        while (true) {
            String data = reader.readLine();
            if (data.equals("exit")) {
                bufferedWriter.write(data +"\n");
                break;
            }
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        }
        reader.close();
        bufferedWriter.close();
    }
}
