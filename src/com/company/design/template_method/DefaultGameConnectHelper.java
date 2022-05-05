package com.company.design.template_method;

public class DefaultGameConnectHelper extends AbstractGameConnectHelper {


    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/비밀번호 확인");
        return true;
    }

    @Override
    protected int authrization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("접속");
        return info;
    }
}