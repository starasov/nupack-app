package com.nupack;

import java.math.BigDecimal;
import java.util.List;

/**
 * Aggregate calculator for summary markup value calculation.
 */
public class SummaryMarkupCalculator implements MarkupCalculator {

    private final List<MarkupCalculator> markupCalculators;

    public SummaryMarkupCalculator(List<MarkupCalculator> markupCalculators) {
        this.markupCalculators = markupCalculators;
    }

    public BigDecimal calculate(Job job) {
        return null;
    }
}
