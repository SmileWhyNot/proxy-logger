package org.clevertec.vlad.v2.smblib.cabbie;

public class YandexCabbieDeliverer implements CabbieDeliverer{
    @Override
    public void searchForTaxiOrders() {
        System.out.println("----------------------");
        System.out.println("Opening Yandex taxi app...");
        System.out.println("Search for orders");
        System.out.println("Found passenger");
        System.out.println("----------------------");
    }

    @Override
    public void takeOrder() {
        System.out.println("----------------------");
        System.out.println("Accept passenger order");
        System.out.println("Send him confirmation in Yandex app");
        System.out.println("----------------------");
    }

    @Override
    public void pickUpPassenger() {
        System.out.println("----------------------");
        System.out.println("Drive to the passenger...");
        System.out.println("Pick him up");
        System.out.println("Advise water or music list");
        System.out.println("----------------------");
    }

    @Override
    public void deliverPassenger() {
        System.out.println("----------------------");
        System.out.println("Deliver passenger to the destination");
        System.out.println("Withdraw payment");
        System.out.println("Say thanks for the order");
        System.out.println("----------------------");
    }
}
