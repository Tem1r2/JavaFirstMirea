package ru.mirea.task2.opt5;

import ru.mirea.task2.opt4.Dog;

public class TestDog {
    Dog[] arr = new Dog[10];
    int iter = 0;

    public int getIter() {
        return iter;
    }

    public Dog[] getArr() {
        return arr;
    }

    public void addDog(){
        arr[iter] = new Dog("Mike " + iter, iter);
        iter++;
        arr[iter] = new Dog("Helen " + iter, iter+9);
        iter++;
    }
    public static void main(String[] args) {
        TestDog test = new TestDog();
        test.addDog();
        test.addDog();
        for (int i = 0; i < test.getIter(); i++){
            System.out.println(test.getArr()[i].toString());
        }

    }
}
