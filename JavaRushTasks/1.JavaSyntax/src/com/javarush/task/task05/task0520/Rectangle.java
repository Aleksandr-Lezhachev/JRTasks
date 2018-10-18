package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/

public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int width) {
        this.width = width;
        this.height = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
        this.top = rectangle.top;
        this.left = rectangle.left;
    }

    public static void main(String[] args) {

    }
}
