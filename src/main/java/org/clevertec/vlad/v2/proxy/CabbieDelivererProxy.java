package org.clevertec.vlad.v2.proxy;

import org.clevertec.vlad.v2.smblib.cabbie.CabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;

public class CabbieDelivererProxy extends BaseDelivererProxy implements CabbieDeliverer {
    private final CabbieDeliverer cabbieDeliverer;

    public CabbieDelivererProxy(CabbieDeliverer deliverer) {
        super(deliverer);
        this.cabbieDeliverer = deliverer;
    }

    @Override
    public void searchForTaxiOrders() {
        if (methodsWithProxy.contains("searchForTaxiOrders")) {
            executeWithLogging("searchForTaxiOrders");
        } else {
            cabbieDeliverer.searchForTaxiOrders();
        }
    }

    @Override
    public void takeOrder() {
        if (methodsWithProxy.contains("takeOrder")) {
            executeWithLogging("takeOrder");
        } else {
            cabbieDeliverer.takeOrder();
        }
    }

    @Override
    public void pickUpPassenger() {
        if (methodsWithProxy.contains("pickUpPassenger")) {
            executeWithLogging("pickUpPassenger");
        } else {
            cabbieDeliverer.pickUpPassenger();
        }
    }

    @Override
    public void deliverPassenger() {
        if (methodsWithProxy.contains("deliverPassenger")) {
            executeWithLogging("deliverPassenger");
        } else {
            cabbieDeliverer.deliverPassenger();
        }
    }

    public CabbieDeliverer getCabbieDeliverer() {
        return cabbieDeliverer;
    }
}
