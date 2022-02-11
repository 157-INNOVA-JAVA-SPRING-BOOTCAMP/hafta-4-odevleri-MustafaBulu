package com.mustafabulu.solid_principle.open_closed.bad;

public class EventHandler {

    //Tanımladığımız sürüş modlarını tek tek yazmamız gerekiyor. Ayrıca Bu yapı yeni gelecek sürüş modlarına kapalı
    // ve bir çok kodun değişmesi gerekiyor.Bunu open-closed a uygun hale getirmeliyiz.




    private Vehicle vehicle;

    public EventHandler(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        switch (drivingMode){
            case SPORT:
                vehicle.setPower(500);
                vehicle.setSuspensionHeight(10);
                break;
            case COMFORT:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
            default:
                vehicle.setPower(400);
                vehicle.setSuspensionHeight(20);
                break;
            // when we need to add another mode (e.g. ECONOMY) 2 classes will change DrivingMode and EventHandler.
        }
    }
}
