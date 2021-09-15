package ru.mirea.task4.opt2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(23,-2);
        b1.setXY(2,4);
        System.out.println(b1.toString());
        b2.move(2,3);
        b1.setX(3);
        b1.setY(-43);
        System.out.println(b1.getX());
        System.out.println(b1.getY());
        System.out.println(b2.toString());
    }
}
