package ru.mirea.task1.opt3;

public class Main {
    public static void main(String[] args) {
        int [] A = {7,3,2,23,532,711,8,12,3,9,4};
        int s = 0;
        for(int i = 0; i < 10; i++)
            s+=A[i];
        System.out.println(s);
        s = 0;
        int i = 0;
        while(i < 10){
            s+=A[i];
            i++;
        }
        System.out.println(s);
        i = 0;
        s = 0;
        do {
            s+=A[i];
            i++;
        }while(i <=9);
        System.out.println(s);
    }
}
