package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 12:37 AM
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

    @NotNull
    BigDecimal calculate(@NotNull BigDecimal initialPrice) {
        BigDecimal markupMultiplier = markupInPercents.divide(new BigDecimal("100.0"));
        return initialPrice.add(initialPrice.multiply(markupMultiplier));
    }
}
