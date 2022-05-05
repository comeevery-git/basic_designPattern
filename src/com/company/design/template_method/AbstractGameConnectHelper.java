package com.company.design.template_method;

public abstract class AbstractGameConnectHelper {

    // 하위 class 에서 구현하는 abstract 메서드들
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authrization(String userName);
    protected abstract String connection(String info);


    // template method
    // final 키워드로 하위 클래스에서 재정의 금지시켜두면 더 좋음
    public final String requestConnection(String encodeInfo) {
        // 요구사항 1. 보안과정 -> 암호화 된 문자열을 복호화
        String decodeInfo = doSecurity(encodeInfo);

        // 요구사항 2. 인증과정 -> 반환된 값을 통해 아이디, 암호를 할당
        String id = "aaa";
        String password = "bbb";
        if(!authentication(id, password)) {
            throw new Error("아이디 암호 불일치");
        }

        // 요구사항 3. 인가과정 -> 권한 확인
        String userName = "userName";
        int i = authrization(userName);

        // 요구사항 4. 연결
        switch (i) {
            case 0:
                System.out.println("게임 매니저");
                break;
            case 1:
                System.out.println("유료 회원");
                break;
            case 2:
                System.out.println("무료 회원");
                break;
            case 3:
                System.out.println("권한없음");
                break;
            default:
                System.out.println("기타");
                break;
        }

        return connection(decodeInfo);
    }


}
