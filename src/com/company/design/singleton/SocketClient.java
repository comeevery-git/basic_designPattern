package com.company.design.singleton;

/*
    소켓 통신 예제
 */
public class SocketClient {
    private SocketClient(){
    }
    // Eager initialization
//    private static final SocketClient INSTANCE = new SocketClient();
//    public static SocketClient getInstance(){
//        return INSTANCE;
//    }

    // Lazy initialization

    // Static block initialization

    // Double-Checked Locking

    // Bill Pugh Solution

    // static inner class 사용
    public static class SettingHolder {
        private static SocketClient INSTANCE = new SocketClient();
    }

    public static SocketClient getInstance(){
        return SettingHolder.INSTANCE;
    }

}
