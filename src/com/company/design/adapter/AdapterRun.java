package com.company.design.adapter;

/*
        어댑터 패턴 (Adapter Pattern)
            호환성이 없는 인터페이스 때문에 함께 동작할 수 없는 클래스들이 함께 동작할 수 있도록 하는 패턴
            1. 클래스 어댑터 패턴
                상속을 위한 어댑터 패턴
            2. 인스턴스 어댑터 패턴
                위임을 위한 어댑터 패턴

            * adapter
                기계, 기구 등을 다목적으로 사용하기 위한 부가 기구
 */
public class AdapterRun {

    public static void main(String[] args) {
        // hairDryer 는 110V
        HairDryer hairDryer = new HairDryer();
        mainConnect(hairDryer);

        // cleaner 는 220V 인터페이스이기 때문에 error
        Cleaner cleaner = new Cleaner();
        // mainConnect(cleaner);
        // adapter 에서 220V connect 실행
        SocketAdapter socketAdapter = new SocketAdapter(cleaner);
        mainConnect(socketAdapter);

    }

    // 110V
    public static void mainConnect(E110V e110V) {
        e110V.powerOn();
    }

}
