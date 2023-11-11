package org.clevertec.vlad.proxy.v1.fortest.lib;

import org.clevertec.vlad.proxy.v1.Log;

public interface Calculator<T extends Number> {
    @Log
    T sum(T x, T y);
    T subtract(T x, T y);
    @Log
    T multiply(T x, T y);
    T divide(T x, T y);
}
