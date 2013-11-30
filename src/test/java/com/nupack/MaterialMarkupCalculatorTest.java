package com.nupack;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
        BigDecimal markup = materialMarkupCalculator.calculate(jobWithDefaultMaterial);
        assertThat(markup, is(new BigDecimal("100.0")));
    }
}
