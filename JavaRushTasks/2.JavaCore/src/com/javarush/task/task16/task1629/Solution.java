package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t1.printResult();
        t2.printResult();

    }


    public static class Read3Strings extends Thread {
        private final List<String> arrayList = new ArrayList<String>();

        public void run() {
            int count = 0;
            //while (!isInterrupted()) {
                try {
                    while (count < 3) {
                            arrayList.add(reader.readLine());
                            count++;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        public void printResult() {
            for (String str : arrayList) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}

