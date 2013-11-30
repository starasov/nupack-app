package com.nupack;

import java.math.BigDecimal;
import java.util.List;

/**
 * User: starasov
 * Date: 11/29/13
 * Time: 11:47 PM
 */
public class MarkupCalculator {

    private final List<Markup> markups;

    public MarkupCalculator(List<Markup> markups) {
        this.markups = markups;
    }

    BigDecimal calculatePriceFor(Job job) {
        return null;
    }
}
