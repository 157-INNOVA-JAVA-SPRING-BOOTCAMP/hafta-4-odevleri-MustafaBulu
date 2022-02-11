package com.mustafabulu.solid_principle.single_responsibility.solution;

public class FuelPump {


    //Sadece benzin pompası için gerekli bileşenler var.
    public void reFuel(final Vehicle vehicle){
        final int remainingFuel = vehicle.getRemainingFuel();
        final int additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }
}
