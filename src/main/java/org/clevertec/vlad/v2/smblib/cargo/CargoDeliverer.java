package org.clevertec.vlad.v2.smblib.cargo;

import org.clevertec.vlad.v2.log.Log;

public interface CargoDeliverer {
    void takeOrder();
    @Log
    void loadCargo();
    void deliverCargo();
}
