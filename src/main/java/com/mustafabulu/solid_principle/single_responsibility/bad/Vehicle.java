package com.mustafabulu.solid_principle.single_responsibility.bad;

public class Vehicle {

    // Tek bir sınıf açılıp Arabanın özellikleri olmayan özellikler bile dahil edilmiş
    // Bunun yerine Single responsibility principle a göre her sınıfa bir iş verecek şekilde düzelteceğiz.

    private final int maxFuel;
    private int remainingFuel;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    // this is not a car's responsibility.
    public void reFuel(){
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }

}
