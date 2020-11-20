package com.factory;

public class Main {

    public static void main(String[] args) {
        Apple iPhone11 = new Apple("Iphone 11 pro",
                                    "12345668",
                                    "1.1",
                                    1024 * 64,
                                    6.4);
        Samsung e256 = new Samsung("e-256",
                                    "4789280",
                                    "1.2",
                                    256,
                                    1.3);

        iPhone11.turnOn();
        iPhone11.call("41789742");
        iPhone11.screenShare("73829992");
        iPhone11.faceTime("256987676");
        iPhone11.turnOff();

        System.out.println("------------------------------------------------");



        e256.turnOn();
        e256.call("5672385823");
        e256.listenMP3("Living On A Prayer.mp3");
        e256.docShare("Photo","463827567");
        e256.turnOff();




    }
}
