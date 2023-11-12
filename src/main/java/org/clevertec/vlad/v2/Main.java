package org.clevertec.vlad.v2;

import org.clevertec.vlad.v2.factory.DeliveryFactory;
import org.clevertec.vlad.v2.factory.UberFactory;
import org.clevertec.vlad.v2.factory.YandexFactory;
import org.clevertec.vlad.v2.smblib.CargoDeliverer;

public class Main {
    public static void main(String[] args) {
        DeliveryFactory deliveryFactory = new YandexFactory();
        DeliveryFactory deliveryFactory2 = new UberFactory();

        CargoDeliverer cargoDeliverer = deliveryFactory.createCargoDeliverer();
        CargoDeliverer cargoDeliverer1 = deliveryFactory2.createCargoDeliverer();

        cargoDeliverer.loadCargo();
        cargoDeliverer.takeOrder();
        cargoDeliverer.deliverCargo();

        cargoDeliverer1.loadCargo();
        cargoDeliverer1.takeOrder();
        cargoDeliverer1.deliverCargo();

    }
}
