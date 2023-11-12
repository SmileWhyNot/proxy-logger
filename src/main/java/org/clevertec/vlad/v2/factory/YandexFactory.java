package org.clevertec.vlad.v2.factory;

import org.clevertec.vlad.v2.proxy.CargoDelivererProxy;
import org.clevertec.vlad.v2.proxy.factory.DelivererProxyFactoryImpl;
import org.clevertec.vlad.v2.proxy.factory.DeliveryProxyFactory;
import org.clevertec.vlad.v2.smblib.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.YandexCargoDeliverer;

public class YandexFactory implements DeliveryFactory{
    @Override
    public CargoDeliverer createCargoDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        CargoDelivererProxy cargoDelivererProxy = proxyFactory.createCargoDelivererProxy(new YandexCargoDeliverer());
        return new CargoDelivererProxy(cargoDelivererProxy);
    }
}
