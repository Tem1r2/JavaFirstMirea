package ru.mirea.task3.opt2;

public class Hand {
    String health;
    String color;

    public Hand(String health, String color) {
        this.health = health;
        this.color = color;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "health='" + health + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
