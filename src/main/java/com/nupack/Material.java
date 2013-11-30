package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * User: starasov
 * Date: 11/29/13
 * Time: 11:45 PM
 */
public enum Material {
    DEFAULT(new BigDecimal("0.0")),
    FOOD(new BigDecimal("13.0")),
    ELECTRONICS(new BigDecimal("2.0")),
    PHARMACY(new BigDecimal("7.5"));

    private final BigDecimal markup;

    private Material(@NotNull BigDecimal markup) {
        this.markup = markup;
    }

    @NotNull
    public BigDecimal applyMarkup(@NotNull BigDecimal price) {
        BigDecimal markupMultiplier = markup.divide(new BigDecimal("100.0"));
        return price.add(price.multiply(markupMultiplier));
    }
}
