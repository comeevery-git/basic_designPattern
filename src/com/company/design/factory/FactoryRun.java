package com.company.design.factory;

/*
        팩토리 패턴 (Factory Pattern)
            조건에 의해 인스턴스를 생성해야할 경우, 객체 생성을 캡슐화하여 처리한다.
            객체 생성을 처리하는 클래스를 '팩토리(Factory)'라고 한다.
            복잡한 오브젝트들의 생성과정을 클라이언트가 다룰 필요가 없다.

            * Factory Method 패턴
                어떤 클래스의 인스턴스를 만들 지는 서브 클래스가 결정한다.
                > factory_method 패키지 참고

            * Abstract Factory 패턴
                인터페이스를 이용하여 서로 연관 된, 또는 의존하는 객체를
                구상 클래스를 지정하지 않고 생성할 수 있다.
                > abstract_factory 패키지 참고

 */
public class FactoryRun {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        animalFactory.createAnimalRun(Animal.CAT);
    }

}
