package org.launchcode;

public class CD extends org.launchcode.BaseDisc {
    int tracks;

    public CD(String name, Double storageCapacity, String discType, int spinSpeed, int tracks) {
        super(name, storageCapacity, discType, spinSpeed);
        this.tracks = tracks;
    }


    @Override
    public void spinDisc() {
        System.out.println("Disc spinning");
    }

    @Override
    public String readDisc() {
        return "disc read";
    }

    @Override
    public void writeDisc() {
        System.out.println("Disc written");

    }

    @Override
    public void reportData() {
        System.out.println("name= " + getName());
        System.out.println("storageCapacity= "  + getStorageCapacity());
        System.out.println("disctype= " + getDiscType());
        System.out.println("spinSpeed= " + getSpinSpeed());

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
