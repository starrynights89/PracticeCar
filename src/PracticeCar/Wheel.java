package PracticeCar;

import java.util.Random;

public class Wheel extends CarPart {
    private static short instanceCount;
    private short tireNumber;
    private float inflationPSI;

    // CONSTRUCTOR

    public Wheel(float inflationPSI) {
        super("tire", "% traction", 100);
        instanceCount += 1;
        this.tireNumber = instanceCount;
        this.inflationPSI = inflationPSI;
    }

    // GETTERS

    public float getInflationPSI() { return this.inflationPSI; }
    public short getTireNumber() { return this.tireNumber; }

    // SETTERS

    // Override to make sure tires are filled when replaced
    // inflationPSI isn't a default field of CarPart
    public void replacePart() {
        super.replacePart();
        this.inflationPSI = 32;
    }

    // Override status method to include tire number, not just serial number


    private String type;

    public Wheel(String t) {
        type = t;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
