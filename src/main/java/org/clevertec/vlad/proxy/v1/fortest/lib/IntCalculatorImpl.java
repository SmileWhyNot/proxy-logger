package org.clevertec.vlad.proxy.v1.fortest.lib;

import java.util.Optional;

public class IntCalculatorImpl implements Calculator<Integer>{

    @Override
    public Integer sum(Integer x, Integer y) {
        return x + y;
    }

    @Override
    public Integer subtract(Integer x, Integer y) {
        return x - y;
    }

    @Override
    public Integer multiply(Integer x, Integer y) {
        return x * y;
    }

    @Override
    public Integer divide(Integer x, Integer y) {
        return Optional.ofNullable(y)
                .filter(divisor -> divisor != 0)
                .map(divisor -> x / divisor)
                .orElseThrow(() -> new ArithmeticException("Недопустимое деление на 0"));
    }
}
