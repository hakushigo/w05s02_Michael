package del.it.w05s02.soal3;

public class driver {
    public static void main(String args[]){

        Engine EAPP238 = new Engine(
                "ArianeGroup - Airbus",
                "EAP P238",
                120.3f,
                9998f
        );

        Fuel RocketFuel = new Fuel(
                "NO2 O2 MiX",
                9995000,
                912f
        );

        Rocket Ariane5 = new Rocket(
                "Ariane 5",
                RocketFuel,
                EAPP238
        );
    }
}
