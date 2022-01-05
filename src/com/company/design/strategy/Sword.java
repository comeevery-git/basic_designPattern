package com.company.design.strategy;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("검으로 공격하기!");
    }
}
