package org.clevertec.vlad.v2.proxy.factory;

import org.clevertec.vlad.v2.proxy.CabbieDelivererProxy;
import org.clevertec.vlad.v2.proxy.CargoDelivererProxy;
import org.clevertec.vlad.v2.proxy.ProductDelivererProxy;
import org.clevertec.vlad.v2.smblib.cabbie.CabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;

public class DelivererProxyFactoryImpl implements DeliveryProxyFactory {
    @Override
    public CargoDelivererProxy createCargoDelivererProxy(CargoDeliverer cargoDeliverer) {
        return new CargoDelivererProxy(cargoDeliverer);
    }

    @Override
    public ProductDelivererProxy createProductDelivererProxy(ProductDeliverer productDeliverer) {
        return new ProductDelivererProxy(productDeliverer);
    }

    @Override
    public CabbieDelivererProxy createCabbieDelivererProxy(CabbieDeliverer cabbieDeliverer) {
        return new CabbieDelivererProxy(cabbieDeliverer);
    }
}
