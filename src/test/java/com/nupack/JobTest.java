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

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotBeAbleToCreateJobWithNegativeBasePrice() {
        Job.create("-1.0", 0, "any");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotBeAbleToCreateJobWithNegativeNumberOfPeople() {
        Job.create("1.0", -1, "any");
    }

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
        return Job.create(new BigDecimal(price), 0, Material.DEFAULT);
    }
}
