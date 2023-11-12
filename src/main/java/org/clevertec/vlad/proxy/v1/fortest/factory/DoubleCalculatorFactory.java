package org.clevertec.vlad.proxy.v1.fortest.factory;

import org.clevertec.vlad.proxy.v1.proxy.DoubleCalculatorProxyHandler;
import org.clevertec.vlad.proxy.v1.fortest.lib.Calculator;
import org.clevertec.vlad.proxy.v1.fortest.lib.DoubleCalculatorImpl;

public class DoubleCalculatorFactory implements AbstractCalculatorFactory<Double>{
    @Override
    public Calculator<Double> createCalculator() {
        return new DoubleCalculatorProxyHandler(new DoubleCalculatorImpl());
    }

//    @Override
//    public PrintCalculator<Double> createPrintCalculator() {
//        return new DoublePrintCalculatorImpl();
//    }
}
