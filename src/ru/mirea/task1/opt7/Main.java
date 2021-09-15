package ru.mirea.task1.opt7;
import java.util.Scanner;

public class Main {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = s.nextInt();
        if (n < 0) {
            System.out.println("Вы ввели недопустимое число");
            System.out.println("Попробуйте снова");}
        else
        {
            System.out.print(+n+"!=");
            System.out.println(calculateFactorial(n));
        }
    }
}
