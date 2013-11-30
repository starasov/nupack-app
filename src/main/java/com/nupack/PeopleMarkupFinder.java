package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * People markup finder.
 */
public class PeopleMarkupFinder implements MarkupFinder {

    static final Markup BASE_MARKUP = Markup.valueOf("1.2");

    @NotNull
    public Markup find(@NotNull Job job) {
        int numberOfPeople = job.getNumberOfPeople();
        return BASE_MARKUP.multiply(numberOfPeople);
    }
}
