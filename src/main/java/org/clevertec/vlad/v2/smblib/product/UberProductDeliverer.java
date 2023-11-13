package org.clevertec.vlad.v2.smblib.product;

public class UberProductDeliverer implements ProductDeliverer{
    @Override
    public void takeOrder() {
        System.out.println("---------------------");
        System.out.println("Opening Uber app with orders...");
        System.out.println("Search for new once...");
        System.out.println("Take the marvelous product order");
        System.out.println("---------------------");
    }

    @Override
    public void visitShopsForProducts() {
        System.out.println("------------------");
        System.out.println("Going to shop...");
        System.out.println("------------------");
    }

    @Override
    public void collectProductsForOrder() {
        System.out.println("------------------");
        System.out.println("Search for needed products");
        System.out.println("Uber pays for selected products");
        System.out.println("------------------");
    }

    @Override
    public void deliverOrder() {
        System.out.println("------------------");
        System.out.println("Find the delivery location on Uber map");
        System.out.println("Deliver products...");
        System.out.println("------------------");
    }
}
