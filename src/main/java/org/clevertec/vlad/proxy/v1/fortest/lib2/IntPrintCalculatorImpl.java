package org.clevertec.vlad.proxy.v1.fortest.lib2;

public class IntPrintCalculatorImpl implements PrintCalculator<Integer>{
    @Override
    public void sum(Integer x, Integer y) {
        System.out.println(x + y);
    }

    @Override
    public void subtract(Integer x, Integer y) {
        System.out.println(x - y);
    }

    @Override
    public void multiply(Integer x, Integer y) {
        System.out.println(x * y);
    }

    @Override
    public void divide(Integer x, Integer y) {
        if(y != 0)
            System.out.println(x / y);
    }
}
