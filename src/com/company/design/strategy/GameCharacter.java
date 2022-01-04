package com.company.design.strategy;

public class GameCharacter {

    // 접근점
    private Weapon weapon;

    // 교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // 델리게이트
    public void attack() {
        weapon.attack();
    }

}
