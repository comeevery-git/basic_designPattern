package com.company.design.factory_method;

public class CatFactory extends AnimalFactory {

    public Cat haveCat(Cat cat) {
        System.out.println("cat gotcha!");
        return cat;
    }

}