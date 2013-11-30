package com.nupack;

import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

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

    public static Job create(String price, int numberOfPeople, String materialName) {
        return new Job(new BigDecimal(price), numberOfPeople, Material.findByName(materialName));
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
