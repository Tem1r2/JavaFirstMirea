package ru.mirea.task5.opt3;

public class Test {
    public static void main(String[] args) {
        Sofa s1 = new Sofa(300,"Кожа",300);
        Table t1 = new Table(199,"Дерево",65);
        s1.action();
        t1.action();
        FurnitureShop shop = new FurnitureShop(s1,t1,30,34);
        shop.sale(t1,4);
        System.out.println(shop.getNum_p2());
        shop.sale(s1,30);
        System.out.println(shop.getNum_p1());
        shop.setNum_p1(20);
        System.out.println(shop.getNum_p1());

    }
}
