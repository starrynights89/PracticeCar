package PracticeCar;

import java.util.Random;

public class Tire extends CarPart {
    private static short instanceCount;
    private short tireNumber;
    private float inflationPSI;

    // CONSTRUCTOR

    public Tire(float inflationPSI) {
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
    public void status() {
        System.out.println("Tire # " + this.tireNumber + " (serial #00" + this.serialNumber + ") is at "
                            + this.condition + this.conditionMeasure + " and " + this.inflationPSI + "psi.");
    }

    public void status(String extraMessage) {
        System.out.print("Tire #" + this.tireNumber + " ("
                        + this.condition + this.conditionMeasure + ", " + this.inflationPSI + "psi) says: ");
        System.out.println(extraMessage);
    }

    public void function(float milesDriven) throws CarCrashException {

    }
}
