package com.nupack;

import org.junit.Test;

import java.math.BigDecimal;

import static com.nupack.Asserts.assertBigDecimalEquals;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 8:07 AM
 */
public class MarkupTest {

    @Test
    public void shouldCalculateMarkupCorrectly() {
        BigDecimal calculated = Markup.valueOf("10.0").calculate(new BigDecimal("100.0"));
        assertBigDecimalEquals(calculated, "110.0");
    }

    @Test
    public void shouldMultiplyMarkupCorrectlyWhenMultipliedByOne() {
        Markup multiplied = Markup.valueOf("10.0").multiply(1);
        assertBigDecimalEquals(multiplied.getMarkupInPercents(), "10.0");
    }

    @Test
    public void shouldMultiplyMarkupCorrectlyWhenMultipliedByZero() {
        Markup multiplied = Markup.valueOf("10.0").multiply(0);
        assertBigDecimalEquals(multiplied.getMarkupInPercents(), "0.0");
    }

    @Test
    public void shouldMultiplyMarkupCorrectly() {
        Markup multiplied = Markup.valueOf("10.0").multiply(2);
        assertBigDecimalEquals(multiplied.getMarkupInPercents(), "20.0");
    }

    @Test
    public void shouldAddMarkupsCorrectly() {
        Markup totalMarkup = Markup.valueOf("10.0").add(Markup.valueOf("1.1"));
        assertBigDecimalEquals(totalMarkup.getMarkupInPercents(), "11.1");
    }
}
