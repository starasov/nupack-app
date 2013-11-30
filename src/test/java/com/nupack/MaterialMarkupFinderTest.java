package com.nupack;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static com.nupack.Asserts.assertBigDecimalEquals;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 12:06 AM
 */
public class MaterialMarkupFinderTest {

    private MaterialMarkupFinder materialMarkupCalculator;

    @Before
    public void setUp() throws Exception {
        materialMarkupCalculator = new MaterialMarkupFinder();
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForDefaultMaterial() {
        Markup result = materialMarkupCalculator.find(jobWithMaterial(Material.DEFAULT));
        assertBigDecimalEquals(result.getMarkupInPercents(), "0.0");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForFood() {
        Markup result = materialMarkupCalculator.find(jobWithMaterial(Material.FOOD));
        assertBigDecimalEquals(result.getMarkupInPercents(), "13.0");
    }

    private static Job jobWithMaterial(Material material) {
        return new Job(new BigDecimal("100.0"), 0, material);
    }
}
