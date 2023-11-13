package org.clevertec.vlad.v2.smblib.product;

import org.clevertec.vlad.v2.log.Log;

public interface ProductDeliverer {

    @Log
    void takeOrder();
    void visitShopsForProducts();
    @Log
    void collectProductsForOrder();
    void deliverOrder();
}
