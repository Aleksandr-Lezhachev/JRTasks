package com.javarush.task.task14.task1409;

/* 
Мосты
*/

import static com.javarush.task.task14.task1409.Solution.println;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

public static void println(Bridge bridge){
       System.out.println(bridge.getCarsCount());
}

}
