package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> list = new ArrayList<String>();
        list.add("user");
        list.add("loser");
        list.add("coder");
        list.add("proger");

       while (true) {
            key = reader.readLine().toLowerCase();
            if (!(list.contains(key))) {
                break;
            }
            if (key.equals(list.get(0))) {
                person = new Person.User();
                doWork(person);
            }
            if (key.equals(list.get(1))) {
                person = new Person.Loser();
                doWork(person);
            }
            if (key.equals(list.get(2))) {
                person = new Person.Coder();
                doWork(person);
            }
            if (key.equals(list.get(3))) {
                person = new Person.Proger();
                doWork(person);
            }

        }
    }

    public static void doWork(Person person) {
        if(person instanceof Person.User){((Person.User) person).live();}
        if(person instanceof Person.Loser){((Person.Loser) person).doNothing();}
        if(person instanceof Person.Coder){((Person.Coder) person).coding();}
        if(person instanceof Person.Proger){((Person.Proger) person).enjoy();}
    }
}
