package com.company.design.adapter;

public class HairDryer implements E110V {

    @Override
    public void powerOn() {
        System.out.println("헤어드라이기 110V ON");
    }
}
