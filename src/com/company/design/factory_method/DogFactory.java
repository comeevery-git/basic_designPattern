package com.company.design.factory_method;

public class DogFactory extends AnimalFactory {

    public Dog makeWings(Dog dog) {
        System.out.println("dog.makeWings!");
        return dog;
    }

}