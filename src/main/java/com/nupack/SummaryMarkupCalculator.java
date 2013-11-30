package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Aggregate calculator for summary markup value calculation.
 */
public class SummaryMarkupCalculator implements MarkupCalculator {

    private final List<MarkupCalculator> markupCalculators;

    public SummaryMarkupCalculator(List<MarkupCalculator> markupCalculators) {
        this.markupCalculators = markupCalculators;
    }

    @NotNull
    public Job calculate(@NotNull Job job) {
        return null;
    }
}