package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD myCD = new CD(800, "cd", "laser", "cool music");
        myCD.spinDisc();

        DVD myDVD = new DVD(3000, "dvd","HD", "movie");
        myDVD.spinDisc();

        myCD.capacity();
        myDVD.capacity();

        myCD.readData();
        myDVD.readData();

        myCD.storageType();
        myDVD.storageType();

        FloppyDisc myFloppy = new FloppyDisc(4, "floppy", "floppy" ,"text games");
                myFloppy.spinDisc();
                myFloppy.capacity();
                myFloppy.readData();
                myFloppy.storageType();

        Vinyls myVinyl = new Vinyls(2, "vynel", "vynel", "audio music");
        myVinyl.spinDisc();
        myVinyl.capacity();
        myVinyl.readData();
        myVinyl.storageType();
    }
}