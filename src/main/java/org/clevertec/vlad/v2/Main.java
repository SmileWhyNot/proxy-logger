package org.clevertec.vlad.v2;

import org.clevertec.vlad.v2.factory.DeliveryFactory;
import org.clevertec.vlad.v2.factory.UberFactory;
import org.clevertec.vlad.v2.factory.YandexFactory;
import org.clevertec.vlad.v2.smblib.cabbie.CabbieDeliverer;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;

public class Main {
    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "src/main/resources/log4j2.properties");

        DeliveryFactory deliveryFactory = new YandexFactory();
        DeliveryFactory deliveryFactory1 = new UberFactory();

        // Доставка груза от Яндекса и Убера
        System.out.println("""
                
                ===================================
                Cargo delivery FROM Yandex
                ===================================
                """);
        CargoDeliverer yandexCargoDeliverer = deliveryFactory.createCargoDeliverer();
        CargoDeliverer uberCargoDeliverer = deliveryFactory1.createCargoDeliverer();

        yandexCargoDeliverer.takeOrder();
        yandexCargoDeliverer.loadCargo();
        yandexCargoDeliverer.deliverCargo();

        System.out.println("""
                
                ===================================
                Cargo delivery FROM Uber
                ===================================
                """);

        uberCargoDeliverer.takeOrder();
        uberCargoDeliverer.loadCargo();
        uberCargoDeliverer.deliverCargo();

        // Доставка продуктов от Яндекса и Убера
        System.out.println("""
                
                ===================================
                Product delivery FROM Yandex
                ===================================
                """);
        ProductDeliverer yandexProductDeliverer = deliveryFactory.createProductDeliverer();
        ProductDeliverer uberProductDeliverer = deliveryFactory1.createProductDeliverer();

        yandexProductDeliverer.takeOrder();
        yandexProductDeliverer.visitShopsForProducts();
        yandexProductDeliverer.collectProductsForOrder();
        yandexProductDeliverer.deliverOrder();

        System.out.println("""
                
                ===================================
                Product delivery FROM Uber
                ===================================
                """);

        uberProductDeliverer.takeOrder();
        uberProductDeliverer.visitShopsForProducts();
        uberProductDeliverer.collectProductsForOrder();
        uberProductDeliverer.deliverOrder();

        // Доставка людей (такси) от Яндекса и Убера
        System.out.println("""
                
                ===================================
                Cabbie delivery FROM Yandex
                ===================================
                """);
        CabbieDeliverer yandexCabbieDeliverer = deliveryFactory.createCabbieDeliverer();
        CabbieDeliverer uberCabbieDeliverer = deliveryFactory.createCabbieDeliverer();

        yandexCabbieDeliverer.searchForTaxiOrders();
        yandexCabbieDeliverer.takeOrder();
        yandexCabbieDeliverer.pickUpPassenger();
        yandexCabbieDeliverer.deliverPassenger();

        System.out.println("""
                
                ===================================
                Cabbie delivery FROM Uber
                ===================================
                """);

        uberCabbieDeliverer.searchForTaxiOrders();
        uberCabbieDeliverer.takeOrder();
        uberCabbieDeliverer.pickUpPassenger();
        uberCabbieDeliverer.deliverPassenger();
    }
}
