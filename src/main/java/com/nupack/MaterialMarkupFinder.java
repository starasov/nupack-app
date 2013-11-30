package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * Material markup calculator.
 */
public class MaterialMarkupFinder implements MarkupFinder {

    @NotNull
    public Markup find(@NotNull Job job) {
        return job.getMaterial().getMarkup();
    }
}
