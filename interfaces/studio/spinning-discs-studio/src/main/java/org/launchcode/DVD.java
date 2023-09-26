package org.launchcode;

public class DVD extends org.launchcode.BaseDisc {



    public DVD(String name, Double storageCapacity, String discType, int spinSpeed) {
        super(name, storageCapacity, discType, spinSpeed);
        this.studio = studio;
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public String readDisc() {
        return null;
    }

    @Override
    public void writeDisc() {

    }

    @Override
    public void reportData() {

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
