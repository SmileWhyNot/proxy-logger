package org.clevertec.vlad.proxy.v1.fortest.factory;

import org.clevertec.vlad.proxy.v1.fortest.lib.Calculator;
import org.clevertec.vlad.proxy.v1.fortest.lib2.PrintCalculator;

public interface AbstractCalculatorFactory<T extends Number>{
    Calculator<T> createCalculator();
//    PrintCalculator<T> createPrintCalculator();
}
