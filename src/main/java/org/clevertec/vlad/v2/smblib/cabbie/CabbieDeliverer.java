package org.clevertec.vlad.v2.smblib.cabbie;

import org.clevertec.vlad.v2.log.Log;

public interface CabbieDeliverer {
    @Log
    void searchForTaxiOrders();
    void takeOrder();
    @Log
    void pickUpPassenger();
    void deliverPassenger();
}
