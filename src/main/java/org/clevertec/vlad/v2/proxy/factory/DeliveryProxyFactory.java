package org.clevertec.vlad.v2.proxy.factory;

import org.clevertec.vlad.v2.proxy.CargoDelivererProxy;
import org.clevertec.vlad.v2.smblib.CargoDeliverer;

public interface DeliveryProxyFactory {

    CargoDelivererProxy createCargoDelivererProxy(CargoDeliverer cargoDeliverer);
}
