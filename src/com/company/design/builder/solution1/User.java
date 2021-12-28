package com.company.design.builder.solution1;

/*
    빌더 패턴 (Builder Pattern)
        1) 생성자로 생성할 때
            단점 - 생성자가 길어짐
                - 생성하려는 변수의 의미를 알 수 없음
                - 작성하기도 어렵고, 읽기도 어렵다
 */
public class User {
    private String name;
    private int age;
    private int height;
    private int iq;

   public User(String name, int age, int height, int iq) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.iq = iq;
    }

    // run
    public static void main(String[] args) {
        User user = new User("강수희",20,210,0);
    }

}
