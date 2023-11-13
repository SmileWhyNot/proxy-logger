package org.clevertec.vlad.v2.proxy;

import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;

public class CargoDelivererProxy extends BaseDelivererProxy implements CargoDeliverer {

    private final CargoDeliverer cargoDeliverer;

    public CargoDelivererProxy(CargoDeliverer deliverer) {
        super(deliverer);
        this.cargoDeliverer = deliverer;
    }
    @Override
    public void takeOrder() {
        if (methodsWithProxy.contains("takeOrder")) {
            executeWithLogging("takeOrder");
        } else {
            cargoDeliverer.takeOrder();
        }
    }

    @Override
    public void loadCargo() {
        if (methodsWithProxy.contains("loadCargo")) {
            executeWithLogging("loadCargo");
        } else {
            cargoDeliverer.loadCargo();
        }
    }

    @Override
    public void deliverCargo() {
        if (methodsWithProxy.contains("deliverCargo")) {
            executeWithLogging("deliverCargo");
        } else {
            cargoDeliverer.deliverCargo();
        }
    }
}
