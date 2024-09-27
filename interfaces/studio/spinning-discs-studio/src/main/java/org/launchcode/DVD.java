package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    int rpm =1;

    public DVD(double capacity, String name, String discType, String contents) {
        super(capacity, name, discType, contents);


    }
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void capacity() {
        System.out.println("this has "+ capacity + " Mbyte on it");
    }

    @Override
    public void readData() {
        System.out.println("this is a "+ contents + " disc");
    }

    @Override
    public void storageType() {
        System.out.println("this is a " + discType);
    }


}
