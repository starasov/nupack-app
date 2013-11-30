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
public class PeopleMarkupFinderTest {

    private PeopleMarkupFinder peopleMarkupCalculator;

    @Before
    public void setUp() throws Exception {
        peopleMarkupCalculator = new PeopleMarkupFinder();
    }

    /**
     * Just a miracle :)
     */
    @Test
    public void shouldCorrectlyCalculateMarkupWhenNoPeopleInvolved() {
        Markup result = peopleMarkupCalculator.find(jobWithPeople(0));
        assertBigDecimalEquals(result.getMarkupInPercents(), "0.0");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupWhenSinglePeopleInvolved() {
        Markup result = peopleMarkupCalculator.find(jobWithPeople(1));
        assertBigDecimalEquals(result.getMarkupInPercents(), "1.2");
    }

    @Test
    public void shouldCorrectlyCalculateMarkupWhenMultiplePeopleInvolved() {
        Markup result = peopleMarkupCalculator.find(jobWithPeople(5));
        assertBigDecimalEquals(result.getMarkupInPercents(), "6.0");
    }

    private static Job jobWithPeople(int numberOfPeople) {
        return Job.create(new BigDecimal("100.0"), numberOfPeople, Material.DEFAULT);
    }
}
