package org.clevertec.vlad.proxy.v1.fortest;

import org.clevertec.vlad.proxy.v1.fortest.factory.AbstractCalculatorFactory;
import org.clevertec.vlad.proxy.v1.fortest.factory.DoubleCalculatorFactory;
import org.clevertec.vlad.proxy.v1.fortest.lib.Calculator;

public class LoggerStarter {
    public static void main(String[] args) {

        AbstractCalculatorFactory<Double> calculatorFactory = new DoubleCalculatorFactory();
        Calculator<Double> calculator = calculatorFactory.createCalculator();

        System.out.println(calculator.sum(1d, 2d));
        System.out.println(calculator.subtract(1d, 2d));
    }
}
