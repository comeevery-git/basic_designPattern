package com.company.design.facade;

/*
        퍼사드 패턴 (Facade Pattern)
            여러 서브 시스템을 간략하게 사용할 수 있게 해주는 패턴
            작업 수행의 복잡성은 숨기고 사용자들에게 간단한 인터페이스로 제공하는 패턴

            장점 - 클라이언트에게 간단한 접근경로를 제공하여 손쉽게 복잡한 내부의 기능을 이용하게 할 수 있음

            * facade
                외관, 건물의 정면
            * Adapter 패턴과의 차이점
                클라이언트가 원하는 출력을 리턴
                인터페이스가 서로 다른 객체들이 같은 형식 아래 동작할 수 있도록 함 (호환 불가능 한 인터페이스를 호환가능하도록 서포트)
 */
public class FacadeRun {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.run();
    }

}
