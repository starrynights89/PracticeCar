package PracticeCar;

// abstract because we're not defining function() from the
// Functional interface, we'll do that in a subclass
public abstract class CarPart implements Functional, Interactive{
    // instanceCount can help us assign a serial number to each part,
    // to help out the mechanics.
    private static long instanceCount = 0;

    protected String partName;
    protected long serialNumber;
    protected  float bestCondition;
    protected String conditionMeasure;

    protected  float condition;
    protected float currentTotalMiles;

    // CONSTRUCTOR

    public CarPart(String name, String conditionMeasure, float bestCondition) {
        instanceCount += 1;
        this.serialNumber = instanceCount;
        this.partName = name;
        this.bestCondition = bestCondition;
        this.conditionMeasure = conditionMeasure;
        this.condition = this.bestCondition;
        this.currentTotalMiles = 0;
    }

    // GETTERS

    public String getPartName() { return this.partName; }
    public long getSerialNumber() { return this.serialNumber; }
    public float getBestCondition() { return this.bestCondition; }
    public String getConditionMeasure() { return this.conditionMeasure; }

    public boolean isBroken() { return this.condition <= 0; }
    public boolean isLikeNew() { return this.condition >= this.bestCondition; }
    public float getCondition() { return this.condition; }
    public float getCurrentTotalMiles() { return this.currentTotalMiles; }

    // SETTERS

    public void setCondition(float newCondition) {
        this.condition = newCondition;
        if (this.condition < 0) {
            this.condition = 0;
        } else if (this.condition > this.bestCondition) {
            this.condition = this.bestCondition;
        }
    }

    public void changeCondition(float delta) {

    }
}
