package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * A markup model
 */
public class Markup {
    private final BigDecimal markupInPercents;

    private Markup(@NotNull BigDecimal markupInPercents) {
        this.markupInPercents = markupInPercents;
    }

    @NotNull
    public static Markup valueOf(@NotNull String percents) {
        return new Markup(new BigDecimal(percents));
    }

    public BigDecimal getMarkupInPercents() {
        return markupInPercents;
    }

    @NotNull
    public BigDecimal calculate(@NotNull BigDecimal initialPrice) {
        BigDecimal markupMultiplier = markupInPercents.movePointLeft(2); // divide markup percents by 100
        return initialPrice.add(initialPrice.multiply(markupMultiplier));
    }

    @NotNull
    public Markup multiply(int times) {
        return new Markup(markupInPercents.multiply(new BigDecimal(times)));
    }

    @NotNull
    public Markup add(@NotNull Markup markup) {
        return new Markup(markupInPercents.add(markup.markupInPercents));
    }
}
