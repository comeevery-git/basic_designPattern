package com.company.design.facade;

public class Facade {
    public void run() {
        Any1 any1 = new Any1();
        Any2 any2 = new Any2();
        Any3 any3 = new Any3();
        any1.check();
        any2.check();
        any3.check();
        System.out.println("complete");
    }
}