package ru.mirea.task5.opt1;

public class Test {
    public static void main(String[] args) {
        Cup cup = new Cup("Фарфор", 200,220);
        cup.action();
        Plate plate = new Plate("Глина", 99, "Средняя");
        plate.action();
    }
}
