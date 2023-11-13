package org.clevertec.vlad.v2.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.clevertec.vlad.v2.log.LogHandler;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BaseDelivererProxy {
    private static final Logger logger = LogManager.getLogger(BaseDelivererProxy.class);
    protected Map<String, List<String>> annotatedMethods;
    protected final List<String> methodsWithProxy = new ArrayList<>();
    protected final Object deliverer;

    protected BaseDelivererProxy(Object deliverer) {
        LogHandler instance = LogHandler.getInstance();
        instance.pickUpAnnotatedMethods(this);
        annotatedMethods = instance.getAnnotatedMethods();
        this.findThisMethodsInAnnotatedList();
        this.deliverer = deliverer;
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

    protected void executeWithLogging(String methodName) {
        logger.info("Class named: " + deliverer.getClass().getName());
        logger.info("Started method: " + methodName);
        try {
            Method method = deliverer.getClass().getMethod(methodName);
            method.invoke(deliverer);
        } catch (Exception e) {
            logger.error("Error executing method: " + methodName, e);
        }
        logger.info("Ended method: " + methodName);
    }
}
