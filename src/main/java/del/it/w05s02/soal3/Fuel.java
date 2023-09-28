package del.it.w05s02.soal3;

public class Fuel {
    private String FuelType;
    private Integer NumberOfLiters;

    public Fuel(String FT, Integer NOL, Float BurnRate){
        setFuelType(FT);
        setNumberOfLiters(NOL);
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public void setNumberOfLiters(Integer numberOfLiters) {
        NumberOfLiters = numberOfLiters;
    }

    public Integer getNumberOfLiters() {
        return NumberOfLiters;
    }

    public String getFuelType() {
        return FuelType;
    }
}
