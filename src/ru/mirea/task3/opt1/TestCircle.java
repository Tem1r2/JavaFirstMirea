package ru.mirea.task3.opt1;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,-2,2);
        c1.setRadius(10);
        c1.setX(-5);
        c1.setY(-1);
        System.out.println(c1.getX());
        System.out.println(c1.getY());
        System.out.println(c1.getRadius());
    }
}
