package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human human1 = new Human("Человек1", true, 25);
        Human human2 = new Human("Человек2", true, 25);
        Human human3 = new Human("Человек3", true, 25);
        Human human4 = new Human("Человек4", true, 25);
        Human human5 = new Human("Человек4", true, 25, human1, human2);
        Human human6 = new Human("Человек4", true, 25, human1, human3);
        Human human7 = new Human("Человек4", true, 25, human1, human4);
        Human human8 = new Human("Человек4", true, 25, human2, human3);
        Human human9 = new Human("Человек4", true, 25, human2, human4);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());



    }

    public static class Human {
       String name;
       boolean sex;
       int age;
       Human father;
       Human mother;

       public Human(String name, boolean sex, int age){
         this.name = name;
         this.sex = sex;
         this.age = age;
       }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















