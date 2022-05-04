package com.company.design.factory;

public class AnimalFactory {

    public Object createAnimalRun(Animal animal) {
        System.out.println("animal factory...");
        switch (animal) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
        }
        return new ClassNotFoundException();
    }

}