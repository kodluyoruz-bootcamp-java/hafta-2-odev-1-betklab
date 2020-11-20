package com.factory;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class Apple extends CellPhone implements IKeyboard,IBattery, IScreen {
    //OEM parçalarını implement eder.
    public Apple(String modelName, String imeiNumber, String versionNumber, double memoryCapacity, double screenSize){
        super(modelName,imeiNumber,versionNumber,memoryCapacity,screenSize);
    }
    public void faceTime(String phoneNumber){
        System.out.println( phoneNumber + " numarası görüntülü aranıyor. ");
    }
    public void screenShare(String phoneNumber){
        System.out.println(phoneNumber + " numarası ile ekran paylaşılıyor.");
    }

    @Override
    public void hasKeybord(){
        System.out.println(this.getModelName() + " dokunmatik klavyeye sahiptir.");
    }

    @Override
    public void hasBattery() {
        System.out.println(this.getModelName() + " gomulu bataryaya sahiptir");
    }

    @Override
    public void hasScreen() {
        System.out.println(this.getModelName() + " Retina ekrana sahiptir.");

    }
}
