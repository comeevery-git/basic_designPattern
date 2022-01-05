package com.company.design.strategy;


/*
        스트레티지 패턴 (Strategy Pattern, 전략 패턴)
            여러가지 알고리즘을 하나의 추상적인 접근점(인터페이스)을 만들어, 접근점에서 서로 교환이 가능하도록 한 패턴
            = 여러 알고리즘을 클래스 별로 캡슐화해두고 필요할 때 교체하여 사용

            인터페이스 :
                기능의 선언과 기능의 구현을 분리, 어떤 기능을 호출하는 통로
            델리게이트 (Delegate, 위임) :
                특정 객체의 기능을 사용하기 위해, 다른 객체의 기능을 호출하는 것

            장점 - 알고리즘마다 사용되는 중복 코드를 제거할 수 있음
                - 확장성이 용이함(목적이 같지만 기능이 다른 알고리즘을 추가하기 용이함)

            * Template Method Pattern 과의 차이점
                템플릿 메소드 패턴은 공통된 메소드를 통해서 코드의 중복없이 사용하는 것이고
                전략 패턴은 상황에 맞는 필요한 전략을 선택하기 위해 사용하는 패턴이다.
            * Decorator Pattern 과의 차이점
                전략 패턴은 코드 내부의 알고리즘을 변화시키고
                데코레이터 패턴은 코드 외부의 리턴 값을 변화시킨다는 점에서 차이가 있다.

 */
public class StrategyRun {
    public static void main(String args[]) {
        GameCharacter character = new GameCharacter();

        Weapon weapon = null;
        if(weapon == null) {
            System.out.println("맨손으로 공격하기!");
        } else {
            character.setWeapon(weapon);
            character.attack();
        }

        // 칼 장착
        weapon = new Knife();
        character.setWeapon(weapon);
        character.attack();
    }
}
