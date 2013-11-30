package com.nupack;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

/**
 * Complementary asserts for JUnit
 */
final class Asserts {
    private Asserts() {
    }

    static void assertBigDecimalEquals(BigDecimal actual, BigDecimal expected) {
        assertTrue(actual + " should be equal to " + expected, expected.compareTo(actual) == 0);
    }

    static void assertBigDecimalEquals(BigDecimal actual, String expected) {
        assertTrue(actual + " should be equal to " + expected, actual.compareTo(new BigDecimal(expected)) == 0);
    }
}
