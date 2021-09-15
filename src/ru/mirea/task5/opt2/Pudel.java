package ru.mirea.task5.opt2;

public class Pudel extends Dog {
    int beautiful;

    public Pudel(String name, int age, int beautiful) {
        super(name, age);
        this.beautiful = beautiful;
    }

    public int getBeautiful() {
        return beautiful;
    }

    public void setBeautiful(int beautiful) {
        this.beautiful = beautiful;
    }
    public void info(){
        System.out.println("Pudell name is " + name + " age is " + age + " beautiful is " + beautiful);
    }
}
