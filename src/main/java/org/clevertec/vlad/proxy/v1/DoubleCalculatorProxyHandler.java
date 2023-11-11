package org.clevertec.vlad.proxy.v1;

import org.clevertec.vlad.proxy.v1.fortest.lib.Calculator;
import org.clevertec.vlad.proxy.v1.fortest.lib.DoubleCalculatorImpl;

import java.util.ArrayList;
import java.util.List;

public class DoubleCalculatorProxyHandler implements Calculator<Double> {

    private final DoubleCalculatorImpl doubleCalculator;

    List<String> annotatedMethods = new ArrayList<>();

    public DoubleCalculatorProxyHandler(DoubleCalculatorImpl doubleCalculator) {
        this.doubleCalculator = doubleCalculator;
        calculatorProxy(doubleCalculator);
    }

    public void calculatorProxy(Object object) {
        Class<?>[] interfaces = object.getClass().getInterfaces();
        for (Class<?> inter :
                interfaces) {
            System.out.println(inter);
        }
//        Method[] methods = object.getClass().getMethods();
//        Arrays.stream(methods).flatMap(m ->
//                        Objects.nonNull(m.getAnnotation(Log.class)) ? Stream.of(m.getName()) : Stream.empty())
//                .forEach(annotatedMethods::add);
//
//        for (String method :
//                annotatedMethods) {
//            System.out.println(method);
//        }
    }

    @Override
    public Double sum(Double x, Double y) {
        System.out.println("log: start ");
        Double result = doubleCalculator.sum(x, y);
        System.out.println("end");
        return result;
    }

    @Override
    public Double subtract(Double x, Double y) {
        System.out.println("log: start ");
        Double result = doubleCalculator.subtract(x, y);
        System.out.println("end");
        return result;
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
