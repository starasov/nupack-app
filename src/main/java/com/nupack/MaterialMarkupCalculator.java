package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * Material markup calculator.
 */
public class MaterialMarkupCalculator implements MarkupCalculator {

    @NotNull
    public Job calculate(@NotNull Job job) {
        Material material = job.getMaterial();
        return job.updatePrice(material.applyMarkup(job.getPrice()));
    }
}
