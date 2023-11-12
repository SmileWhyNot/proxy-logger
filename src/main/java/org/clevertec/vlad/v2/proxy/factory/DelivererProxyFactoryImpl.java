package org.clevertec.vlad.v2.proxy.factory;

import org.clevertec.vlad.v2.proxy.CargoDelivererProxy;
import org.clevertec.vlad.v2.smblib.CargoDeliverer;

public class DelivererProxyFactoryImpl implements DeliveryProxyFactory {
    @Override
    public CargoDelivererProxy createCargoDelivererProxy(CargoDeliverer cargoDeliverer) {
        return new CargoDelivererProxy(cargoDeliverer);
    }
}
