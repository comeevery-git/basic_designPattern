package com.company.design.factory_method;

/*
        팩토리 메서드 패턴 (Factory Method Pattern)
            팩토리에 요청만 하면 원하는 오브젝트를 받을 수 있다.
            팩토리에 기능을 추가하고 싶거나 상태가 알고싶을 때 간단한 팩토리로는 추가 기능을 구현하기 어렵다.
            팩토리 메서드 패턴으로 이를 수행할 수 있다.

            각각 다른 기능이 있는 팩토리에서 생성하면 된다.
 */
public class FactoryMethodRun {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        animalFactory.createAnimalRun(Animal.CAT);
    }

}
