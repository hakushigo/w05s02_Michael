package del.it.w05s02.soal3;

public class Rocket {
    public Engine RocketEngine;
    public Fuel Fuel;
    public String RocketModel;

    public Rocket(String RModel, Fuel RocketFuel, Engine RocketEngine){
        this.RocketEngine = RocketEngine;
        this.Fuel = RocketFuel;
        this.RocketModel = RModel;
    }

    public void setRocketModel(String rocketModel) {
        RocketModel = rocketModel;
    }

    public String getRocketModel() {
        return RocketModel;
    }

    public void Starts(){
        System.out.println("This rocket has burn for " + this.RocketEngine.LengthOfFuelBurn(this.Fuel));
    }

    public void getRocketInfo(){
        System.out.println("Rocket info \n" +
                "Rocket Model Name : " + getRocketModel() + "\n" +
                "Fuel Name : " + Fuel.getFuelType() + "\n" +
                "Engine Name : " + this.RocketEngine.getEngineName() + " from " + this.RocketEngine.getEngineManufacture() + "\n");
    }
}
