package com.company;

public class Main {

    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller("Добро пожаловать", target);
        Caller ob2 = new Caller("в синхронизированный", target);
        Caller ob3 = new Caller("мир!", target);

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
