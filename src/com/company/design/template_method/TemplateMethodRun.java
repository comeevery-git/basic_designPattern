package com.company.design.template_method;

/*
        템플릿 메서드 패턴 (Template Method Pattern)
            알고리즘의 구조를 메소드에 정의하고
            하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴

            - 기능구현을 하위 class 에게 맡김
            - 구현하려는 알고리즘이 일정한 프로세스가 있을 때
            - 구현하려는 알고리즘이 변경 가능성이 있을 때

            * 적용순서
                1. 알고리즘을 여러 단계로 나눈다.
                2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
                3. 알고리즘을 수행할 템플릿 메소드를 만든다.
                4. 하위 클래스에서 나눠진 메소드들을 구현한다.

*/
public class TemplateMethodRun {
    public static void main(String[] args) {
        AbstractGameConnectHelper helper = new DefaultGameConnectHelper();
        helper.requestConnection("아이디 암호 접속 정보!");
    }

}
