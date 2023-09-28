package del.it.w05s02.soal3;

public class Engine {
    private String EngineManufacture;
    private String EngineName;
    private Float BurnRate;
    private Float ThrustSpeed;

    public Engine(String ManufactureName, String Name, Float BurnRate, Float ThurstSpeed){
        setEngineManufacture(ManufactureName);
        setEngineName(Name);
        setBurnRate(BurnRate);
        setThrustSpeed(ThrustSpeed);
    }

    public void setEngineManufacture(String engineManufacture) {
        EngineManufacture = engineManufacture;
    }

    public void setBurnRate(Float burnRate) {
        BurnRate = burnRate;
    }

    public void setEngineName(String engineName) {
        EngineName = engineName;
    }

    public void setThrustSpeed(Float thrustSpeed) {
        ThrustSpeed = thrustSpeed;
    }

    public Float getBurnRate() {
        return BurnRate;
    }

    public Float getThrustSpeed() {
        return ThrustSpeed;
    }

    public String getEngineManufacture() {
        return EngineManufacture;
    }

    public String getEngineName() {
        return EngineName;
    }

    public Float LengthOfFuelBurn(Fuel fuel){
        return fuel.getNumberOfLiters()/this.BurnRate;
    }
}
