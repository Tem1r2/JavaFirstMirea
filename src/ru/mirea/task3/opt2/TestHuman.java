package ru.mirea.task3.opt2;

public class TestHuman {
    public static void main(String[] args) {
        Human h = new Human(new Head(20,"norm"),
                new Hand("norm", "white"),new Leg(50,"pain"));
        System.out.println(h.toString());
    }
}
