package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * User: starasov
 * Date: 11/29/13
 * Time: 11:44 PM
 */
public class Job {
    private final BigDecimal basePrice;
    private final int numberOfPeople;
    private final Material material;

    Job(@NotNull BigDecimal basePrice, int numberOfPeople, @NotNull Material material) {
        this.basePrice = basePrice;
        this.numberOfPeople = numberOfPeople;
        this.material = material;
    }
}
