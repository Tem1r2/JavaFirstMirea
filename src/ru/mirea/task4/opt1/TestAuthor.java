package ru.mirea.task4.opt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Oleg", "oleg232@mail.ru", 'm');
        System.out.println(a1.toString());
        System.out.println(a1.getEmail());
        a1.setEmail("oleg2_232@mail.ru");
        System.out.println(a1.getEmail());
    }
}
