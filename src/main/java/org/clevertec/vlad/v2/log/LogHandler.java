package org.clevertec.vlad.v2.log;

import java.lang.reflect.Method;
import java.util.*;

public class LogHandler {

    private static LogHandler instance;
    private Map<String, List<String>> annotatedMethods;

    private LogHandler() {
        annotatedMethods = new HashMap<>();
    }

    public static LogHandler getInstance() {
        if (instance == null) {
            instance = new LogHandler();
        }
        return instance;
    }

    public void pickUpAnnotatedMethods(Object object) {
        Class<?>[] interfaces = object.getClass().getInterfaces();

        for (Class<?> i : interfaces) {
            Method[] methods = i.getMethods();
            for (Method m : methods) {
                if (m.getAnnotation(Log.class) != null) {
                    String interfaceName = i.getName();
                    String methodName = m.getName();

                    annotatedMethods.computeIfAbsent(interfaceName, k -> new ArrayList<>()).add(methodName);
                }
            }
        }
    }

    public Map<String, List<String>> getAnnotatedMethods() {
        return annotatedMethods;
    }
}
