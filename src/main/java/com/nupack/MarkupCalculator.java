package com.nupack;

import java.math.BigDecimal;

/**
 * Defines generic markup calculation contract.
 */
public interface MarkupCalculator {
    BigDecimal calculate(Job job);
}
