package com.company;

public class Main {

    public static void main(String[] args) {
            Student obj = new Student();
            new Thread( ()->{
                obj.printPoint();
            }).start();
            new Thread(()->{
                obj.printPoint();
            }).start();
    }
}
