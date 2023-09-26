package org.launchcode;

public abstract class BaseDisc implements org.launchcode.OpticalDisc {

    private String name;

    private Double storageCapacity;

    private String discType;

    private int spinSpeed;


    public BaseDisc(String name, Double storageCapacity, String discType, int spinSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.spinSpeed = spinSpeed;
    }
//Getters
    public String getName() {
        return name;
    }

    public Double getStorageCapacity() {
        return storageCapacity;
    }

    public String getDiscType() {
        return discType;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }
////Setters not needed in this instance
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStorageCapacity(Double storageCapacity) {
//        this.storageCapacity = storageCapacity;
//    }
//
//    public void setDiscType(String discType) {
//        this.discType = discType;
//    }
//
//    public void setSpinSpeed(int spinSpeed) {
//        this.spinSpeed = spinSpeed;
//    }
}
