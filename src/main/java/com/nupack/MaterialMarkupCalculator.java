package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * Material markup calculator.
 */
public class MaterialMarkupCalculator implements MarkupCalculator {

    @NotNull
    public Job calculate(@NotNull Job job) {
        Markup materialMarkup = job.getMaterial().getMarkup();
        return job.updatePrice(materialMarkup.calculate(job.getPrice()));
    }
}
