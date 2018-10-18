package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // два дедушки, две бабушки, отец, мать, трое детей
        Human child1 = new Human("Ребенок1", 11, true);
        Human child2 = new Human("Ребенок2", 12, false);
        Human child3 = new Human("Ребенок3", 14, true);
        ArrayList<Human> childrens = new ArrayList<>();
        childrens.add(child1);
        childrens.add(child2);
        childrens.add(child3);
        Human father = new Human("Отец", 35, true, childrens);
        Human mather = new Human("Мать", 35, false, childrens);
        ArrayList<Human> childrens1 = new ArrayList<Human>();
        childrens1.add(father);
        ArrayList<Human> childrens2 = new ArrayList<Human>();
        childrens2.add(mather);
        Human grandFatherF = new Human("Отец Отеца", 35, true, childrens1);
        Human grandMatherF = new Human("Мать Отца", 35, false, childrens1);
        Human grandFatherM = new Human("Отец Матери", 35, true, childrens2);
        Human grandMatherM = new Human("Мать Матери", 35, false, childrens2);
        ArrayList<Human> all = new ArrayList<Human>();
        all.add(grandFatherF);
        all.add(grandMatherF);
        all.add(grandFatherM);
        all.add(grandMatherM);
        all.addAll(childrens1);
        all.addAll(childrens2);
        all.addAll(childrens);
        for(Human h:all){
            System.out.println(h.toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, int age, boolean sex, ArrayList<Human> humans) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = humans;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
