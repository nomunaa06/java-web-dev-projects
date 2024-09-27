package org.launchcode;

public abstract class BaseDisc {

    double capacity;
    String name;
    String contents;
    String discType;

    public BaseDisc(double capacity, String name, String discType, String contents) {
        this.capacity = capacity;
        this.name = name;
        this.discType = discType;
        this.contents = contents;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
