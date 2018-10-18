package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> subList1 = new ArrayList<Integer>();
        ArrayList<Integer> subList2 = new ArrayList<Integer>();
        ArrayList<Integer> subList3 = new ArrayList<Integer>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        for (int i = 0; i < mainList.size(); i++) {
            if (!((mainList.get(i) % 3) == 0) && !(mainList.get(i) % 2 == 0)) {
                subList3.add(mainList.get(i));
                continue;
            }
            if (mainList.get(i) % 3 == 0) subList1.add(mainList.get(i));
            if (mainList.get(i) % 2 == 0) subList2.add(mainList.get(i));
        }
        printList(subList1);
        printList(subList2);
        printList(subList3);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
