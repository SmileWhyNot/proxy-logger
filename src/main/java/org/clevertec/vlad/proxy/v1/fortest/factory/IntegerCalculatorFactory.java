package org.clevertec.vlad.proxy.v1.fortest.factory;

import org.clevertec.vlad.proxy.v1.fortest.lib.Calculator;
import org.clevertec.vlad.proxy.v1.fortest.lib.IntCalculatorImpl;
import org.clevertec.vlad.proxy.v1.fortest.lib2.IntPrintCalculatorImpl;
import org.clevertec.vlad.proxy.v1.fortest.lib2.PrintCalculator;

public class IntegerCalculatorFactory implements AbstractCalculatorFactory<Integer>{
    @Override
    public Calculator<Integer> createCalculator() {
        return new IntCalculatorImpl();
    }

//    @Override
//    public PrintCalculator<Integer> createPrintCalculator() {
//        return new IntPrintCalculatorImpl();
//    }
}
