package com.company.design.strategy;

public class Knife implements Weapon {

    @Override
    public void attack() {
        System.out.println("칼로 공격하기!");
    }
}
