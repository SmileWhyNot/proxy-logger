package org.clevertec.vlad.v2.proxy;

import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;

public class ProductDelivererProxy extends BaseDelivererProxy implements ProductDeliverer {
    private final ProductDeliverer productDeliverer;

    public ProductDelivererProxy(ProductDeliverer deliverer) {
        super(deliverer);
        this.productDeliverer = deliverer;
    }

    @Override
    public void takeOrder() {
        if (methodsWithProxy.contains("takeOrder")) {
            executeWithLogging("takeOrder");
        } else {
            productDeliverer.takeOrder();
        }
    }

    @Override
    public void visitShopsForProducts() {
        if (methodsWithProxy.contains("visitShopsForProducts")) {
            executeWithLogging("visitShopsForProducts");
        } else {
            productDeliverer.visitShopsForProducts();
        }
    }

    @Override
    public void collectProductsForOrder() {
        if (methodsWithProxy.contains("collectProductsForOrder")) {
            executeWithLogging("collectProductsForOrder");
        } else {
            productDeliverer.collectProductsForOrder();
        }
    }

    @Override
    public void deliverOrder() {
        if (methodsWithProxy.contains("deliverOrder")) {
            executeWithLogging("deliverOrder");
        } else {
            productDeliverer.deliverOrder();
        }
    }

    public ProductDeliverer getProductDeliverer() {
        return productDeliverer;
    }
}
