package com.company.design.builder.solution3;

/*
    빌더 패턴 (Builder Pattern)
        3) Builder
            빌더는 만들려는 객체를 바로 만들지 않고, 클라이언트는 빌더에 필수적인 매개변수를 주면서 호출하여
            빌더 객체를 얻은 다음, 빌더 객체가 주는 setter 와 비슷한 메서드를 사용해서 부가적인 필드를 채워넣고
            추가적으로 build라는 메서드를 호출하여 객체를 생성합니다.

            빌더에서 매개변수를 객체로 복사해온 다음 확인하고 검증에 실패하면
            IllegalArgumentException을 던지고 에러 메세지로 어떤 매개변수가 잘못 되었는 지 알려준다

            장점 - 필요한 데이터만 세팅할 수 있음
                - 가독성을 높일 수 있음
                - 불변성을 확보할 수 있음 (etc - Immutability 참고)

 */
// lombok @Builder
public class User {
    private String name;
    private int age;
    private int height;
    private int iq;

    // run
    public static void main(String[] args) {
        User user = new User.builder()
                .name("강수희")
                .age(20)
                .build();

    }

}
