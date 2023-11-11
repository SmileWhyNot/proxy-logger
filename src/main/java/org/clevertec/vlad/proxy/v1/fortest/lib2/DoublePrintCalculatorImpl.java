package org.clevertec.vlad.proxy.v1.fortest.lib2;

public class DoublePrintCalculatorImpl implements PrintCalculator<Double>{
    @Override
    public void sum(Double x, Double y) {
        System.out.println(x + y);
    }

    @Override
    public void subtract(Double x, Double y) {
        System.out.println(x - y);
    }

    @Override
    public void multiply(Double x, Double y) {
        System.out.println(x * y);
    }

    @Override
    public void divide(Double x, Double y) {
        if(y != 0)
            System.out.println(x / y);
    }
}
