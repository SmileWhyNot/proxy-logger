package org.clevertec.vlad.proxy.v1.fortest.lib;

import java.util.Optional;

public class DoubleCalculatorImpl implements Calculator<Double>{
    @Override
    public Double sum(Double x, Double y) {
        return x + y;
    }

    @Override
    public Double subtract(Double x, Double y) {
        return x - y;
    }

    @Override
    public Double multiply(Double x, Double y) {
        return x * y;
    }

    @Override
    public Double divide(Double x, Double y) {
        return Optional.ofNullable(y)
                .filter(divisor -> divisor != 0)
                .map(divisor -> x / divisor)
                .orElseThrow(() -> new ArithmeticException("Недопустимое деление на 0"));
    }

}
