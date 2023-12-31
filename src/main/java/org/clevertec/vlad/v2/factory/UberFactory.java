package org.clevertec.vlad.v2.factory;

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
        return proxyFactory.createCargoDelivererProxy(new UberCargoDeliverer());
    }

    @Override
    public ProductDeliverer createProductDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        return proxyFactory.createProductDelivererProxy(new UberProductDeliverer());
    }

    @Override
    public CabbieDeliverer createCabbieDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        return proxyFactory.createCabbieDelivererProxy(new UberCabbieDeliverer());
    }
}
