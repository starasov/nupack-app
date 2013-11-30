package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 12:33 AM
 */
public class PeopleMarkupCalculator implements MarkupCalculator {

    static final Markup BASE_MARKUP = Markup.valueOf("1.2");

    @NotNull
    public Job calculate(@NotNull Job job) {
        int numberOfPeople = job.getNumberOfPeople();
        Markup markup = BASE_MARKUP.multiply(numberOfPeople);
        return job.updatePrice(markup.calculate(job.getPrice()));
    }
}
