package ru.mirea.task3.opt2;

public class Head {
    int size;
    String health;

    public Head(int size, String health) {
        this.size = size;
        this.health = health;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Head{" +
                "size=" + size +
                ", health='" + health + '\'' +
                '}';
    }
}
