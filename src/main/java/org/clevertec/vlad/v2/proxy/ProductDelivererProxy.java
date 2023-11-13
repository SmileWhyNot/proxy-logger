package org.clevertec.vlad.v2.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.clevertec.vlad.v2.log.LogHandler;
import org.clevertec.vlad.v2.smblib.product.ProductDeliverer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDelivererProxy implements ProductDeliverer {
    private static final Logger logger = LogManager.getLogger(CargoDelivererProxy.class);
    private Map<String, List<String>> annotatedMethods = new HashMap<>();
    private final List<String> methodsWithProxy = new ArrayList<>();
    private final ProductDeliverer productDeliverer;

    public ProductDelivererProxy(ProductDeliverer deliverer) {
        LogHandler instance = LogHandler.getInstance();
        instance.pickUpAnnotatedMethods(this);
        annotatedMethods = instance.getAnnotatedMethods();
        this.findThisMethodsInAnnotatedList();
        this.productDeliverer = deliverer;
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
            logger.info("Class named: " + productDeliverer.getClass().getName());
            logger.info("Started method: takeOrder");
            productDeliverer.takeOrder();
            logger.info("Ended method: takeOrder");
            return;
        }
        productDeliverer.takeOrder();
    }

    @Override
    public void visitShopsForProducts() {
        if (methodsWithProxy.contains("visitShopsForProducts")) {
            logger.info("Class named: " + productDeliverer.getClass().getName());
            logger.info("Started method: visitShopsForProducts");
            productDeliverer.visitShopsForProducts();
            logger.info("Ended method: visitShopsForProducts");
            return;
        }
        productDeliverer.visitShopsForProducts();
    }

    @Override
    public void collectProductsForOrder() {
        if (methodsWithProxy.contains("collectProductsForOrder")) {
            logger.info("Class named: " + productDeliverer.getClass().getName());
            logger.info("Started method: collectProductsForOrder");
            productDeliverer.collectProductsForOrder();
            logger.info("Ended method: collectProductsForOrder");
            return;
        }
        productDeliverer.collectProductsForOrder();
    }

    @Override
    public void deliverOrder() {
        if (methodsWithProxy.contains("deliverOrder")) {
            logger.info("Class named: " + productDeliverer.getClass().getName());
            logger.info("Started method: deliverOrder");
            productDeliverer.deliverOrder();
            logger.info("Ended method: deliverOrder");
            return;
        }
        productDeliverer.deliverOrder();
    }

    public ProductDeliverer getProductDeliverer() {
        return productDeliverer;
    }
}
