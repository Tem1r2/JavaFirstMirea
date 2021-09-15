package ru.mirea.task2.opt3;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("The Green Mile", 50);
        b1.inKilograms();
        b1.setValue(60);
        b1.inKilograms();
    }
}
