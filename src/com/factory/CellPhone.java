package com.factory;

import javafx.scene.control.Cell;

public abstract class CellPhone {
    private  String modelName;
    private String imeiNumber;
    private String versionNumber;
    private double memoryCapacity;
    private double screenSize;

    public CellPhone(String modelName, String imeiNumber, String versionNumber, double memoryCapacity,double screenSize){
        this.modelName = modelName;
        this.imeiNumber = imeiNumber;
        this.versionNumber = versionNumber;
        this.memoryCapacity = memoryCapacity;
        this.screenSize = screenSize;
    }
    public String getModelName() {
        return modelName;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public double getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(double memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void turnOn(){
        System.out.println( this.getModelName() + " açıldı.");
    }
    public void turnOff(){
        System.out.println(this.getModelName() + " kapandı.");
    }
    public void call(String phoneNumber){
        System.out.println( phoneNumber + " aranıyor");
    }
    public void sendSms(String phoneNumber, String text){
        System.out.println(phoneNumber + " numarasina " + text + "mesaji gonderildi." );
    }
}
