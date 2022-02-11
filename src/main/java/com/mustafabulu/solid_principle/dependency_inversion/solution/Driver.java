package com.mustafabulu.solid_principle.dependency_inversion.solution;


public class Driver {


    //Bağımlılıklar daha az bir seviyeye indirildi ve dependency inversion prensibine göre düzenlendi

    private Vehicle vehicle;

    public Driver(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
