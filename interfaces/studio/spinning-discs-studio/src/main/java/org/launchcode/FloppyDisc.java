package org.launchcode;

public class FloppyDisc extends BaseDisc implements OpticalDisc {
    public FloppyDisc(double capacity, String name, String discType, String contents) {
        super(capacity, name, discType, contents);
    }

    @Override
    public void capacity() {
        System.out.println("this has "+ capacity + " kbyte on it");
    }

    @Override
    public void readData() {
        System.out.println("this is a "+ contents + " disc");
    }

    @Override
    public void storageType() {
        System.out.println("this is a " + discType);
    }

    @Override
    public void spinDisc() {
        System.out.println(" A floppy disk spins 300 rpm");
    }
}
