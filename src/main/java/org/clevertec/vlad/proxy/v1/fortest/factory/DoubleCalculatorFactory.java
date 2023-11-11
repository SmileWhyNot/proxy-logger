package org.clevertec.vlad.proxy.v1.fortest.factory;

import org.clevertec.vlad.proxy.v1.DoubleCalculatorProxyHandler;
import org.clevertec.vlad.proxy.v1.fortest.lib.Calculator;
import org.clevertec.vlad.proxy.v1.fortest.lib.DoubleCalculatorImpl;
import org.clevertec.vlad.proxy.v1.fortest.lib2.DoublePrintCalculatorImpl;
import org.clevertec.vlad.proxy.v1.fortest.lib2.PrintCalculator;

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
