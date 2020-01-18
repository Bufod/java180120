package com.company;

public class Callme {
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }

    void info(){
        System.out.println("info Callme");
    }
}
