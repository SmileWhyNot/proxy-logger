package org.clevertec.vlad.v2.proxy;

import org.clevertec.vlad.v2.log.LogHandler;
import org.clevertec.vlad.v2.smblib.CargoDeliverer;

import java.lang.reflect.Method;
import java.util.*;

public class CargoDelivererProxy implements CargoDeliverer {

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
            System.out.println("Class named: " + cargoDeliverer.getClass().getName());
            System.out.println("Started method: takeOrder");
            cargoDeliverer.takeOrder();
            System.out.println("Ended method: takeOrder");
            return;
        }
        cargoDeliverer.takeOrder();
    }

    @Override
    public void loadCargo() {
        if (methodsWithProxy.contains("loadCargo")) {
            System.out.println("Class named: " + cargoDeliverer.getClass().getName());
            System.out.println("Started method: loadCargo");
            cargoDeliverer.loadCargo();
            System.out.println("Ended method: loadCargo");
            return;
        }
        cargoDeliverer.loadCargo();
    }

    @Override
    public void deliverCargo() {
        if (methodsWithProxy.contains("deliverCargo")) {
            System.out.println("Class named: " + cargoDeliverer.getClass().getName());
            System.out.println("Started method: deliverCargo");
            cargoDeliverer.deliverCargo();
            System.out.println("Ended method: deliverCargo");
            return;
        }
        cargoDeliverer.deliverCargo();
    }
}
