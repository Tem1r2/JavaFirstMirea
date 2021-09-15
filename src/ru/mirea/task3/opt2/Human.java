package ru.mirea.task3.opt2;

public class Human {
    Head h;
    Hand ha;
    Leg l;

    public Human(Head h, Hand ha, Leg l) {
        this.h = h;
        this.ha = ha;
        this.l = l;
    }

    @Override
    public String toString() {
        return "Human{" +
                "h=" + h.toString() +
                ", ha=" + ha.toString() +
                ", l=" + l.toString() +
                '}';
    }
}
