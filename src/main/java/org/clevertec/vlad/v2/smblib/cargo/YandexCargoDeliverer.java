package org.clevertec.vlad.v2.smblib.cargo;

public class YandexCargoDeliverer implements CargoDeliverer{
    @Override
    public void takeOrder() {
        System.out.println("---------------------");
        System.out.println("Opening Yandex app with orders...");
        System.out.println("Search for new once...");
        System.out.println("Take the marvelous order");
        System.out.println("---------------------");
    }

    @Override
    public void loadCargo() {
        System.out.println("---------------------");
        System.out.println("Going to Yandex warehouse...");
        System.out.println("Asks the movers to load the cargo");
        System.out.println("Draws up the order documents");
        System.out.println("---------------------");
    }

    @Override
    public void deliverCargo() {
        System.out.println("---------------------");
        System.out.println("Searches for the delivery address in Yandex map");
        System.out.println("Delivers cargo");
        System.out.println("---------------------");
    }
}
