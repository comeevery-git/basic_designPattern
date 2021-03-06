package com.company.design.singleton;

public class SingletonRun {

    public static void main(String[] args) {
        // singleton pattern
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();
        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        System.out.println("두 개의 객체가 동일한가 ?");
        System.out.println(aClient.equals(bClient));

    }
}
