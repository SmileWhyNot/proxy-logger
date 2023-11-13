package org.clevertec.vlad.v2.proxy.factory;

import org.clevertec.vlad.v2.proxy.CabbieDelivererProxy;
import org.clevertec.vlad.v2.proxy.CargoDelivererProxy;
import org.clevertec.vlad.v2.proxy.ProductDelivererProxy;
import org.clevertec.vlad.v2.smblib.cabbie.CabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;

public interface DeliveryProxyFactory {

    CargoDelivererProxy createCargoDelivererProxy(CargoDeliverer cargoDeliverer);

    ProductDelivererProxy createProductDelivererProxy(ProductDeliverer productDeliverer);

    CabbieDelivererProxy createCabbieDelivererProxy(CabbieDeliverer cabbieDeliverer);
}
