package org.clevertec.vlad.proxy.v1.fortest.lib2;

import org.clevertec.vlad.proxy.v1.Log;

public interface PrintCalculator <T extends Number> {
    @Log
    void sum(T x, T y);
    void subtract(T x, T y);
    @Log
    void multiply(T x, T y);
    void divide(T x, T y);
}
