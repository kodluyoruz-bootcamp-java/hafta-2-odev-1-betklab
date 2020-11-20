package com.factory;

public class Samsung extends CellPhone implements IKeyboard,IBattery, IScreen {
    public Samsung(String modelName, String imeiNumber, String versionNumber,double memoryCapacity,double screenSize){
        super(modelName,imeiNumber, versionNumber, memoryCapacity, screenSize);
    }
    public void docShare(String document,String phoneNumber){
        System.out.println(document + " dosyası " +phoneNumber + " numarasına gönderildi.");
    }
    public void  listenMP3(String music){
        System.out.println(music + " müziği dinleniyor.");
    }
    public void hasKeybord(){
        System.out.println( this.getModelName() + " tuşlu klavyeye sahiptir.");
    }

    @Override
    public void hasBattery() {
        System.out.println( this.getModelName() + " external bataryaya sahiptir");
    }

    @Override
    public void hasScreen() {
        System.out.println(this.getModelName() + " modeli AMOLED ekrana sahiptir.");

    }
}
