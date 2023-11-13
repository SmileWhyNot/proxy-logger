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

        DeliveryFactory yandexFactory = new YandexFactory();
        DeliveryFactory uberFactory = new UberFactory();

        // Доставка груза от Яндекса и Убера
        System.out.println("""
                
                ===================================
                Cargo delivery FROM Yandex
                ===================================
                """);
        CargoDeliverer yandexCargoDeliverer = yandexFactory.createCargoDeliverer();

        yandexCargoDeliverer.takeOrder();
        yandexCargoDeliverer.loadCargo();
        yandexCargoDeliverer.deliverCargo();

        System.out.println("""
                
                ===================================
                Cargo delivery FROM Uber
                ===================================
                """);
        CargoDeliverer uberCargoDeliverer = uberFactory.createCargoDeliverer();

        uberCargoDeliverer.takeOrder();
        uberCargoDeliverer.loadCargo();
        uberCargoDeliverer.deliverCargo();

        // Доставка продуктов от Яндекса и Убера
        System.out.println("""
                
                ===================================
                Product delivery FROM Yandex
                ===================================
                """);
        ProductDeliverer yandexProductDeliverer = yandexFactory.createProductDeliverer();

        yandexProductDeliverer.takeOrder();
        yandexProductDeliverer.visitShopsForProducts();
        yandexProductDeliverer.collectProductsForOrder();
        yandexProductDeliverer.deliverOrder();

        System.out.println("""
                
                ===================================
                Product delivery FROM Uber
                ===================================
                """);
        ProductDeliverer uberProductDeliverer = uberFactory.createProductDeliverer();

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
        CabbieDeliverer yandexCabbieDeliverer = yandexFactory.createCabbieDeliverer();

        yandexCabbieDeliverer.searchForTaxiOrders();
        yandexCabbieDeliverer.takeOrder();
        yandexCabbieDeliverer.pickUpPassenger();
        yandexCabbieDeliverer.deliverPassenger();

        System.out.println("""
                
                ===================================
                Cabbie delivery FROM Uber
                ===================================
                """);
        CabbieDeliverer uberCabbieDeliverer = uberFactory.createCabbieDeliverer();

        uberCabbieDeliverer.searchForTaxiOrders();
        uberCabbieDeliverer.takeOrder();
        uberCabbieDeliverer.pickUpPassenger();
        uberCabbieDeliverer.deliverPassenger();
    }
}
