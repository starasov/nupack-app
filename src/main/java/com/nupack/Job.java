package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A repackaging job
 */
public class Job {
    private final BigDecimal price;
    private final int numberOfPeople;
    private final Material material;

    private Job(@NotNull BigDecimal price, int numberOfPeople, @NotNull Material material) {
        this.price = price;
        this.numberOfPeople = numberOfPeople;
        this.material = material;
    }

    public static Job create(@NotNull BigDecimal price, int numberOfPeople, @NotNull Material material) {
        if (price.doubleValue() < 0) {
            throw new IllegalArgumentException("Job price can't be less than zero.");
        }

        if (numberOfPeople < 0) {
            throw new IllegalArgumentException("Number of people required for Job can't be less than zero.");
        }

        return new Job(price, numberOfPeople, material);
    }

    public static Job create(String price, int numberOfPeople, String materialName) {
        return create(new BigDecimal(price), numberOfPeople, Material.findByName(materialName));
    }

    @NotNull
    public Job applyMarkup(@NotNull Markup markup) {
        BigDecimal newPrice = markup.calculate(price).setScale(2, RoundingMode.HALF_DOWN);
        return new Job(newPrice, numberOfPeople, material);
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
