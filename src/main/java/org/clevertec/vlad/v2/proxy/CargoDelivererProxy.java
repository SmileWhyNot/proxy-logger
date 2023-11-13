package org.clevertec.vlad.v2.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.clevertec.vlad.v2.log.LogHandler;
import org.clevertec.vlad.v2.smblib.cargo.CargoDeliverer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CargoDelivererProxy implements CargoDeliverer {

    private static final Logger logger = LogManager.getLogger(CargoDelivererProxy.class);
    private Map<String, List<String>> annotatedMethods = new HashMap<>();
    private final List<String> methodsWithProxy = new ArrayList<>();
    private final CargoDeliverer cargoDeliverer;

    public CargoDelivererProxy(CargoDeliverer deliverer) {
        LogHandler instance = LogHandler.getInstance();
        instance.pickUpAnnotatedMethods(this);
        annotatedMethods = instance.getAnnotatedMethods();
        this.findThisMethodsInAnnotatedList();
        this.cargoDeliverer = deliverer;
    }

    private void findThisMethodsInAnnotatedList() {
        Class<?>[] interfaces = this.getClass().getInterfaces();
        String interfaceName = interfaces.length > 0 ? interfaces[0].getName() : "";

        List<String> s = annotatedMethods.get(interfaceName);

        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if (s.contains(methodName)) {
                methodsWithProxy.add(methodName);
            }
        }

    }

    @Override
    public void takeOrder() {
        if (methodsWithProxy.contains("takeOrder")) {
            logger.info("Class named: " + cargoDeliverer.getClass().getName());
            logger.info("Started method: takeOrder");
            cargoDeliverer.takeOrder();
            logger.info("Ended method: takeOrder");
            return;
        }
        cargoDeliverer.takeOrder();
    }

    @Override
    public void loadCargo() {
        if (methodsWithProxy.contains("loadCargo")) {
            logger.info("Class named: " + cargoDeliverer.getClass().getName());
            logger.info("Started method: loadCargo");
            cargoDeliverer.loadCargo();
            logger.info("Ended method: loadCargo");
            return;
        }
        cargoDeliverer.loadCargo();
    }

    @Override
    public void deliverCargo() {
        if (methodsWithProxy.contains("deliverCargo")) {
            logger.info("Class named: " + cargoDeliverer.getClass().getName());
            logger.info("Started method: deliverCargo");
            cargoDeliverer.deliverCargo();
            logger.info("Ended method: deliverCargo");
            return;
        }
        cargoDeliverer.deliverCargo();
    }

    public CargoDeliverer getCargoDeliverer() {
        return cargoDeliverer;
    }
}
