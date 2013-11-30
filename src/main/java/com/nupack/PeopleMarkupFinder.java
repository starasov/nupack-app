package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 12:33 AM
 */
public class PeopleMarkupFinder implements MarkupFinder {

    static final Markup BASE_MARKUP = Markup.valueOf("1.2");

    @NotNull
    public Markup find(@NotNull Job job) {
        int numberOfPeople = job.getNumberOfPeople();
        return BASE_MARKUP.multiply(numberOfPeople);
    }
}
