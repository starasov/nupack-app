package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

/**
 * User: starasov
 * Date: 11/29/13
 * Time: 11:44 PM
 */
public class Job {
    private final BigDecimal price;
    private final int numberOfPeople;
    private final Material material;

    Job(@NotNull BigDecimal price, int numberOfPeople, @NotNull Material material) {
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.material = material;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public Material getMaterial() {
        return material;
    }
}
