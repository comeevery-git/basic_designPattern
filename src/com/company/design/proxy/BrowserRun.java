package com.company.design.proxy;

import java.util.concurrent.atomic.AtomicLong;

/*
        프록시 패턴 (Proxy Pattern)
            클라이언트가 특정 객체를 직접 쓰지 않고 프록시라는 대리인을 거쳐서 사용함
            객체에 대한 접근을 제어하거나 기능을 추가할 수 있는 패턴

            장점 - 기존 코드를 변경하지 않고 새로운 코드를 추가할 수 있음
                    기존 클래스에서의 로직은 건들지 않고 프록시 객체에서 처리
                - 기능 추가 및 초기화 지연,  접근 제어, 로깅 캐싱 등으로 다양하게 활용할 수 있음

 */
public class BrowserRun {

    public static void main(String[] args) {
        // default
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        // cache 활용하기
//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        // 동시성 문제로 Atomic 활용
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        // AOP 활용하기
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );
        // 1.5s
        aopBrowser.show();
        System.out.println("loading time : " +end.get());

        // 0s
        aopBrowser.show();
        System.out.println("loading time : " +end.get());

    }
}
