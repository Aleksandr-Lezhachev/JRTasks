package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date m=new Date();
        SimpleDateFormat r = new SimpleDateFormat("dd MM yyyy");
        System.out.println(r.format(m));
    }
}
