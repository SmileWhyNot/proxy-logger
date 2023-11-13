package org.clevertec.vlad.v2.factory;

import org.clevertec.vlad.v2.smblib.cabbie.CabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;

public interface DeliveryFactory {
    CargoDeliverer createCargoDeliverer();
    ProductDeliverer createProductDeliverer();

    CabbieDeliverer createCabbieDeliverer();
}
