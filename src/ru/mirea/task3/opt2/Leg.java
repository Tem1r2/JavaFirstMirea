package ru.mirea.task3.opt2;

public class Leg {
    int len;
    String health;

    public Leg(int len, String health) {
        this.len = len;
        this.health = health;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "len=" + len +
                ", health='" + health + '\'' +
                '}';
    }
}
