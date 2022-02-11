package com.mustafabulu.solid_principle.dependency_inversion.bad;


public class Pilot {

    // pilot sınıfı racingcar sınıfına aşırı derecede bağımlı
    //Bunun yerine bu sınıfa karşı bağımlılığı en aza indirmeliyiz.

    private RacingCar vehicle;

    public Pilot(){
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }
}
