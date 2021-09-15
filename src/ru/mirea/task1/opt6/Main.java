package ru.mirea.task1.opt6;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random rndm = new Random();
        int [] A = new int[10];
        int [] B = new int[10];
        for (int i = 0; i < 10; i++){
            A[i] = (int)(Math.random() * 5005 + B[i]);
            B[i] = rndm.nextInt(5023 + A[i]);
        }
        int sumA = 0, sumB = 0;
        for (int i = 0; i < 10; i++){
            sumA += A[i];
            sumB += B[i];
        }
        System.out.println(sumA);
        System.out.println(sumB);
    }
}
