package org.clevertec.vlad.proxy.v1.proxy;

import org.clevertec.vlad.proxy.v1.Log;
import org.clevertec.vlad.proxy.v1.fortest.lib.Calculator;
import org.clevertec.vlad.proxy.v1.fortest.lib.DoubleCalculatorImpl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class DoubleCalculatorProxyHandler implements Calculator<Double> {

    private final DoubleCalculatorImpl doubleCalculator;

    List<String> annotatedMethods = new ArrayList<>();

    public DoubleCalculatorProxyHandler(DoubleCalculatorImpl doubleCalculator) {
        this.doubleCalculator = doubleCalculator;
        calculatorProxy(doubleCalculator);
    }

    public void calculatorProxy(Object object) {
        Class<?>[] interfaces = object.getClass().getInterfaces();
        Method[] methods = new Method[0];
        for (Class<?> inter : interfaces) {
            methods = inter.getMethods();
        }
        Arrays.stream(methods).flatMap(m ->
                        Objects.nonNull(m.getAnnotation(Log.class)) ? Stream.of(m.getName()) : Stream.empty())
                .forEach(annotatedMethods::add);

        for (String method :
                annotatedMethods) {
            System.out.println(method);
        }
    }

    private boolean shouldLog(String methodName) {
    return annotatedMethods.contains(methodName);
    }

    @Override
    public Double sum(Double x, Double y) {
        if (shouldLog("sum")) {
            System.out.println("log: start ");
            Double result = doubleCalculator.sum(x, y);
            System.out.println("end");
            return result;
        }
        return doubleCalculator.sum(x, y);
    }

    @Override
    public Double subtract(Double x, Double y) {
        if (shouldLog("substract")) {
            System.out.println("log: start ");
            Double result = doubleCalculator.subtract(x, y);
            System.out.println("end");
            return result;
        }
        return doubleCalculator.subtract(x, y);
    }

    @Override
    public Double multiply(Double x, Double y) {
        System.out.println("log: start ");
        Double result = doubleCalculator.multiply(x, y);
        System.out.println("end");
        return result;
    }

    @Override
    public Double divide(Double x, Double y) {
        System.out.println("log: start ");
        Double result = doubleCalculator.divide(x, y);
        System.out.println("end");
        return result;
    }
}
