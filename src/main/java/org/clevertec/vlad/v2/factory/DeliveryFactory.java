package org.clevertec.vlad.v2.factory;

import org.clevertec.vlad.v2.smblib.CargoDeliverer;

public interface DeliveryFactory {
    CargoDeliverer createCargoDeliverer();
}
