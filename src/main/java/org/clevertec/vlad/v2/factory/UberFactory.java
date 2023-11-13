package org.clevertec.vlad.v2.factory;

import org.clevertec.vlad.v2.proxy.CabbieDelivererProxy;
import org.clevertec.vlad.v2.proxy.CargoDelivererProxy;
import org.clevertec.vlad.v2.proxy.ProductDelivererProxy;
import org.clevertec.vlad.v2.proxy.factory.DelivererProxyFactoryImpl;
import org.clevertec.vlad.v2.proxy.factory.DeliveryProxyFactory;
import org.clevertec.vlad.v2.smblib.cabbie.CabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cabbie.UberCabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.UberCargoDeliverer;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;
import org.clevertec.vlad.v2.smblib.product.UberProductDeliverer;

public class UberFactory implements DeliveryFactory{
    @Override
    public CargoDeliverer createCargoDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        CargoDelivererProxy cargoDelivererProxy = proxyFactory.createCargoDelivererProxy(new UberCargoDeliverer());
        return new CargoDelivererProxy(cargoDelivererProxy.getCargoDeliverer());
    }

    @Override
    public ProductDeliverer createProductDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        ProductDelivererProxy productDelivererProxy = proxyFactory.createProductDelivererProxy(new UberProductDeliverer());
        return new ProductDelivererProxy(productDelivererProxy.getProductDeliverer());
    }

    @Override
    public CabbieDeliverer createCabbieDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        CabbieDelivererProxy cabbieDelivererProxy = proxyFactory.createCabbieDelivererProxy(new UberCabbieDeliverer());
        return new CabbieDelivererProxy(cabbieDelivererProxy.getCabbieDeliverer());
    }
}
