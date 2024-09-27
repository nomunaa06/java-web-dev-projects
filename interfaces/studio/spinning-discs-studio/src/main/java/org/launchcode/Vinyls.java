package org.launchcode;

public class Vinyls extends BaseDisc implements OpticalDisc{

    public Vinyls(double capacity, String name, String discType, String contents) {
        super(capacity, name, discType, contents);
    }

    @Override
    public void spinDisc() {
        System.out.println(" A vinyl disk spins 33 rpm");
    }

    @Override
    public void capacity() {
        System.out.println("this has "+ capacity + " byte on it");
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
