package com.company.design.factory_method;

public class AnimalFactory {

    public Object createAnimalRun(Animal animal) {
        System.out.println("animal factory in factory_method...");
        switch (animal) {
            case CAT:
                CatFactory catFactory = new CatFactory();
                catFactory.haveCat(new Cat());
                return catFactory;
            case DOG:
                DogFactory dogFactory = new DogFactory();
                dogFactory.makeWings(new Dog());
                return dogFactory;
        }
        return new ClassNotFoundException();
    }

}