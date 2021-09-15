package ru.mirea.task5.opt2;

public class Alabay extends Dog {
    int power;
    public Alabay(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void info(){
        System.out.println("Alabay name is " + name + " age is " + age + " power is " + power);
    }
}
