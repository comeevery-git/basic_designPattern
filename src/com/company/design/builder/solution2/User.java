package com.company.design.builder.solution2;

/*
    빌더 패턴 (Builder Pattern)
        2) 비어있는 생성자로 생성할 때 (자바빈)
            장점 - setter로 필요한 필드만 세팅할 수 있다 (세팅하는 필드의 명확성)
            단점 - 코드가 장황하고, 최종적인 인스턴스를 만들기까지 여러번의 호출을 거쳐야 하기 때문에
                    자바빈이 중간에 사용되는 경우 안정적이지 않은 상태로 사용 될 여지가 있다
                    (모든 필드를 세팅하지 않고 사용할 경우)
                - setter, getter로 인해 불변 클래스로 생성할 수 없다
                - Thread safe하게 만들려면 추가적인 작업이 필요하다 (멀티 스레드 환경에서 Locking 필요)
 */
public class User {
    private String name;
    private int age;
    private int height;
    private int iq;

    public User() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    // run
    public static void main(String[] args) {
        User user = new User();
        user.setName("강수희");
        user.setAge(20);
    }

}
