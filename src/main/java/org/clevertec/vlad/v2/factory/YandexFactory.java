package org.clevertec.vlad.v2.factory;

import org.clevertec.vlad.v2.proxy.factory.DelivererProxyFactoryImpl;
import org.clevertec.vlad.v2.proxy.factory.DeliveryProxyFactory;
import org.clevertec.vlad.v2.smblib.cabbie.CabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cabbie.YandexCabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.YandexCargoDeliverer;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;
import org.clevertec.vlad.v2.smblib.product.YandexProductDeliverer;

public class YandexFactory implements DeliveryFactory{
    @Override
    public CargoDeliverer createCargoDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        return proxyFactory.createCargoDelivererProxy(new YandexCargoDeliverer());
    }

    @Override
    public ProductDeliverer createProductDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        return proxyFactory.createProductDelivererProxy(new YandexProductDeliverer());
    }

    @Override
    public CabbieDeliverer createCabbieDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        return proxyFactory.createCabbieDelivererProxy(new YandexCabbieDeliverer());
    }
}
