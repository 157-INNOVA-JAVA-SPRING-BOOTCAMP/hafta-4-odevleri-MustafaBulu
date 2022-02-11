package com.mustafabulu.solid_principle.interface_segregation.bad;


public interface Switches {

    //bir interface e fazla görev verilmiş hem kamera hem radio hem de motor için elemanlar bulunuyor.
    //Bunun yerine kamera, motor ve radio için farklı interfaceler yapılmalıydı.

    void startEngine();

    void shutDownEngine();

    void turnRadioOn();

    void turnRadioOff();

    void turnCameraOn();

    void turnCameraOff();
}


