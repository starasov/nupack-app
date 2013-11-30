package com.nupack;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static com.nupack.Asserts.assertBigDecimalEquals;

/**
 * User: starasov
 * Date: 11/30/13
 * Time: 12:56 AM
 */
public class MarkupCalculatorTest {

    private MarkupCalculator summaryMarkupCalculator;

    @Before
    public void setUp() throws Exception {
        summaryMarkupCalculator = new MarkupCalculator(Arrays.asList(new MaterialMarkupFinder(), new PeopleMarkupFinder()));
    }

    @Test
    public void shouldAlwaysCalculateFlatMarkup() {
        Job jobWithMarkup = summaryMarkupCalculator.calculate(Job.create("100.0", 0, "any"));
        assertBigDecimalEquals(jobWithMarkup.getPrice(), "105.0");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForJobsWithZeroPrice() {
        Job jobWithMarkup = summaryMarkupCalculator.calculate(Job.create("0.0", 1, "food"));
        assertBigDecimalEquals(jobWithMarkup.getPrice(), "0.0");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForTestInput1() {
        Job jobWithMarkup = summaryMarkupCalculator.calculate(Job.create("1299.99", 3, "food"));
        assertBigDecimalEquals(jobWithMarkup.getPrice(), "1591.58");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForTestInput2() {
        Job jobWithMarkup = summaryMarkupCalculator.calculate(Job.create("5432.00", 1, "drugs"));
        assertBigDecimalEquals(jobWithMarkup.getPrice(), "6199.81");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupForTestInput3() {
        Job jobWithMarkup = summaryMarkupCalculator.calculate(Job.create("12456.95", 4, "books"));
        assertBigDecimalEquals(jobWithMarkup.getPrice(), "13707.63");
    }
}
