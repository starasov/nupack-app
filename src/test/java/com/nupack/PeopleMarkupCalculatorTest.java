package com.nupack;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static com.nupack.Asserts.assertBigDecimalEquals;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 12:44 AM
 */
public class PeopleMarkupCalculatorTest {

    private PeopleMarkupCalculator peopleMarkupCalculator;

    @Before
    public void setUp() throws Exception {
        peopleMarkupCalculator = new PeopleMarkupCalculator();
    }

    /**
     * Just a miracle :)
     */
    @Test
    public void shouldCorrectlyCalculateMarkupWhenNoPeopleInvolved() {
        Job result = peopleMarkupCalculator.calculate(new Job(new BigDecimal("100.0"), 0, Material.DEFAULT));
        assertBigDecimalEquals(result.getPrice(), "100.0");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupWhenSinglePeopleInvolved() {
        Job result = peopleMarkupCalculator.calculate(new Job(new BigDecimal("100.0"), 1, Material.DEFAULT));
        assertBigDecimalEquals(result.getPrice(), "101.2");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupWhenMultiplePeopleInvolved() {
        Job result = peopleMarkupCalculator.calculate(new Job(new BigDecimal("100.0"), 5, Material.DEFAULT));
        assertBigDecimalEquals(result.getPrice(), "106.0");
    }
}
