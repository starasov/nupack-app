package com.nupack;

import org.jetbrains.annotations.NotNull;

/**
 * User: starasov
 * Date: 11/29/13
 * Time: 11:45 PM
 */
public enum Material {
    DEFAULT(Markup.valueOf("0.0")),
    FOOD(Markup.valueOf("13.0")),
    ELECTRONICS(Markup.valueOf("2.0")),
    PHARMACY(Markup.valueOf("7.5"));

    private final Markup markup;

    private Material(@NotNull Markup markup) {
        this.markup = markup;
    }

    @NotNull
    public Markup getMarkup() {
        return markup;
    }
}
