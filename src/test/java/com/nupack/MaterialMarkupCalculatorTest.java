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
public class MaterialMarkupCalculatorTest {

    private MaterialMarkupCalculator materialMarkupCalculator;

    @Before
    public void setUp() throws Exception {
        materialMarkupCalculator = new MaterialMarkupCalculator();
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForDefaultMaterial() {
        Job jobWithDefaultMaterial = new Job(new BigDecimal("100.0"), 0, Material.DEFAULT);
        Job result = materialMarkupCalculator.calculate(jobWithDefaultMaterial);
        assertBigDecimalEquals(result.getPrice(), "100.0");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForFood() {
        Job jobWithDefaultMaterial = new Job(new BigDecimal("100.0"), 0, Material.FOOD);
        Job result = materialMarkupCalculator.calculate(jobWithDefaultMaterial);
        assertBigDecimalEquals(result.getPrice(), "113.0");
    }
}
