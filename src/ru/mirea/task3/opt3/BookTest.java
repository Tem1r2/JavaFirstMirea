package ru.mirea.task3.opt3;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Пушкин А. А.", 1798, "Капитанская дочка");
        System.out.println(b1.toString());
        b1.setYear(1785);
        b1.setAuthor("Маркиз де Сад");
        b1.setName("120 дней Содома");
        System.out.println(b1.toString());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getName());
        System.out.println(b1.getYear());
    }
}
