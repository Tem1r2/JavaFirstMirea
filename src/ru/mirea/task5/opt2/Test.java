package ru.mirea.task5.opt2;

public class Test {
    public static void main(String[] args) {
        Alabay b1 = new Alabay("Bob", 4, 10);
        Pudel b2 = new Pudel("Pavel", 5, 100);
        b2.info();
        b1.info();
        b2.setAge(14);
        b2.setBeautiful(70);
        b2.info();
    }
}
