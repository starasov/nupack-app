package com.nupack;

import org.junit.Test;

import java.math.BigDecimal;

import static com.nupack.Asserts.assertBigDecimalEquals;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 1:37 AM
 */
public class JobTest {

    @Test
    public void applyMarkupShouldRoundUp() {
        Job job = jobWithPrice("1364.9895").applyMarkup(Markup.valueOf("16.6"));
        assertBigDecimalEquals(job.getPrice(), "1591.58");
    }

    @Test
    public void applyMarkupShouldRoundDown() {
        Job job = jobWithPrice("5703.6").applyMarkup(Markup.valueOf("8.7"));
        assertBigDecimalEquals(job.getPrice(), "6199.81");
    }

    private static Job jobWithPrice(String price) {
        return new Job(new BigDecimal(price), 0, Material.DEFAULT);
    }
}