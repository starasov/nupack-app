package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Calculator for summary markup value calculation.
 */
public class MarkupCalculator {

    static Markup FLAT_MARKUP = Markup.valueOf("5.0");

    private final List<MarkupFinder> markupFinders;

    public MarkupCalculator(@NotNull List<MarkupFinder> markupFinders) {
        this.markupFinders = markupFinders;
    }

    @NotNull
    public Job calculate(@NotNull Job job) {
        return job.applyMarkup(FLAT_MARKUP).applyMarkup(findAdditionalMarkup(job));
    }

    private Markup findAdditionalMarkup(Job job) {
        Markup summaryMarkup = Markup.valueOf("0.0");

        for (MarkupFinder markupFinder : markupFinders) {
            summaryMarkup = summaryMarkup.add(markupFinder.find(job));
        }

        return summaryMarkup;
    }
}
