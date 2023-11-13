package org.clevertec.vlad.v2.factory;

import org.clevertec.vlad.v2.proxy.CargoDelivererProxy;
import org.clevertec.vlad.v2.proxy.ProductDelivererProxy;
import org.clevertec.vlad.v2.proxy.factory.DelivererProxyFactoryImpl;
import org.clevertec.vlad.v2.proxy.factory.DeliveryProxyFactory;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.YandexCargoDeliverer;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;
import org.clevertec.vlad.v2.smblib.product.UberProductDeliverer;
import org.clevertec.vlad.v2.smblib.product.YandexProductDeliverer;

public class YandexFactory implements DeliveryFactory{
    @Override
    public CargoDeliverer createCargoDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        CargoDelivererProxy cargoDelivererProxy = proxyFactory.createCargoDelivererProxy(new YandexCargoDeliverer());
        return new CargoDelivererProxy(cargoDelivererProxy.getCargoDeliverer());
    }

    @Override
    public ProductDeliverer createProductDeliverer() {
        DeliveryProxyFactory proxyFactory = new DelivererProxyFactoryImpl();
        ProductDelivererProxy productDelivererProxy = proxyFactory.createProductDelivererProxy(new YandexProductDeliverer());
        return new ProductDelivererProxy(productDelivererProxy.getProductDeliverer());
    }
}
