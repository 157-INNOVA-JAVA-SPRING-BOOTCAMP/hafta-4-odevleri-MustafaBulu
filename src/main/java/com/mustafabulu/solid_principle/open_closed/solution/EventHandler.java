package com.mustafabulu.solid_principle.open_closed.solution;

public class EventHandler {

    //kötü çözümdeki open-closed yapısı yerine çok az bir kod ile yeni sürüş modumuzu ekleyebiliyoruz.
    //Eğer yeni bir sürüş modu oluşturmak istersek DrivingMode interface imizi implement edip yeni sürüş modumuzu ekleyebiliriz.

    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        vehicle.setPower(drivingMode.getPower());
        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
        // now, when we need to add another mode (e.g. ECONOMY) just create a new class: Economy.
    }
}
